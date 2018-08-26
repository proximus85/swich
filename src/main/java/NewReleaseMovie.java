public class NewReleaseMovie extends Movie {

    public NewReleaseMovie(String title, int priceCode) {
        super(title, priceCode);
    }

    @Override
    double getTotalAmount(Rental rental, double totalAmount) {
        totalAmount += rental.getDaysRented() * 3;
        return totalAmount;
    }
}
