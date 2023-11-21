package observer;

public class Customer implements OrderObserver {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String status) {
        System.out.println("Customer " + customerName + ": Order status - " + status);
    }
}