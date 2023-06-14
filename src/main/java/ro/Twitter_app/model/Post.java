package ro.Twitter_app.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;
import java.util.*;
@Data
@Entity
@Table(name="POSTS")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="post_id", nullable = false)
    private Long postid;

    @Column(name="post_message", nullable = false)
    private String postmessage;

    @Column(name="posted", nullable = false)
    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post")
    private List<Like> likes;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post")
    private List<Reply> replies;
}
