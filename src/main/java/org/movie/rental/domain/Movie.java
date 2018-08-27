package org.movie.rental.domain;

public abstract class Movie {

    private String _title;
    private int _priceCode;

    public Movie(String title) {
        _title = title;
    }

    public abstract double getTotalAmount(Rental rental, double totalAmount);

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }
}