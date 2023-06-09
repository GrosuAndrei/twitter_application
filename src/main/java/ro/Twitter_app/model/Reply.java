package ro.Twitter_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Data
@Entity
@Table(name="REPLIES")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="reply_id")
    private Long replyId;

    @Column(name="reply_message")
    private String replyMessage;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "reply")
    private List<Like> likes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;
}
