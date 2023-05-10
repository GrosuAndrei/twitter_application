package ro.Twitter_app.repository;

import org.springframework.stereotype.Repository;
import ro.Twitter_app.advice.exception.UserNotFoundException;
import ro.Twitter_app.model.User;
import ro.Twitter_app.model.LogIn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.*;

@Repository
public class UserRepository {

    private Map<Integer, User> USERS = new HashMap<>();
    private Integer index = 0;
    private User currentUser;

    public List<User> getAllUsers() {
        return USERS.values().stream().collect(Collectors.toList());
    }

    public void createUser(User user) {
        if(UserExists(user))
        {
            System.out.println("Username existent");
        }
        else {
            user.setId(index);
            USERS.put(index, user);
            index++;
        }
    }

    public void updateUser(Integer id, User user) {
        getUserById(id);
        user.setId(id);
        USERS.put(id, user);
    }

    public void deleteUser(int id) {
        USERS.remove(id);
    }

    public User getUserById(Integer id) {
        User user = USERS.get(id);
        if (Objects.isNull(user)) {
            throw new UserNotFoundException(String.format("User with id %s was not found", id));
        }
        return user;
    }
    public boolean UserExists(User user)
    {
        if(getAllUsers().stream()
                .filter(x->x.getUserName().equals(user.getUserName()))
                .findFirst()
                .orElse(null)!=null)
            return true;
        else
            return false;
    }

    public List<User> getListOfUsersByName(String name)
    {
        return getAllUsers().stream()
                .filter(x->(x.getUserName().equals(name)||(x.getFirstName().equals(name)||(x.getLastName().equals(name)))))
                .collect(Collectors.toList());
    }

    public void autentification(LogIn login)
    {
        User user=getAllUsers().stream()
                .filter(x->(x.getUserName().equals(login.getUserName()) && x.samePassword(login.getPassword())))
                .findFirst()
                .orElse(null);
        if(user!=null)
            currentUser=user;
        else
            System.out.println("autentificare esuata");
    }

    public void follow(String name)
    {
        User user=getAllUsers().stream()
                .filter(x->x.getUserName().equals(name))
                .findFirst()
                .orElse(null);
        if(user!=null)
        {
            if(currentUser.getFollowing().stream()
                    .filter(x->x.getUserName().equals(user.getUserName()))
                    .findFirst()
                    .orElse(null)!=null)
                System.out.println("you already follow this person");
            else
                currentUser.follow(user);
        }
        else
        {
            System.out.println("you are trying to follow an unexistent account");
        }
    }
    public User getCurrentUser()
    {
        return currentUser;
    }
}
