package FinalTasks.MovieRatingSystem;

import java.util.*;
import java.util.stream.Collectors;


public class MovieService {
    private Map<Movie, List<? extends Number>> movieRating;


    public MovieService() {
        this.movieRating = new HashMap<>();

    }

    @Override
    public String toString() {
        return "MovieService{" +
                "movieRating=" + movieRating +
                '}';
    }

    public synchronized <T extends Number> void addRating(Rating <T>rating, T newRating) {
        if (!(newRating.intValue() > 10) && !(newRating.intValue() < 1)) {
            rating.getRatingList().add(newRating);
            movieRating.put(rating.getMovie(), (List<? extends Number>) rating.getRatingList());
        }
    }
    public synchronized Double averageRating(Movie movie) {
        Double average = 0.0;
        try {
           average = movieRating.get(movie).stream()
                    .mapToDouble(rating -> rating.doubleValue())
                    .average()
                   .orElse(0.0);


        } catch (NullPointerException e) {
            System.err.println("No ratings have been added for the movie yet");

        }
        return average;
    }


    public synchronized Map<Movie, Double> averageRatingForAllMovies(){
        Map<Movie, Double> moviesWithAverageRatings = movieRating.entrySet().stream()
                .collect(
                        Collectors.toMap(
                              Map.Entry::getKey, //all movie
                                entry-> entry.getValue().stream()
                                        .mapToDouble(Number::doubleValue)
                                        .average()
                                        .orElse(0.0)


                        )
                );
            return moviesWithAverageRatings;
    }

    //sort movies by average rating
   public synchronized Map<Movie, Double> sortMoviesByAverageRating() {
       return averageRatingForAllMovies() //- get initial map
               .entrySet().stream() //create stream of entrysets
               //sort by comparing primitive double values (av ratings) of entry sets
               .sorted((e1, e2) -> java.lang.Double.compare(e2.getValue().doubleValue(), e1.getValue().doubleValue()))
               .collect(Collectors.toMap( //start collecting back to map
                       Map.Entry::getKey, //take key from entry set
                       Map.Entry::getValue, //take value from entryset
                       (v1, v2) ->v1, //                    (v1, v2) -> v1, // check for conflicts - if two keys are equal - we keep first
                       LinkedHashMap::new
               ));


   }


    public static void main(String[] args) {
        Movie movie = new Movie("Ender's Game", "Nobody", "Sci-Fi");
       // Movie movie1 = new Movie("Capitain", "Nobody", "Thriller");

        MovieService service = new MovieService();
        Rating<Integer> rating = new Rating<>(movie);
       // Rating<Integer> rating1 = new Rating<>(movie1);


        service.addRating( rating, -1);
        //service.addRating( rating, 2);
        //service.addRating( rating, 3);
       // service.addRating( rating1, 2);


        System.out.println(service);
        Double average = service.averageRating(movie);
        System.out.println(average);
       //service.averageRating(movie1);
       //service.averageRatingForAllMovies();
       // Map<Movie, Double> ratings = service.averageRatingForAllMovies();
       // System.out.println(ratings);
        //Map<Movie, Double> sortedMovies=service.sortMoviesByAverageRating();
        //System.out.println(sortedMovies);

    }

}
