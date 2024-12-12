public class PersegiPanjangDemo {
    /* Main Method */
    public static void main(String[] args) {
        // Membuat objek persegi panjang dengan panjang=0 dan lebar=0
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();

        // Menampilkan luas dan keliling persegi panjang 1
        System.out.println("Luas persegi panjang 1 = " +
            persegiPanjang1.getPanjang() + " * " + persegiPanjang1.getLebar() + " = " +
            persegiPanjang1.getLuas());

        // Membuat objek persegi panjang dengan panjang=8 dan lebar=5
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(8, 5);

        // Menampilkan luas dan keliling persegi panjang 2
        System.out.println("Luas persegi panjang 2 = " +
            persegiPanjang2.getPanjang() + " * " + persegiPanjang2.getLebar() + " = " +
            persegiPanjang2.getLuas());
    }
}
