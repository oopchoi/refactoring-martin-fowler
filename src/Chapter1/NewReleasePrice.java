package Chapter1;

public class NewReleasePrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int dayRented) {
        return dayRented * 3;
    }

    public int getFrequentRenterPoints(int dayRented) {
        return (dayRented > 1) ? 2: 1;
    }
}
