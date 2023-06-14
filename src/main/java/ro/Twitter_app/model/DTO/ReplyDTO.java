package ro.Twitter_app.model.DTO;

import lombok.Data;

@Data
public class ReplyDTO {
    private Long replyid;
    private String message;
    private String username;
    private Long postid;

    public ReplyDTO(Long replyId, String message, String username) {
        this.replyid = replyId;
        this.message = message;
        this.username = username;
    }

    public Long getReplyid() {
        return replyid;
    }

    public String getMessage() {
        return message;
    }


    public String getUsername() {
        return username;
    }

    public Long getPostid() {
        return postid;
    }
}
