package ch01;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;
import java.util.List;

/**
 * 동기 HTTP 호출 방식 Retrofit
 */
public class SyncRetrofitExample {
    public static void main(String[] args) {
        // Retrofit 객체 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Retrofit을 사용하여 Service API Interface 구현
        PostService api = retrofit.create(PostService.class);

        // API 호출 - 전체 게시물 가져오기
        Call<List<Post>> call = api.getPosts();
        try {
            List<Post> posts = call.execute().body();
            if (posts != null) {
                for (Post post : posts) {
                    System.out.println(post);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 특정 게시물 가져오기
        Call<Post> call2 = api.getPost(1);
        try {
            Post post = call2.execute().body();
            if (post != null) {
                System.out.println(post);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 애플리케이션 종료
        System.exit(0);
    }
}
