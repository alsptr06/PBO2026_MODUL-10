public class App {
    public static void main(String[] args) throws Exception {
        SistemGudang gudang = new SistemGudang();
        gudang.tambahBarangBaru("B01", "Laptop", "Elektronik", 10);
        gudang.tambahBarangBaru("B02", "Meja", "Furniture", 5);
        gudang.tambahBarangBaru("B03", "Kursi", "Furniture", 8);

        gudang.tambahStok("B01", 5);

        gudang.kurangiStok("B02", 2);

        gudang.kurangiStok("B03", 15);

        gudang.cetakLaporan();
    }
}
