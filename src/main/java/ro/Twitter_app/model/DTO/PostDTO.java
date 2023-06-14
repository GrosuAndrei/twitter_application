package ro.Twitter_app.model.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PostDTO {
    private Long postid;
    private String message;
    private LocalDate date;
    private String username;

    public PostDTO(Long postid, String message, LocalDate date) {
        this.postid = postid;
        this.message = message;
        this.date = date;
    }

    public Long getPostid() {
        return postid;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }
}
