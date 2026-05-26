public class Film {
    private String kodeFilm;
    private String judul;
    private double hargaTiket;

    public Film(String kodeFilm, String judul, double hargaTiket) {
        this.kodeFilm = kodeFilm;
        this.judul = judul;
        this.hargaTiket = hargaTiket;
    }

    public String getKodeFilm() {
        return kodeFilm;
    }

    public String getJudul() {
        return judul;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    @Override
    public String toString() {
        return judul + " (" + kodeFilm + ") - Rp" + hargaTiket;
    }
}