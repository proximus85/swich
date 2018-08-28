package org.movie.rental.domain;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRentalPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
