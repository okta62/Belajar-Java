public class Lingkaran extends ObjekGeometri {
    private double jariJari;

    public Lingkaran(double jariJari, String color) {
        this.jariJari = jariJari;
        setColor(color); // Mengatur warna menggunakan metode setColor
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }
}