public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(IDevice device) {
        super(device);
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}