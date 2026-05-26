import java.util.HashMap;
import java.util.Map;
public class Buku {

    static Map<String, Buku> collection = new HashMap<>();

    String ISBN;
    String judul;

    public Buku(String ISBN, String judul) {
        this.ISBN = ISBN;
        this.judul = judul;
        collection.put(ISBN, this);
    }

    public static Buku cari(String isbn) {
        return collection.get(isbn);
    }
    
    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Judul: " + judul;
    }

  
}
