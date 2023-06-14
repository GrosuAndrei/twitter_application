package ro.Twitter_app.service;

import ro.Twitter_app.model.DTO.UserDTO;
import ro.Twitter_app.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public void register(User user);

    public List<UserDTO> search(String name);

    public void follow(String name1, String name2);
}
