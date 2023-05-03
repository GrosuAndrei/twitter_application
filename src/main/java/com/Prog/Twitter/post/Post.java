package com.Prog.Twitter.post;

import com.Prog.Twitter.like.Like;
import com.Prog.Twitter.user.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Post {
    private String message;
    private LocalDate postDate;

    private String owner;

    public String getOwner() {
        return owner;
    }

    private List<Like>likes=new ArrayList<Like>();
    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
