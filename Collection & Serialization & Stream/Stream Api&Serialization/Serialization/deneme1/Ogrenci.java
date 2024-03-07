import java.io.Serializable;

class Ogrenci implements Serializable {
    String ad;
    int yas;
    transient double notOrtalamasi; // Transient anahtar kelimesi, serileştirme işlemi sırasında dışarıya aktarılmamasını sağlar

    public Ogrenci(String ad, int yas, double notOrtalamasi) {
        this.ad = ad;
        this.yas = yas;
        this.notOrtalamasi = notOrtalamasi;
    }
}