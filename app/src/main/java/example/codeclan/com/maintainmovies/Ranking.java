package example.codeclan.com.maintainmovies;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {
    private Movie[] movies;


    public Ranking() {
        this.movies = new Movie[10];
    }

    public void setMovie(Movie movie) {
        this.movies[movie.getRanking() - 1] = movie;
    }

    public Movie getMovieAtRank(int ranking) {
        return this.movies[ranking - 1];
    }
}