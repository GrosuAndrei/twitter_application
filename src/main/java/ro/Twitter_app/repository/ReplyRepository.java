package ro.Twitter_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.Reply;
import ro.Twitter_app.model.User;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
