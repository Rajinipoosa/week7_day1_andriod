package example.codeclan.com.maintainmovies;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private int ranking;

    public Movie (String title, String genre, int ranking)
    {
        this.title = title;
        this.genre =genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getRanking() {
        return ranking;
    }
     @Override

    public String toString(){
      {

    return "Title: '" + this.title + "', Genre: '" + this.genre + "', Ranking: " + this.ranking + "";
}
  }

}
