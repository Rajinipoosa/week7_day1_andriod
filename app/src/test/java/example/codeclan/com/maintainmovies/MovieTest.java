package example.codeclan.com.maintainmovies;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {
    @Test
    public void getTitleTest(){
        Movie movie = new Movie("12 Angry Men", "Drama", 4);
        assertEquals("12 Angry Men", movie.getTitle() );
    }

    @Test
    public void getGenreTest() {
        Movie movie = new Movie("12 Angry Men", "Drama", 4);
        assertEquals("Drama", movie.getGenre());
    }
    @Test
    public void getRankingTest(){
        Movie movie = new Movie("12 Angry Men", "Drama", 4);
        assertEquals(4, movie.getRanking());

    }
    @Test
    public void getStringTest(){
        Movie movie = new Movie("Lord of the rings", "Adventure", 4);
        System.out.println(movie.toString());


    }

}
