public class Film {
    private String judul;
    private int durasi;
    private String genre;

    public Film(String judul, int durasi, String genre) {
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }

    public String getGenre() {
        return genre;
    }
}