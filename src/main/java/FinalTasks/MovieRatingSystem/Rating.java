package FinalTasks.MovieRatingSystem;

import java.util.ArrayList;
import java.util.List;

public class Rating <T extends Number>{
    private T rating;
    private Movie movie;
    private List<T> ratingList;

    public Rating(Movie movie) {
        //List<Rating>
        this.movie = movie;
        ratingList = new ArrayList<>();
    }

    public T getRating() {
        return rating;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<T> getRatingList() {
        return ratingList;
    }
}
