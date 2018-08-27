package org.movie.rental;

import org.movie.rental.domain.Customer;
import org.movie.rental.domain.Movie;
import org.movie.rental.domain.Rental;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class StatementPrinter {


    public static void main(String[] args) {
        StatementPrinter statementPrinter = new StatementPrinter();

        Customer someCustomer = new Customer("Patrick Thompson");

        Collection<Movie> movies = createMovies();
        Vector<Rental> rentals = createRentals(movies);
        rentals.stream().forEach(r -> someCustomer.addRental(r));

        System.out.println(someCustomer.statement());
    }

    private static Collection<Movie> createMovies() {
        Movie movieOne = new Movie("Terminator", Movie.NEW_RELEASE);
        Movie movieTwo = new Movie("Chip and Dale", Movie.CHILDRENS);
        Movie movieThree = new Movie("Tango and Cash", Movie.REGULAR);
        return Arrays.asList(movieOne, movieTwo, movieThree);
    }

    private static Vector<Rental> createRentals(Collection<Movie> movies) {
        Vector<Rental> rentals = new Vector<>();
        movies.stream().forEach(m -> rentals.add(new Rental(m, (int) (Math.random() * 10) + 1)));
        return rentals;
    }
}