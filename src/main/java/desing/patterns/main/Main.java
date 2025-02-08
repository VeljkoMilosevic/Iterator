package desing.patterns.main;

import desing.patterns.books.Book;
import desing.patterns.books.BookDepartment;
import desing.patterns.iterator.Iterator;
import desing.patterns.movies.Movie;
import desing.patterns.movies.MovieDepartment;
import desing.patterns.sculptures.Period;
import desing.patterns.sculptures.Sculpture;
import desing.patterns.sculptures.SculptureDepartment;

public class Main {

    public static void main(String[] args) {
        //createAndIterateThroughBooks();
        // createAndIterateThroughMovies();
        createAndIterateThroughSculptures();
    }

    private static void createAndIterateThroughMovies() {
        MovieDepartment movieDepartment = new MovieDepartment();
        registerMovies(movieDepartment);
        iterate(movieDepartment.getIterator());
    }

    private static void createAndIterateThroughSculptures() {
        SculptureDepartment sculptureDepartment = new SculptureDepartment();
        registerSculptures(sculptureDepartment);
        iterate(sculptureDepartment.getIterator());
    }

    private static void createAndIterateThroughBooks() {
        BookDepartment bookDepartment = new BookDepartment();
        registerBooks(bookDepartment);
        iterate(bookDepartment.getIterator());
    }

    private static void registerBooks(BookDepartment bookDepartment) {
        Book designingDataIntensiveApplications = new Book(
                "Designing data-intensive applications",
                "Martin Kleppmann",
                "978-3-16-148410-0", 2017);
        bookDepartment.addBook(designingDataIntensiveApplications);

        Book headFirstDesignPatterns = new Book(
                "Head First Design Patterns",
                "Eric Freeman",
                "978-5-16-148410-1", 2004);
        bookDepartment.addBook(headFirstDesignPatterns);

        Book sqlCookbook = new Book(
                "SQL Cookbook",
                "Anthony Molinaro",
                "978-5-26-148410-8", 2004);
        bookDepartment.addBook(sqlCookbook);
    }

    private static void registerSculptures(SculptureDepartment sculptureDepartment) {
        Sculpture discobolus = new Sculpture(
                "Discobolus",
                "Miron");
        sculptureDepartment.addSculpture(discobolus, Period.ANCIENT_CLASSIC);

        Sculpture theThinker = new Sculpture(
                "The thinker",
                "Rodin");
        sculptureDepartment.addSculpture(theThinker, Period.MODERN);

        Sculpture david = new Sculpture(
                "David",
                "Michelangelo");
        sculptureDepartment.addSculpture(david, Period.RENAISSANCE);
    }

    private static void registerMovies(MovieDepartment movieDepartment) {
        Movie pulpFiction = new Movie(
                "Pulp Fiction",
                "Quentin Tarantino",
                1994);
        movieDepartment.addMovie(pulpFiction);

        Movie goodFellas = new Movie(
                "GoodFellas",
                "Martin Scorcese",
                1990);
        movieDepartment.addMovie(goodFellas);

        Movie seven = new Movie(
                "Seven",
                "David Fincher",
                1995);
        movieDepartment.addMovie(seven);
    }

    private static void iterate(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }
}