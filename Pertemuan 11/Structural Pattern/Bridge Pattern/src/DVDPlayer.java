public class DVDPlayer implements IDevice {
    public void turnOn() {
        System.out.println("DVD Player menyala.");
    }
    public void turnOff() {
        System.out.println("DVD Player mati.");
    }
    public void setVolume(int volume) {
        System.out.println("Volume DVD Player diatur ke: " + volume);
    }
}