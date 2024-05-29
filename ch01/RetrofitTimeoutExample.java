package ch01;

import okhttp3.OkHttpClient;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;
import java.util.List;

/**
 * Retrofit의 OkHttp 클라이언트에 타임아웃을 설정하여
 * 특정 시간 내에 응답이 없으면 예외를 발생시킴
 */
public class RetrofitTimeoutExample {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build();

        // Retrofit 객체 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        System.out.println("Retrofit 객체 생성 완료");

        // API 인터페이스 구현
        PostService api = retrofit.create(PostService.class);
        System.out.println("API 인터페이스 구현 완료");

        // API 호출 - 전체 포스트 가져오기
        Call<List<Post>> call = api.getPosts();
        try {
            System.out.println("전체 포스트 호출 시작");
            List<Post> posts = call.execute().body();
            System.out.println("전체 포스트 호출 완료");

            if (posts != null) {
                for (Post post : posts) {
                    System.out.println(post);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // API 호출 - 특정 포스트 가져오기
        Call<Post> call2 = api.getPost(1);
        try {
            System.out.println("특정 포스트 호출 시작");
            Post post = call2.execute().body();
            System.out.println("특정 포스트 호출 완료");

            if (post != null) {
                System.out.println(post);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 애플리케이션 종료
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}
