package desing.patterns.books;

import desing.patterns.iterator.Iterator;

import java.util.NoSuchElementException;

public class BookIterator implements Iterator<Book> {

    private final Book[] books;
    private int currentIndex;

    BookIterator(Book[] books) {
        this.books = books;
        currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < books.length && books[currentIndex] != null;
    }

    public Book getNext() {
        if (!hasNext()) {
            throw new NoSuchElementException(String.format("There is no a book with " +
                    "index %s!", currentIndex));
        }
        return books[currentIndex++];
    }

}
