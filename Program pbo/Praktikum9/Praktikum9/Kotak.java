public class Kotak extends ObjekGeometri {
    private double panjang;
    private double lebar;

    public Kotak(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}