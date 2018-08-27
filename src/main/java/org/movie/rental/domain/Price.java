package org.movie.rental.domain;

public abstract class Price {

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    public int getFrequentRentalPoints(int daysRented) {
        return 1;
    }
}
