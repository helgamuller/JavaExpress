package FinalTasks.MovieRatingSystem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MovieRatingSystemTest extends MovieRatingSystemTestSetup {
    /**
     * addRating test
     * Positive cases:
     * newRating = 3 - >added
     * Corner cases:
     * newRating = 10 - >added
     * newRating = 1- >added
     * Negative cases:
     * newRating = 11 - > not added
     * newRating = -1 - >not added
     */

    @ParameterizedTest
    @ValueSource(ints = {3, 10, 1})
    @DisplayName("user Can Add Valid Rating To Movie")
    public void userCanAddValidRatingToMovie(int newRating) {
        int initialSize = rating.getRatingList().size();
        movieService.addRating(rating, newRating);

        assertEquals(initialSize + 1, rating.getRatingList().size());

    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 11})
    @DisplayName("user Can NOT Add InValid Rating To Movie")
    public void userCanNotAddInValidRatingToMovie(int newRating) {
        int initialSize = rating.getRatingList().size();
        movieService.addRating(rating, newRating);

        assertEquals(initialSize, rating.getRatingList().size());

    }

    /**
     * averageRating for movie
     * positive cases:
     * Rating 1 = 10, rating 2 = 5 ->7.5
     * negative cases:
     * no ratings ->0.0
     */

    @Test
    @DisplayName("User can count average rating for selected movie")
    public void userCanCountAverageRatingForSelectedMovie() {
        movieService.addRating(rating, 3);
        movieService.addRating(rating, 2);
        Double actualResult = movieService.averageRating(movie);
        assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("User can Not count average rating for selected movie")
    public void userCanNotCountAverageRatingForSelectedMovie() {
        Double actualResult = movieService.averageRating(movie);
        assertEquals(0.0, actualResult);

    }
}
