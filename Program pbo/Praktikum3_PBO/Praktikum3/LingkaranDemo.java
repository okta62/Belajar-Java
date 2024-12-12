public class LingkaranDemo {
    public static void main(String[] args) {
        // Objek pertama tanpa inisialisasi jari-jari
        Lingkaran lingkaran1 = new Lingkaran();
        
        // Objek kedua dengan inisialisasi jari-jari dari setter
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.setJariJari(5); // Menggunakan setter untuk mengatur jari-jari
        
        // Objek ketiga dengan inisialisasi jari-jari dari konstruktor
        Lingkaran lingkaran3 = new Lingkaran(10);
        
        // Menampilkan luas dan keliling dari lingkaran2
        System.out.println("Luas lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling lingkaran 2: " + lingkaran2.getKeliling());
        
        // Menampilkan luas dan keliling dari lingkaran3
        System.out.println("Luas lingkaran 3: " + lingkaran3.getLuas());
        System.out.println("Keliling lingkaran 3: " + lingkaran3.getKeliling());
        
        // Menampilkan jumlah lingkaran yang dibuat
        System.out.println("Jumlah lingkaran yang dibuat: " + Lingkaran.getJumlahLingkaran());
    }
}
