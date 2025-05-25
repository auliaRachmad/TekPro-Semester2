public class SoundSystem implements IDevice {
    public void turnOn() {
        System.out.println("Sound System menyala.");
    }
    public void turnOff() {
        System.out.println("Sound System mati.");
    }
    public void setVolume(int volume) {
        System.out.println("Volume Sound System diatur ke: " + volume);
    }
}