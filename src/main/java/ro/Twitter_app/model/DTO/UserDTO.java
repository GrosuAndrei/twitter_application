package ro.Twitter_app.model.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;

    public UserDTO(Long userId, String userName, String firstName, String lastName, String email)
    {
        this.userId=userId;
        this.userName=userName;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
