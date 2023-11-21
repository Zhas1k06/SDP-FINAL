package abstractfactory;

public class Pizza implements AbstractFoodItem {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 12.0;
    }
}