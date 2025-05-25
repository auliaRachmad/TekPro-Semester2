public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Mengadaptasi panggilan request ke metode specificRequest dari Adaptee
        adaptee.specificRequest();
    }
}