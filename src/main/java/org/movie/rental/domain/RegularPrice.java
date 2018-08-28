package org.movie.rental.domain;

public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 2) {
            return (daysRented - 2) * 1.5 + 2;
        } else {
            return daysRented + 2;
        }
    }
}
