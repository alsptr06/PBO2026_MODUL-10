import java.util.LinkedList;

public class AntrianPeminjaman {

    static LinkedList<String> antrian = new LinkedList<>();

    public static void tambah(String idAnggota, String isbn, String tipe) {
        String data = idAnggota + "#" + isbn;

        if (tipe.equalsIgnoreCase("Dosen")) {
            antrian.addFirst(data);
        } else {
            antrian.addLast(data);
        }
    }

    public static String proses() {
        if (antrian.isEmpty())
            return null;
        return antrian.removeFirst();
    }

    public static void tampilkan() {
        System.out.println("\n=== ANTRIAN ===");
        int no = 1;
        for (String item : antrian) {
            System.out.println(no++ + ". " + item);
        }
    }

    
}