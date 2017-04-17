package example.codeclan.com.maintainmovies;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 17/04/2017.
 */

  public class RankingTest {

    @Test
    public void setMovie(){
        Movie movie = new Movie("Alice in wonderland", "drama", 1);

        Ranking ranking = new Ranking();

        ranking.setMovie(movie);

        movie = ranking.getMovieAtRank(1);

        assertEquals("Alice in wonderland",movie.getTitle());

     }
//    @Test
//    public void replaceMovieTest(){
//
//        Movie movie1 = new Movie("Alice in wonderland", "drama", 1);
//        Movie movie2 = new Movie("Pokemon", "drama", 2);
//
//
//        Ranking ranking = new Ranking();
//
//        ranking.setMovie(movie1);
//        ranking.setMovie(movie2);
//
//        movie1 = ranking.getMovieAtRank(1);
//
//        System.out.println(movie1);
//    }



}
