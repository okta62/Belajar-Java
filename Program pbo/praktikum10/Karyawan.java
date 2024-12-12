public class Karyawan {
    private String nama;
    private double keuntungan = 0;

    public Karyawan(String nama) {
        this.nama = nama;
    }

    public void tambahKeuntungan(double jumlah) {
        this.keuntungan += jumlah * 0.1; // Karyawan mendapatkan 10% dari total transaksi
    }

    public double getKeuntungan() {
        return keuntungan;
    }

    public String getNama() {
        return nama;
    }
}
