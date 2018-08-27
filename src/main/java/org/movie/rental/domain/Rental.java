package org.movie.rental.domain;

import org.movie.rental.domain.Movie;

public class Rental {

    private Movie _Customer_movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _Customer_movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _Customer_movie;
    }
}