package com.Prog.Twitter.user;


import com.Prog.Twitter.post.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private List<User> follows=new ArrayList<User>();
    private List<Post> postari=new ArrayList<Post>();


    public List<User> getFollows() {
        return follows;
    }

    public List<Post> getPostari() {
        return postari;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }

    public boolean equals(Object o)
    {
        if(o instanceof User)
        {
            return (((User)o).username.equals(username));
        }
        else
        {
            return false;
        }
    }
}
