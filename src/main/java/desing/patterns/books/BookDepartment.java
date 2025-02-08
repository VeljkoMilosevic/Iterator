package desing.patterns.books;

import desing.patterns.iterator.Iterator;

public class BookDepartment {
    private final Book[] books;
    private int currIndex;

    public BookDepartment() {
        books = new Book[100];
        currIndex = 0;
    }

    public void addBook(Book book) {
        books[currIndex++] = book;
    }

    public Iterator<Book> getIterator() {
        return new BookIterator(this.books);
    }

}
