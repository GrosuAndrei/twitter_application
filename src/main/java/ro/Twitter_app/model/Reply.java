package ro.Twitter_app.model;

import java.util.ArrayList;

public class Reply {
    private String message;
    private Integer id;
    private ArrayList<Like> likes=new ArrayList<Like>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Like> getLikes() {
        return likes;
    }

}
