import java.util.ArrayList;

public class FilmDatabase {
    private static ArrayList<Film> daftarFilm = new ArrayList<>();

    public static void tambahFilm(Film film) {
        daftarFilm.add(film);
    }

    public static Film cariFilm(String judul) {
        for (Film film : daftarFilm) {
            if (film.getJudul().equalsIgnoreCase(judul)) {
                return film;
            }
        }
        return null;
    }
}