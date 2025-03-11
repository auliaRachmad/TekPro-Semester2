import java.util.*;

public class Order {
    private final String orderId;
    private final List<MenuItem> items;
    private boolean isProcessed;

    public Order(String orderId, List<MenuItem> items) {
        this.orderId = orderId;
        this.items = List.copyOf(items); // ✅ Immutable List
        this.isProcessed = false;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public synchronized void processOrder() { // ✅ synchronized untuk keamanan
        if (!isProcessed) {
            isProcessed = true;
            System.out.println("✅ Order " + orderId + " has been processed.");
        } else {
            System.out.println("⚠️ Order " + orderId + " was already processed.");
        }
    }

    @Override
    public String toString() {
        return "Order{id='" + orderId + "', items=" + items + ", processed=" + isProcessed + "}";
    }
}