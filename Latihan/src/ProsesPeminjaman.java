import java.util.*;

public class ProsesPeminjaman {

    static Map<String, String> bukuSedangDipinjam = new HashMap<>();

    static Set<Anggota> daftarAnggota;

    public static void setDaftarAnggota(Set<Anggota> daftar) {
        daftarAnggota = daftar;
    }

    public static boolean cekAnggotaTerdaftar(String idAnggota) {
        for (Anggota a : daftarAnggota) {
            if (a.getIdAnggota().equals(idAnggota)) {
                return true;
            }
        }
        return false;
    }

    public static boolean cekBukuTersedia(String isbn) {
        return Buku.cari(isbn) != null;
    }

    public static boolean cekBukuBelumDipinjam(String isbn) {
        return !bukuSedangDipinjam.containsKey(isbn);
    }

    public static void prosesSemua() {
        String data;
        while ((data = AntrianPeminjaman.proses()) != null) {
            String[] parts = data.split("#");
            String idAnggota = parts[0];
            String isbn = parts[1];

            if (!cekAnggotaTerdaftar(idAnggota)) {
                System.out.println("GAGAL: Anggota " + idAnggota + " tidak terdaftar");
                continue;
            }

            if (!cekBukuTersedia(isbn)) {
                System.out.println("GAGAL: Buku ISBN " + isbn + " tidak ada di katalog");
                continue;
            }

            if (!cekBukuBelumDipinjam(isbn)) {
                System.out
                        .println("GAGAL: Buku ISBN " + isbn + " sedang dipinjam oleh " + bukuSedangDipinjam.get(isbn));
                continue;
            }

            bukuSedangDipinjam.put(isbn, idAnggota);
            System.out.println("BERHASIL: " + idAnggota + " meminjam buku ISBN " + isbn);
        }
    }

    public static void tampilkanBukuSedangDipinjam() {
        System.out.println("=== BUKU SEDANG DIPINJAM ===");
        for (Map.Entry<String, String> entry : bukuSedangDipinjam.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + " | Dipinjam oleh: " + entry.getValue());
        }
    }
}