package reference;

public enum CoffeeSize {
    SMALL(355),
    MEDIUM(473),
    LARGE(591);

    private final int milliliters;

    CoffeeSize(int milliliters) {
        this.milliliters = milliliters;
    }

    public int getMilliliters() {
        return milliliters;
    }
}
