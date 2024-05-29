package ch01;

import lombok.Getter;
import lombok.Setter;

/**
 * 게시물 데이터 모델 클래스
 */
@Getter
@Setter
public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    @Override
    public String toString() {
        // 동적 문자열 생성
        String dataTemplate =
                """
                Post{
                  userId=%d
                , id=%d
                , title=%s
                , body=%s
                }
                """.formatted(userId,id,title,body);
        return dataTemplate;
    }
}
