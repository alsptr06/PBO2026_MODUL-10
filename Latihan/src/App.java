import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Anggota> daftarAnggota = new HashSet<>();

        Buku buku1 = new Buku("12345", "Pemrograman Java");
        Buku buku2 = new Buku("67890", "Struktur Data");
        Buku buku3 = new Buku("54321", "Algoritma");

        Anggota anggota1 = new Anggota("A001", "John Doe", "Mahasiswa");
        Anggota anggota2 = new Anggota("A002", "Jane Smith", "Dosen");
        Anggota anggota3 = new Anggota("A001", "John Doe", "Mahasiswa");

        daftarAnggota.add(anggota1);
        daftarAnggota.add(anggota2);
        daftarAnggota.add(anggota3);

        for (Anggota anggota : daftarAnggota) {
            System.out.println("ID Anggota: " + anggota.getIdAnggota() + ", Nama: " + anggota.getNama() + ", Tipe: "
                    + anggota.getTipe());
        }

        System.out.println(" ");
        System.out.println("Mencari buku dengan ISBN 12345: " + Buku.cari("12345"));
        System.out.println("Mencari buku dengan ISBN 67890: " + Buku.cari("67890"));
        System.out.println("Mencari buku dengan ISBN 54321: " + Buku.cari("54321"));

        AntrianPeminjaman.tambah("A001", "12345", "Mahasiswa");
        AntrianPeminjaman.tambah("A003", "67890", "Mahasiswa");
        AntrianPeminjaman.tambah("A002", "54321", "Dosen");
        AntrianPeminjaman.tambah("A004", "12345", "Dosen");

        AntrianPeminjaman.tampilkan();

        ProsesPeminjaman.setDaftarAnggota(daftarAnggota);
        ProsesPeminjaman.prosesSemua();
        ProsesPeminjaman.tampilkanBukuSedangDipinjam();
    }
}