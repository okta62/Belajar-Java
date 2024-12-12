class BangunRuang {
    // Property dengan modifier default
    double jariJari;
    static int jumlahBola = 0;

    // Konstruktor pertama (tanpa parameter)
    BangunRuang() {
        this.jariJari = 3.0; // Nilai default jari-jari
        jumlahBola++; 
    }

    // Konstruktor kedua (dengan parameter)
    BangunRuang(double jariJariBaru) {
        this.jariJari = jariJariBaru;
        jumlahBola++; 
    }

    // Method volume bola
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    // Method luas permukaan bola
    double getLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    // Method static jumlah bola yang dibuat
    static int getJumlahBola() {
        return jumlahBola;
    }

    public static void main(String[] args) {
        // Membuat objek pertama tanpa inisialisasi jariJari
        BangunRuang bola1 = new BangunRuang(); 

        // Membuat objek kedua dengan inisialisasi jariJari dari properti
        BangunRuang bola2 = new BangunRuang();
        bola2.jariJari = 5.0; 
        jumlahBola++; 

        // Membuat objek ketiga inisialisasi jariJari dari konstruktor
        BangunRuang bola3 = new BangunRuang(7.0);

        // Hasil volume dan luas permukaan bola pertama
        System.out.println("Volume bola 1: " + bola1.getVolume());
        System.out.println("Luas permukaan bola 1: " + bola1.getLuasPermukaan());

        // Hasil volume dan luas permukaan bola kedua
        System.out.println("Volume bola 2: " + bola2.getVolume());
        System.out.println("Luas permukaan bola 2: " + bola2.getLuasPermukaan());

        // Hasil volume dan luas permukaan bola ketiga
        System.out.println("Volume bola 3: " + bola3.getVolume());
        System.out.println("Luas permukaan bola 3: " + bola3.getLuasPermukaan());

        // Menampilkan jumlah bola yang telah dibuat
        System.out.println("Jumlah bola yang dibuat: " + BangunRuang.getJumlahBola());
    }
}