package decorator;

public class VegetableDecorator extends FoodDecorator {
    public VegetableDecorator(FoodItem decoratedFoodItem) {
        super(decoratedFoodItem);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Vegetable";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
}