package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user){

        List<Post> postForUser = new ArrayList<>();

        for (Post post : posts){
            if (post.getOwner().equals(user) && (post.getPublishedAt().isBefore(LocalDate.now()))
            && (!post.getContent().isEmpty()) && (!post.getTitle().isEmpty())){
                postForUser.add(post);
            }
        }
        return postForUser;
    }
}
