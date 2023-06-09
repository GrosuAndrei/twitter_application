package ro.Twitter_app.model.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PostDTO {
    private Long postId;
    private String message;
    private LocalDate date;
    private String userName;

    public PostDTO(Long postId, String message, LocalDate date) {
        this.postId = postId;
        this.message = message;
        this.date = date;
    }
    public Long getPostId() {
        return postId;
    }
    public String getMessage() {
        return message;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getUserName() {
        return userName;
    }
}
