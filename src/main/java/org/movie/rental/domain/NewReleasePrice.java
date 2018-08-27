package org.movie.rental.domain;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        int thisAmount = 0;
        thisAmount += daysRented * 3;
        return thisAmount;
    }

    public int getFrequentRentalPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
