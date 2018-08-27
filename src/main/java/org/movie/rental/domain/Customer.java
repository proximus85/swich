package org.movie.rental.domain;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        Enumeration rentals = _rentals.elements();
        String statement = "Rental Record for " + getName() + "\n";

        double totalAmount = 0;
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            totalAmount = rental.getMovie().getTotalAmount(rental, totalAmount);

            //show figures for this rental
            statement += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(totalAmount) + "\n";
            totalAmount += totalAmount;
        }

        //add footer lines
        statement += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        statement += "You earned " + String.valueOf(getFrequentRenterPoints(rentals)) + " frequent renter points";

        return statement;
    }

    private int getFrequentRenterPoints(Enumeration rentals) {
        int frequentRenterPoints = 0;
        while (rentals.hasMoreElements()) {
            Rental rental = (Rental) rentals.nextElement();
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}