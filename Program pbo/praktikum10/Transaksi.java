public class Transaksi {
    private AbstractPembeli pembeli;
    private Karyawan karyawan;
    private double totalHarga;

    public Transaksi(AbstractPembeli pembeli, Karyawan karyawan) {
        this.pembeli = pembeli;
        this.karyawan = karyawan;
        this.totalHarga = pembeli.hitungTotalHarga();
        this.karyawan.tambahKeuntungan(this.totalHarga);
    }

    public double getTotalHarga() {
        return totalHarga;
    }
    
    public AbstractPembeli getPembeli() {
        return pembeli;
    }
}

