public class Lingkaran {
    // Property jari-jari
    private double jari_jari;
    
    // Property static untuk jumlah lingkaran yang dibuat
    private static int jumlahLingkaran = 0;
    
    // Property phi dengan nilai default 3.14
    private final double phi = 3.14;
    
    // Konstruktor default
    public Lingkaran() {
        this.jari_jari = 0; // Nilai default jari-jari adalah 0
        jumlahLingkaran++;
    }
    
    // Konstruktor dengan parameter jari-jari
    public Lingkaran(double jari_jariBaru) {
        this.jari_jari = jari_jariBaru;
        jumlahLingkaran++;
    }
    
    // Setter untuk jari-jari
    public void setJariJari(double jari_jariBaru) {
        this.jari_jari = jari_jariBaru;
    }
    
    // Getter untuk jari-jari
    public double getJariJari() {
        return this.jari_jari;
    }
    
    // Method untuk menghitung luas lingkaran
    public double getLuas() {
        return phi * jari_jari * jari_jari;
    }
    
    // Method untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * phi * jari_jari;
    }
    
    // Method static untuk mendapatkan jumlah lingkaran yang dibuat
    public static int getJumlahLingkaran() {
        return jumlahLingkaran;
    }
}
