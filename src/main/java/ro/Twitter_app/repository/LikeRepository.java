package ro.Twitter_app.repository;


import org.springframework.stereotype.Repository;
import ro.Twitter_app.model.Like;
import ro.Twitter_app.model.Post;
import ro.Twitter_app.model.User;

@Repository
public class LikeRepository {
    private Post currentPost;
    private User currentUser;

    public void setCurrentPost(Post currentPost) {
        this.currentPost = currentPost;
    }

   public void setCurrentUser(User currentUser)
   {
       this.currentUser=currentUser;
   }

    public void like_a_post()
    {
        Like like=new Like();
        Post post=currentPost;
        like.setId(currentUser.getId());
        post.LikedPost(like);
    }
}
