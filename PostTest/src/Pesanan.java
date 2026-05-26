public class Pesanan {
    private String namaPemesan;
    private Film film;
    private String kodeKursi;

    public Pesanan(String namaPemesan, Film film, String kodeKursi) {
        this.namaPemesan = namaPemesan;
        this.film = film;
        this.kodeKursi = kodeKursi;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public Film getFilm() {
        return film;
    }

    public String getKodeKursi() {
        return kodeKursi;
    }

    @Override
    public String toString() {
        return namaPemesan + " | " + film.getJudul() + " | Kursi " + kodeKursi + " | Rp" + film.getHargaTiket();
    }
}
