package ro.Twitter_app.model.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private Long userid;
    private String username;
    private String firstname;
    private String lastname;
    private String email;

    public UserDTO(Long userid, String username, String firstname, String lastname, String email)
    {
        this.userid=userid;
        this.username=username;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
    }

    public Long getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }
}
