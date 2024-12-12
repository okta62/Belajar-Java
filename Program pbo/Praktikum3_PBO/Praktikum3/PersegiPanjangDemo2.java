public class PersegiPanjangDemo2 {
    /* Main Method */
    public static void main(String[] args) {
        // Sebelum membuat objek
        System.out.println("Sebelum membuat objek");

        // Memanggil variabel static untuk jumlah objek
        System.out.println("Jumlah objek = " + PersegiPanjang2.getJumlahObjek());

        // Membuat objek persegiPanjang1
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("\nSetelah membuat objek persegiPanjang1");

        // Memanggil variabel instance menggunakan getter
        System.out.println("Panjang = " + persegiPanjang1.getPanjang() + 
                           "\nLebar = " + persegiPanjang1.getLebar());

        // Memanggil method static untuk jumlah objek
        System.out.println("Jumlah objek = " + PersegiPanjang2.getJumlahObjek());

        // Membuat objek persegiPanjang2
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(8, 5);
        System.out.println("\nSetelah membuat objek persegiPanjang2");

        // Memanggil variabel instance menggunakan getter
        System.out.println("Panjang = " + persegiPanjang2.getPanjang() + 
                           "\nLebar = " + persegiPanjang2.getLebar());

        // Memanggil method static untuk jumlah objek
        System.out.println("Jumlah objek = " + PersegiPanjang2.getJumlahObjek());
    }
}
