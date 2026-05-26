
public class Anggota {
    private String idAnggota;
    private String nama;
    private String tipe;

    public Anggota(String idAnggota, String nama, String tipe) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.tipe = tipe;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
    public String getNama() {
        return nama;
    }
    public String getTipe() {
        return tipe;
    }

    @Override
    public int hashCode() {
        return idAnggota.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Anggota anggota = (Anggota) obj;
        return idAnggota.equals(anggota.idAnggota);
    }

}
