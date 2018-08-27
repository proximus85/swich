package org.movie.rental.domain;

public class RegularMovie extends Movie {

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getTotalAmount(Rental rental, double totalAmount) {
        totalAmount += 2;
        if (rental.getDaysRented() > 2) {
            totalAmount += (rental.getDaysRented() - 2) * 1.5;
        }
        return totalAmount;
    }
}