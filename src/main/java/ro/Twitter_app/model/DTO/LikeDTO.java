package ro.Twitter_app.model.DTO;

import lombok.Data;

@Data
public class LikeDTO {
    private Long likeId;
    private String userName;
    private Long postId;

    public LikeDTO(Long likeId, String userName) {
        this.likeId = likeId;
        this.userName=userName;
    }

    public Long getLikeId() {
        return likeId;
    }

    public Long getPostId() {
        return postId;
    }

    public String getUserName() {
        return userName;
    }
}
