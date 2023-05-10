package ro.Twitter_app.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Post {
    private String message;
    private LocalDate date;
    private Integer UserId;
    private ArrayList<Like> likes=new ArrayList<Like>();

    private ArrayList<Reply> replies=new ArrayList<Reply>();
    public ArrayList<Like> getLikes() {
        return likes;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "message='" + message + '\'' +
                ", date=" + date +
                ", UserId=" + UserId +
                ", likes=" + likes +
                '}';
    }

    public ArrayList<Reply> getReplies() {
        return replies;
    }

    public void LikedPost(Like like)
    {
        likes.add(like);
    }
    public void replyedPost(Reply reply)
    {
        replies.add(reply);
    }

}
