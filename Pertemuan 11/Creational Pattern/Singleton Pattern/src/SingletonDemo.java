public class SingletonDemo {
    public static void main(String[] args) {
        ISingleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}