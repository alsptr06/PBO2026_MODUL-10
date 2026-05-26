public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   SISTEM MANAJEMEN PEMESANAN TIKET");
        System.out.println("        BIOSKOP INDEPENDEN");
        System.out.println("========================================");

        Bioskop bioskop = new Bioskop();

        System.out.println("--- MENAMBAHKAN FILM KE JADWAL ---");
        bioskop.tambahFilm(new Film("F01", "Avengers: Endgame", 50000));
        bioskop.tambahFilm(new Film("F02", "Spider-Man: No Way Home", 45000));
        bioskop.tambahFilm(new Film("F03", "The Batman", 40000));
        System.out.println();

        System.out.println("--- PROSES PEMESANAN TIKET ---");

        bioskop.pesanTiket("Andi", "F01", "A1");
        bioskop.pesanTiket("Budi", "F01", "B2");
        bioskop.pesanTiket("Citra", "F02", "A1");
        bioskop.pesanTiket("Dedi", "F01", "A1");
        bioskop.pesanTiket("Eka", "F03", "C3");
        bioskop.pesanTiket("Fani", "F99", "A1");
        bioskop.pesanTiket("Gilang", "F02", "B4");

        bioskop.tampilkanRiwayat();

        System.out.println("Program selesai.");
    }
}