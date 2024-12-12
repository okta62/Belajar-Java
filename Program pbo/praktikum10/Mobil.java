public class Mobil {
    private String tipe;
    private double harga;

    public Mobil(String tipe, double harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getTipe() {
        return tipe;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
