// singleton/OrderManager.java
package singleton;

import model.Book;
import model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private static OrderManager instance;
    private List<Order> orders = new ArrayList<>();

    private OrderManager() {}

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void createOrder(List<Book> items, String buyer) {
        Order order = new Order(items, buyer);
        orders.add(order);
        Logger.getInstance().log("Created order for " + buyer);
        order.printReceipt();
    }

    public List<Order> getOrders() {
        return orders;
    }
}
