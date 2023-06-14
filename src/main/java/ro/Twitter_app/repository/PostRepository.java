package ro.Twitter_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findPostsByUser(User user);
}
