package com.Prog.Twitter.like;

import com.Prog.Twitter.user.User;
import org.springframework.stereotype.Component;

@Component
public class Like {
    private User person;

    public User getOwner() {
        return person;
    }
}
