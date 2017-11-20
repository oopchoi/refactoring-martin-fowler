package Chapter1;

abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int dayRented);
    public int getFrequentRenterPoints(int dayRented) {
        return 1;
    }
}
