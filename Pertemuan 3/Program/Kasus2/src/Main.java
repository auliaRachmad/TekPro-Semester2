public class Main {
    public static void main(String[] args) {
        // Buat daftar film yang tersedia
        Film film1 = new Film("Tenki no Ko", 120, "Fantasy");
        Film film2 = new Film("Balatro", 300, "Action");
        Film film3 = new Film("Bungou Stray Dogs", 120, "Action, Fantasy");
        Film film4 = new Film("Jenengmu", 130, "Romance");

        // Tambahkan film ke dalam daftar
        FilmDatabase.tambahFilm(film1);
        FilmDatabase.tambahFilm(film2);
        FilmDatabase.tambahFilm(film3);
        FilmDatabase.tambahFilm(film4);

        // Buat pemesanan tiket
        Pemesanan pemesanan = new Pemesanan();
        pemesanan.pesanTiket("Balatro", "C03", 12, "Zaidan", 19, 50000);
        pemesanan.tampilTiket();
    }
}