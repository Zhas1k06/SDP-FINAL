package decorator;

public abstract class FoodDecorator implements FoodItem {
    protected FoodItem decoratedFoodItem;

    public FoodDecorator(FoodItem decoratedFoodItem) {
        this.decoratedFoodItem = decoratedFoodItem;
    }

    @Override
    public String getDescription() {
        return decoratedFoodItem.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedFoodItem.getPrice();
    }
}