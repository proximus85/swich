package org.movie.rental.domain;

public class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 3) {
            return (daysRented - 3) * 1.5 + 1.5;
        } else {
            return daysRented + 1.5;
        }
    }
}
