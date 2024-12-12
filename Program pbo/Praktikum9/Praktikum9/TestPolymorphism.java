public class TestPolymorphism {
    public static void main(String[] args) {
        // Membuat objek Kotak dan mengatur warna
        Kotak persegi = new Kotak(4, 5); // Misalnya panjang 4 dan lebar 5
        persegi.setColor("Blue");
        System.out.println("Warna kotak: " + persegi.getColor());

        // Membuat objek ObjekGeometri lain dan mengatur warnanya
        ObjekGeometri bentukSem = new ObjekGeometri();
        bentukSem.setColor("Black");

        // Memanggil metode displayObject dengan berbagai objek
        displayObject(persegi);
        displayObject(new Lingkaran(5, "Yellow")); // Menggunakan radius 5
        displayObject(bentukSem);
    }

    // Metode untuk menampilkan informasi objek berdasarkan polimorfisme
    public static void displayObject(ObjekGeometri obj) {
        System.out.println("Warna objek: " + obj.getColor());

        // Memeriksa tipe objek untuk menampilkan informasi khusus
        if (obj instanceof Kotak) {
            Kotak kotak = (Kotak) obj;
            System.out.println("Luas Kotak: " + kotak.getLuas());
            System.out.println("Keliling Kotak: " + kotak.getKeliling());
        } else if (obj instanceof Lingkaran) {
            Lingkaran lingkaran = (Lingkaran) obj;
            System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
            System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());
        } else {
            System.out.println("Objek ini adalah ObjekGeometri umum.");
        }
    }
}
