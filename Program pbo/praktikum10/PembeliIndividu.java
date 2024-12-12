public class PembeliIndividu extends AbstractPembeli {
    public PembeliIndividu(String nama, Mobil tipeMobil, int jumlahBeli) {
        super(nama, tipeMobil, jumlahBeli);
    }

    @Override
    public double hitungTotalHarga() {
        return tipeMobil.getHarga() * jumlahBeli;
    }
}

