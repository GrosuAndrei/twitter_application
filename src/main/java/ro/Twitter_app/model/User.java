package ro.Twitter_app.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.*;
@Data
@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id", nullable = false)
    private Long userId;

    @Column(name="user_name", nullable = false, unique = true)
    private String userName;

    @Column(name="first_name", nullable = false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    private List<User> following;

    @OneToMany(fetch = FetchType.EAGER)
    private List<User> followers;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Post> posts;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Reply> replies;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private List<Like> likes;
}