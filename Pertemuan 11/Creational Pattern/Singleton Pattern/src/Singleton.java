public class Singleton implements ISingleton {
    // Variabel instance bersifat volatile untuk memastikan visibilitas antar thread
    private static volatile Singleton instance;

    // Konstruktor privat agar tidak bisa diinstansiasi dari luar
    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}