public class BridgeDemo {
    public static void main(String[] args) {
        // Menggunakan TV dengan BasicRemote dan AdvancedRemoteControl
        IDevice tv = new TV();
        RemoteControl remoteBasic = new BasicRemote(tv);
        RemoteControl remoteAdvanced = new AdvancedRemoteControl(tv);

        remoteBasic.pressPowerButton();
        ((AdvancedRemoteControl) remoteAdvanced).setVolume(15);

        // Demonstrasi dengan DVD Player
        IDevice dvd = new DVDPlayer();
        RemoteControl remoteDVD = new AdvancedRemoteControl(dvd);
        remoteDVD.pressPowerButton();
        ((AdvancedRemoteControl) remoteDVD).setVolume(10);
    }
}