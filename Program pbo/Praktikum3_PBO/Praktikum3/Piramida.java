public class Piramida {
    // Properti untuk tinggi dan luas alas piramida
    private double tinggi;
    private double luasAlas;
    
    // Konstruktor dengan parameter
    public Piramida(double tinggi, double luasAlas) {
        this.tinggi = tinggi;
        this.luasAlas = luasAlas;
    }
    
    // Konstruktor tanpa parameter (opsional, bisa diatur dengan nilai default)
    public Piramida() {
        this.tinggi = 0;
        this.luasAlas = 0;
    }
    
    // Setter untuk tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Setter untuk luas alas
    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }

    // Getter untuk luas alas
    public double getLuasAlas() {
        return luasAlas;
    }

    // Mengembalikan volume piramida
    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    // Mengembalikan luas permukaan piramida (mengasumsikan piramida segitiga dengan alas berbentuk segitiga)
    // Untuk luas permukaan, kita butuh panjang sisi miring (slant height), misalkan disediakan oleh parameter tambahan
    public double getLuasPermukaan(double sisiMiring) {
        return luasAlas + (sisiMiring * Math.sqrt(luasAlas / 2)); // Approximation for a triangular base
    }

    // Menampilkan informasi piramida
    public void tampilInfo() {
        System.out.println("Tinggi Piramida: " + tinggi);
        System.out.println("Luas Alas Piramida: " + luasAlas);
        System.out.println("Volume Piramida: " + getVolume());
    }
}
