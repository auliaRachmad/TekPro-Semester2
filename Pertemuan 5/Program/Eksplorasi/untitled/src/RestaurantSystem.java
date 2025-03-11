import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class RestaurantSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // ✅ Tambahkan menu
        restaurant.addMenuItem("Burger", 5.99);
        restaurant.addMenuItem("Pizza", 8.99);
        restaurant.addMenuItem("Pasta", 7.49);

        restaurant.printMenu(); // ✅ Cetak menu restoran

        // ✅ Buat pesanan
        restaurant.placeOrder("ORD001", List.of(new MenuItem("Burger", 5.99), new MenuItem("Pizza", 8.99)));
        restaurant.placeOrder("ORD002", List.of(new MenuItem("Pasta", 7.49)));

        // ✅ Simulasikan Multi-threading: banyak karyawan memproses pesanan bersamaan
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> restaurant.processOrder("ORD001"));
        executor.submit(() -> restaurant.processOrder("ORD002"));
        executor.submit(() -> restaurant.processOrder("ORD001")); // ⚠️ Harus dicegah agar tidak diproses dua kali

        executor.shutdown();
    }
}
