public abstract class AbstractPembeli implements Pembeli {
    protected String nama;
    protected Mobil tipeMobil;
    protected int jumlahBeli;

    public AbstractPembeli(String nama, Mobil tipeMobil, int jumlahBeli) {
        this.nama = nama;
        this.tipeMobil = tipeMobil;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public abstract double hitungTotalHarga();
}
