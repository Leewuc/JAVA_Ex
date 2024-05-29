package ch01;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;

/**
 * 비동기 HTTP 호출 방식 Retrofit
 */
public class AsyncRetrofitExample {
    // 비동기 호출 수
    private static int pendingCalls = 1;

    public static void main(String[] args) {

        // Retrofit 객체 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Retrofit을 사용하여 Service API Interface 구현
        PostService api = retrofit.create(PostService.class);

//        // API 호출 - 전체 포스트 가져오기 (비동기)
//        Call<List<Post>> call = api.getPosts();
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//                if (response.isSuccessful()) {
//                    List<Post> posts = response.body();
//                    if (posts != null) {
//                        for (Post post : posts) {
//                            System.out.println(post);
//                        }
//                    }
//                } else {
//                    System.out.println("응답 실패: " + response.code());
//                    switch (response.code()) {
//                        case 404:
//                            System.out.println("리소스를 찾을 수 없습니다.");
//                            break;
//                        case 500:
//                            System.out.println("서버 오류가 발생했습니다.");
//                            break;
//                        default:
//                            System.out.println("알 수 없는 오류가 발생했습니다.");
//                            break;
//                    }
//                }
//                checkAndExit();
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//                t.printStackTrace();
//                checkAndExit();
//            }
//        });

        // API 호출 - 특정 포스트 가져오기 (비동기)
        Call<Post> call2 = api.getPost(2);
        call2.enqueue(new Callback<Post>() {
            // 메서드는 요청이 성공적으로 완료되었을 때 호출
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                // 응답의 성공 여부를 확인
                if (response.isSuccessful()) {
                    Post post = response.body();
                    if (post != null) {
                        System.out.println(post);
                    }
                } else {
                    // 응답 코드에 따른 처리
                    System.out.println("응답 실패: " + response.code());
                    switch (response.code()) {
                        case 404:
                            System.out.println("리소스를 찾을 수 없습니다.");
                            break;
                        case 500:
                            System.out.println("서버 오류가 발생했습니다.");
                            break;
                        default:
                            System.out.println("알 수 없는 오류가 발생했습니다.");
                            break;
                    }
                }
                checkAndExit();
            }

            // 메서드는 요청이 실패했을 때 호출
            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                // Throwable t 객체를 통해 오류 원인을 확인할 수 있음
                // 네트워크 오류 확인
                if (t instanceof IOException) {
                    System.out.println("네트워크 오류가 발생했습니다.");
                } else {
                    System.out.println("알 수 없는 오류가 발생했습니다.");
                }
                t.printStackTrace();
                checkAndExit();
            }
        });
    }

    /**
     * 비동기 메서드의 모든 호출이 완료되면 프로그램이 종료되도록 함
     */
    private static synchronized void checkAndExit() {
        pendingCalls--;
        if (pendingCalls == 0) {
            System.exit(0);
        }
    }
}
