public class TV implements IDevice{
    public void turnOn() {
        System.out.println("TV menyala.");
    }
    public void turnOff() {
        System.out.println("TV mati.");
    }
    public void setVolume(int volume) {
        System.out.println("Volume TV diatur ke: " + volume);
    }
}