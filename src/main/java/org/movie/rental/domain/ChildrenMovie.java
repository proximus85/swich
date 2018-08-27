package org.movie.rental.domain;

public class ChildrenMovie extends Movie {

    public ChildrenMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    public double getTotalAmount(Rental rental, double totalAmount) {
        totalAmount += 1.5;
        if (rental.getDaysRented() > 3) {
            totalAmount += (rental.getDaysRented() - 3) * 1.5;
        }
        return totalAmount;
    }
}
