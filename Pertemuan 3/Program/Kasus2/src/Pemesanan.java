public class Pemesanan {
    private Film film;
    private Pelanggan pelanggan;
    private Ticket ticket;

    public void pesanTiket(String judulFilm, String nomorKursi, int jamTayang, String namaPelanggan, int umurPelanggan, double harga) {
        Film filmDipesan = FilmDatabase.cariFilm(judulFilm);
        if (filmDipesan == null) {
            System.out.println("Film tidak tersedia.");
            return;
        }

        this.film = filmDipesan;
        this.pelanggan = new Pelanggan(namaPelanggan, umurPelanggan);
        this.ticket = new Ticket(nomorKursi, jamTayang, harga);
    }

    public void tampilTiket() {
        if (film == null || pelanggan == null || ticket == null) {
            System.out.println("Belum ada pemesanan.");
            return;
        }

        System.out.println("===== Tiket Pemesanan =====");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Umur Pelanggan: " + pelanggan.getUmur());
        System.out.println("Judul Film: " + film.getJudul());
        System.out.println("Genre: " + film.getGenre());
        System.out.println("Durasi: " + film.getDurasi() + " menit");
        System.out.println("Jam Tayang: " + ticket.getJamTayang() + " WIB");
        System.out.println("Nomor Kursi: " + ticket.getNomorKursi());
        System.out.println("Harga Tiket: Rp" + ticket.getHarga());
    }
}