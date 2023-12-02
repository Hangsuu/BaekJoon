package reference;

public class Test {
	public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.SMALL;
        System.out.println("Size: " + coffeeSize.name());
        System.out.println("Milliliters: " + coffeeSize.getMilliliters());
        System.out.println(coffeeSize);
        System.out.println(coffeeSize.ordinal());
	}
}