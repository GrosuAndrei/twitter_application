package ro.Twitter_app.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="LIKES")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long likeId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="reply_id")
    private User reply;

}
