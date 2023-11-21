package observer;

import java.util.ArrayList;
import java.util.List;
public class CustomerOrderSubject implements OrderSubject {
    private List<OrderObserver> observers = new ArrayList<>();
    private String orderStatus;

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status) {
        orderStatus = status;
        for (OrderObserver observer : observers) {
            observer.update(orderStatus);
        }
    }
}