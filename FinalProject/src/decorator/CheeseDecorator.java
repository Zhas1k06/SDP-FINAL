package decorator;

public class CheeseDecorator extends FoodDecorator {
    public CheeseDecorator(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2.0;
    }
}