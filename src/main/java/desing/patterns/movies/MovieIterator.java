package desing.patterns.movies;

import desing.patterns.iterator.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class MovieIterator implements Iterator<Movie> {
    private final List<Movie> movies;
    private int index;

    MovieIterator(final List<Movie> movies) {
        this.movies = movies;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < movies.size();
    }

    @Override
    public Movie getNext() {
        if (hasNext()) {
            return movies.get(index++);
        }
        throw new NoSuchElementException("No more movies to iterate" +
                " over!");
    }
}
