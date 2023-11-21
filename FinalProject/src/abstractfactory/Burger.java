package abstractfactory;

public class Burger implements AbstractFoodItem {
    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getPrice() {
        return 8.0;
    }
}