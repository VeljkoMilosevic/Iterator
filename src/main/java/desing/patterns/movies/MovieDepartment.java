package desing.patterns.movies;

import desing.patterns.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MovieDepartment {
    private final List<Movie> movies;

    public MovieDepartment() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public Iterator<Movie> getIterator() {
        return new MovieIterator(movies);
    }
}
