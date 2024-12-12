public class Mobil {
    // Attributes of Mobil
    private String merk;
    private String model;
    private int tahun;

    // Constructor
    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    // Getters
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getTahun() {
        return tahun;
    }

    // toString method to display Mobil details
    @Override
    public String toString() {
        return "Mobil{" +
                "merk='" + merk + '\'' +
                ", model='" + model + '\'' +
                ", tahun=" + tahun +
                '}';
    }
}