import java.util.*;
public class OrderQueueManager {
    private final Queue<Order> orderQueue = new LinkedList<>();

    public void addOrder(Order order) {
        orderQueue.offer(order);
        System.out.println("Order added: " + order.getOrderId());
    }

    public Optional<Order> processNextOrder() {
        Order nextOrder = orderQueue.poll();
        if (nextOrder != null) {
            nextOrder.processOrder();
            return Optional.of(nextOrder);
        }
        return Optional.empty();
    }
}
