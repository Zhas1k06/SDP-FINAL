package adapter;

public class OnlineFoodOrderAdapter implements OnlineFoodOrder {
    private LegacyFoodOrderSystem legacyFoodOrderSystem;

    public OnlineFoodOrderAdapter(LegacyFoodOrderSystem legacyFoodOrderSystem) {
        this.legacyFoodOrderSystem = legacyFoodOrderSystem;
    }

    @Override
    public void addToCart(String foodItem, int quantity) {
        legacyFoodOrderSystem.placeOrder(foodItem, quantity);
    }

    @Override
    public void placeOrder() {
        // Дополнительные действия при размещении заказа в новой системе.
    }
}
