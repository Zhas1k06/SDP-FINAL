package decorator;

public class ConcreteFoodItem implements FoodItem {
    @Override
    public String getDescription() {
        return "Basic Food Item";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}