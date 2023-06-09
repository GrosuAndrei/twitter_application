package ro.Twitter_app.model.DTO;

import lombok.Data;

@Data
public class ReplyDTO {
    private Long replyId;
    private String message;
    private String userName;
    private Long postId;

    public ReplyDTO(Long replyId, String message, String userName) {
        this.replyId = replyId;
        this.message = message;
        this.userName = userName;
    }

    public Long getReplyId() {
        return replyId;
    }

    public String getMessage() {
        return message;
    }

    public String getUserName() {
        return userName;
    }

    public Long getPostId() {
        return postId;
    }
}
