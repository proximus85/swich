package org.movie.rental;

import org.movie.rental.domain.*;

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
        Movie movieOne = new NewReleaseMovie("Terminator");
        Movie movieTwo = new ChildrenMovie("Chip and Dale");
        Movie movieThree = new RegularMovie("Tango and Cash");
        return Arrays.asList(movieOne, movieTwo, movieThree);
    }

    private static Vector<Rental> createRentals(Collection<Movie> movies) {
        Vector<Rental> rentals = new Vector<>();
        movies.stream().forEach(m -> rentals.add(new Rental(m, (int) (Math.random() * 10) + 1)));
        return rentals;
    }
}