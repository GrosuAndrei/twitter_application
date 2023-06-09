package ro.Twitter_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.Twitter_app.advice.exception.UserNotFoundException;
import ro.Twitter_app.model.User;

import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUserName(String userName);


}
