package abstractfactory.foodfactories;

import abstractfactory.AbstractFoodItem;
import abstractfactory.FoodFactory;
import abstractfactory.FoodItem;
import abstractfactory.Pizza;

public class PizzaFactory implements FoodFactory {
    @Override
    public AbstractFoodItem createFoodItem() {
        return new Pizza();
    }
}