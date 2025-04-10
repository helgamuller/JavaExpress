package FinalTasks.MovieRatingSystem;

import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.Map;

public class MovieRatingSystemTestSetup {
    public MovieService movieService;
    public Rating<Integer> rating;
    public Map<Movie, List<? extends Number>> movieRating;
    public Movie movie;

    @BeforeEach
    public void setupTest(){
        movieService = new MovieService();
        movie = new Movie("Silo", "NoName", "SciFi");
        rating = new Rating<>(movie);
    }

}
