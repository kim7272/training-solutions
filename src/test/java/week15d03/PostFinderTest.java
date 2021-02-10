package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void findPostsFor() {

        Post post_1 = new Post("Invitation", LocalDate.of(2020,02,25),"abrakada","Laci");
        Post post_2 = new Post("", LocalDate.of(2020,03,25),"abrakada","Laci");
        Post post_3 = new Post("Claim", LocalDate.of(2020,04,22),"","Laci");
        Post post_4 = new Post("Blackmail", LocalDate.of(2021,04,22),"irgumburgum","Laci");
        Post post_5 = new Post("Urgent", LocalDate.of(2020,05,19),"ingyombingyom","Laci");
        Post post_6 = new Post("Warning", LocalDate.of(2020,06,15),"etyepetye","Feri");
        Post post_7 = new Post("Ad", LocalDate.of(2020,07,12),"woa","Józsi");

        List<Post> posts = Arrays.asList(post_1, post_2, post_3, post_4, post_5, post_6, post_7);

        String actual = new PostFinder(posts).findPostsFor("Laci").toString();
        String expected = Arrays.asList(post_1, post_5).toString();

        assertEquals(expected, actual);

    }
}