public class PiramidaDemo {
    public static void main(String[] args) {
        // Membuat objek piramida dengan tinggi 10 dan luas alas 20
        Piramida piramida1 = new Piramida(10, 20);
        
        // Menampilkan informasi piramida
        piramida1.tampilInfo();
        
        // Menghitung luas permukaan dengan panjang sisi miring 15
        double sisiMiring = 15;
        double luasPermukaan = piramida1.getLuasPermukaan(sisiMiring);
        System.out.println("Luas Permukaan Piramida: " + luasPermukaan);
        
        // Mengupdate tinggi dan luas alas
        piramida1.setTinggi(12);
        piramida1.setLuasAlas(25);
        
        // Menampilkan informasi piramida yang telah diperbarui
        System.out.println("\nSetelah pembaruan:");
        piramida1.tampilInfo();
    }
}
