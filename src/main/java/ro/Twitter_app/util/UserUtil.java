package ro.Twitter_app.util;

import org.springframework.stereotype.Component;
import ro.Twitter_app.model.User;

import java.util.Map;

@Component
public class UserUtil {

    public void patchUser(User user, Map<String, String> partialUser) {
        String userName = partialUser.get("userName");
        String firstName = partialUser.get("firstName");
        String lastName = partialUser.get("lastName");
        String email = partialUser.get("email");
        String password = partialUser.get("password");
        if(userName !=null)
        {
            user.setUsername(userName);
        }
        if (firstName != null) {
            user.setFirstname(firstName);
        }
        if (lastName != null) {
            user.setLastname(lastName);
        }
        if (email != null) {
            user.setEmail(email);
        }
        if (password != null) {
            user.setPassword(password);
        }
    }

}
