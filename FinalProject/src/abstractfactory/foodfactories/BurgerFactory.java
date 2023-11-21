package abstractfactory.foodfactories;

import abstractfactory.AbstractFoodItem;
import abstractfactory.Burger;
import abstractfactory.FoodFactory;
import abstractfactory.FoodItem;

public class BurgerFactory implements FoodFactory {
    @Override
    public AbstractFoodItem createFoodItem() {
        return new Burger();
    }
}