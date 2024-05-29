package ch01;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import java.util.List;

/**
 * Retrofit 인터페이스 정의
 * 호출할 API를 Java 인터페이스로 정의함
 */
public interface PostService {
    // 모든 게시물을 가져오는 API 호출
    @GET("posts")
    Call<List<Post>> getPosts();

    // 특정 id의 게시물을 가져오는 API
    @GET("posts/{id}")
    Call<Post> getPost(@Path("id") int id);
}
