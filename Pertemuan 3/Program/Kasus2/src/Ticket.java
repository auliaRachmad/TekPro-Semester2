public class Ticket {
    private String nomorKursi;
    private int jamTayang;
    private double harga;

    public Ticket(String nomorKursi, int jamTayang, double harga) {
        this.nomorKursi = nomorKursi;
        this.jamTayang = jamTayang;
        this.harga = harga;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public int getJamTayang() {
        return jamTayang;
    }

    public double getHarga() {
        return harga;
    }
}
