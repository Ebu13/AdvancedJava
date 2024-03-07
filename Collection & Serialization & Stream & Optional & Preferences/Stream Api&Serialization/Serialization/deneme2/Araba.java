import java.io.Serializable;

class Araba implements Serializable {
    private static final long serialVersionUID = 1L;
    private String marka;
    private String model;
    private transient int uretimYili; // Transient olarak işaretlenen alan serileştirilmez

    public Araba(String marka, String model, int uretimYili) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    @Override
    public String toString() {
        return "Araba [marka=" + marka + ", model=" + model + ", uretimYili=" + uretimYili + "]";
    }
}