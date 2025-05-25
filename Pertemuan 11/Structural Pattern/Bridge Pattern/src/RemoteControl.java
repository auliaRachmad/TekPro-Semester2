public abstract class RemoteControl {
    protected IDevice device;

    public RemoteControl(IDevice device) {
        this.device = device;
    }

    public void pressPowerButton() {
        System.out.println("Remote: Tombol power ditekan.");
        // Logika tambahan bisa ditambahkan di sini (misalnya toggle on/off)
    }
}