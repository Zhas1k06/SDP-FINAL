package adapter;

public interface OnlineFoodOrder {
    void addToCart(String foodItem, int quantity);

    void placeOrder();
}
