package org.movie.rental.domain;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private Price price;

    private String _title;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                price = new RegularPrice();
                break;
            case Movie.NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case Movie.CHILDRENS:
                price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("movie type not supported.");
        }
    }

    public String getTitle() {
        return _title;
    }

    public int getFrequentRentalPoints(int daysRented) {
        return price.getFrequentRentalPoints(daysRented);
    }
}