import java.util.ArrayList;

public class SistemJualBeli {
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    private ArrayList<Mobil> daftarMobil = new ArrayList<>();
    private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public Transaksi buatTransaksi(AbstractPembeli pembeli, Karyawan karyawan) {
        Transaksi transaksi = new Transaksi(pembeli, karyawan);
        daftarTransaksi.add(transaksi);
        return transaksi;
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }
}

