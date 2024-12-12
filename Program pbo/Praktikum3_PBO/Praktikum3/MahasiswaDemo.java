public class MahasiswaDemo {
    public static void main(String[] args) {
        // Membuat objek mahasiswa menggunakan konstruktor default
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.cetak();
        
        // Membuat objek mahasiswa menggunakan konstruktor dengan NIM
        Mahasiswa mahasiswa2 = new Mahasiswa("123456");
        mahasiswa2.cetak();
        
        // Membuat objek mahasiswa menggunakan konstruktor dengan semua parameter
        Mahasiswa mahasiswa3 = new Mahasiswa("654321", "John Doe", "Jalan Merdeka 10", 3.75);
        mahasiswa3.cetak();
    }
}
