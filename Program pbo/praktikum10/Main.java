public class Main {
    public static void main(String[] args) {
        // Inisialisasi sistem
        SistemJualBeli sistem = new SistemJualBeli();

        // Menambahkan data karyawan
        Karyawan karyawan1 = new Karyawan("John Doe");
        sistem.tambahKaryawan(karyawan1);

        // Menambahkan data mobil
        Mobil sedan = new Mobil("Sedan", 200_000_000);
        Mobil minibus = new Mobil("Minibus", 250_000_000);
        sistem.tambahMobil(sedan);
        sistem.tambahMobil(minibus);

        // Membuat transaksi untuk pembeli individu
        PembeliIndividu pembeli1 = new PembeliIndividu("Okta", sedan, 1);
        Transaksi transaksi1 = sistem.buatTransaksi(pembeli1, karyawan1);

        // Membuat transaksi untuk pembeli borongan
        PembeliBorongan pembeli2 = new PembeliBorongan("Bob", minibus, 3);
        Transaksi transaksi2 = sistem.buatTransaksi(pembeli2, karyawan1);

        // Menampilkan hasil transaksi
        for (Transaksi transaksi : sistem.getDaftarTransaksi()) {
            System.out.println("Pembeli: " + transaksi.getPembeli().getNama());
            System.out.println("Total Harga: " + transaksi.getTotalHarga());
        }

        // Menampilkan keuntungan karyawan
        System.out.println("Keuntungan Karyawan " + karyawan1.getNama() + ": " + karyawan1.getKeuntungan());
    }
}
