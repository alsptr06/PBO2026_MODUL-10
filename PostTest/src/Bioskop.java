import java.util.*;

public class Bioskop {
    
    private Map<String, Film> daftarFilm;

    
    private Map<String, Set<String>> kursiDipesan;

    
    private List<Pesanan> riwayatPesanan;

    public Bioskop() {
        daftarFilm = new HashMap<>();
        kursiDipesan = new HashMap<>();
        riwayatPesanan = new ArrayList<>();
    }


    public void tambahFilm(Film film) {
        daftarFilm.put(film.getKodeFilm(), film);
        kursiDipesan.put(film.getKodeFilm(), new HashSet<>());
        System.out.println("Film ditambahkan: " + film);
    }

    public Film cariFilm(String kodeFilm) {
        return daftarFilm.get(kodeFilm);
    }

    public boolean pesanTiket(String namaPemesan, String kodeFilm, String kodeKursi) {
        Film film = cariFilm(kodeFilm);
        if (film == null) {
            System.out.println("GAGAL: Film dengan kode " + kodeFilm + " tidak ditemukan.");
            return false;
        }

        Set<String> kursiFilmIni = kursiDipesan.get(kodeFilm);
        if (kursiFilmIni.contains(kodeKursi)) {
            System.out.println("GAGAL: Kursi " + kodeKursi + " untuk film " + film.getJudul() + " sudah dipesan.");
            return false;
        }

        kursiFilmIni.add(kodeKursi);
        Pesanan pesanan = new Pesanan(namaPemesan, film, kodeKursi);
        riwayatPesanan.add(pesanan);
        System.out.println(
                "SUKSES: Tiket dipesan oleh " + namaPemesan + " - " + film.getJudul() + " - Kursi " + kodeKursi);
        return true;
    }

    public void tampilkanRiwayat() {
        System.out.println("========== RIWAYAT PEMESANAN TIKET ==========");
        if (riwayatPesanan.isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        System.out.println("No. | Nama Pemesan | Judul Film | Kursi | Harga");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < riwayatPesanan.size(); i++) {
            Pesanan p = riwayatPesanan.get(i);
            System.out.println((i + 1) + "   | " + p.getNamaPemesan() + " | " + p.getFilm().getJudul() + " | " + p.getKodeKursi() + " | Rp" + p.getFilm().getHargaTiket());
        }
        System.out.println("================================================");
    }
}