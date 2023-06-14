package ro.Twitter_app.service;

import ro.Twitter_app.model.DTO.PostDTO;
import ro.Twitter_app.model.DTO.ReplyDTO;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

import java.time.LocalDate;
import java.util.List;

public interface PostService {
    public void createPost(Long userid, String message);
    public List<PostDTO> getOwnPosts(Long userid, LocalDate timestamp);
    public List<PostDTO> getFeed(Long userid);
    public void likePost(Long postid, Long userid);
    public void replyToAPost(ReplyDTO replyDTO);
}
