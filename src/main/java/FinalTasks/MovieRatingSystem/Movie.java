package FinalTasks.MovieRatingSystem;

public class Movie {
    private String name;
    private String director;
    private String type;

    public Movie(String name, String director, String type) {
        this.name = name;
        this.director = director;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
