package org.movie.rental.domain;

public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getTotalAmount(Rental rental, double totalAmount) {
        totalAmount += rental.getDaysRented() * 3;
        return totalAmount;
    }
}
