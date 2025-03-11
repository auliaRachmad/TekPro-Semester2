import java.util.*;
import java.util.concurrent.*;

public class Restaurant {
    private final List<MenuItem> menu = new ArrayList<>();


    private final ConcurrentHashMap<String, Order> activeOrders = new ConcurrentHashMap<>();

    public void addMenuItem(String name, double price) {
        menu.add(new MenuItem(name, price)); // ✅ Menggunakan record
    }

    public void placeOrder(String orderId, List<MenuItem> items) {
        Order order = new Order(orderId, items);
        activeOrders.put(orderId, order);
        System.out.println("📌 Order placed: " + order);
    }

    public Optional<Order> findOrder(String orderId) {
        return Optional.ofNullable(activeOrders.get(orderId));
    }

    public void processOrder(String orderId) {
        findOrder(orderId).ifPresent(Order::processOrder);
    }

    public void printMenu() {
        System.out.println("📜 Menu:");
        for (MenuItem item : menu) {
            System.out.println("- " + item.name() + " ($" + item.price() + ")");
        }
    }
}