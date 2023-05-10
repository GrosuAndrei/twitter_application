package ro.Twitter_app.service;

import ro.Twitter_app.model.LogIn;
import ro.Twitter_app.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAllUsers();
    public List<User> getListOfUsersByName(String name);

    User getUserById(Integer id);

    void registerUser(User user);

    void updateUser(Integer id, User user);

    void patchUser(Integer id, Map<String, String> partialUser);

    void deleteUser(Integer id);
    public void follow(String name);

    public void signIn(LogIn login);
    public User getCurrentUser();

}
