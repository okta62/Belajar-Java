public class PembeliBorongan extends AbstractPembeli {
    public PembeliBorongan(String nama, Mobil tipeMobil, int jumlahBeli) {
        super(nama, tipeMobil, jumlahBeli);
    }

    @Override
    public double hitungTotalHarga() {
        return tipeMobil.getHarga() * jumlahBeli * 0.95; // Diskon 5%
    }
}
