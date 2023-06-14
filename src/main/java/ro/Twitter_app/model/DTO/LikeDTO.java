package ro.Twitter_app.model.DTO;

import lombok.Data;

@Data
public class LikeDTO {
    private Long likeid;
    private String username;
    private Long postid;

    public LikeDTO(Long likeid, String username) {
        this.likeid = likeid;
        this.username=username;
    }


    public Long getLikeid() {
        return likeid;
    }

    public String getUsername() {
        return username;
    }

    public Long getPostid() {
        return postid;
    }
}
