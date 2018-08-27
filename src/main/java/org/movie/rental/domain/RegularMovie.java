package org.movie.rental.domain;

public class RegularMovie extends Movie {

    public RegularMovie(String title, int priceCode) {
        super(title, priceCode);
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