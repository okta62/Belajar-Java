// Abstract class Person
abstract class Person {
    protected String nama;
    protected String alamat;
    protected String noTelepon;

    public Person(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public String getInfo() {
        return "Nama: " + nama + ", Alamat: " + alamat + ", No. Telepon: " + noTelepon;
    }
}

// Class Karyawan
class Karyawan extends Person {
    private String idKaryawan;
    private float keuntungan;

    public Karyawan(String idKaryawan, String nama, String alamat, String noTelepon) {
        super(nama, alamat, noTelepon);
        this.idKaryawan = idKaryawan;
        this.keuntungan = 0;
    }

    public void tambahHargaMobil(Mobil mobil, int harga) {
        mobil.setHargaPerUnit(harga);
    }

    public void lihatDataPembeli(Pembeli pembeli) {
        System.out.println("Data Pembeli: " + pembeli.getInfo());
    }

    public void hitungKeuntungan(float totalHargaTerbayar) {
        this.keuntungan += totalHargaTerbayar * 0.1;
    }

    public float getKeuntungan() {
        return keuntungan;
    }
}

// Abstract class Pembeli
abstract class Pembeli extends Person {
    protected String idPembeli;

    public Pembeli(String idPembeli, String nama, String alamat, String noTelepon) {
        super(nama, alamat, noTelepon);
        this.idPembeli = idPembeli;
    }

    public abstract void beliMobil(Mobil mobil, int jumlah);
}

// Class PembeliIndividu
class PembeliIndividu extends Pembeli {
    private String nomorKTP;

    public PembeliIndividu(String idPembeli, String nama, String alamat, String noTelepon, String nomorKTP) {
        super(idPembeli, nama, alamat, noTelepon);
        this.nomorKTP = nomorKTP;
    }

    @Override
    public void beliMobil(Mobil mobil, int jumlah) {
        System.out.println("Pembeli Individu membeli " + jumlah + " unit " + mobil.getTipeMobil());
    }
}

// Class PembeliBorongan
class PembeliBorongan extends Pembeli {
    private String nomorPerusahaan;
    private String namaPerusahaan;

    public PembeliBorongan(String idPembeli, String nama, String alamat, String noTelepon, String nomorPerusahaan, String namaPerusahaan) {
        super(idPembeli, nama, alamat, noTelepon);
        this.nomorPerusahaan = nomorPerusahaan;
        this.namaPerusahaan = namaPerusahaan;
    }

    @Override
    public void beliMobil(Mobil mobil, int jumlah) {
        System.out.println("Pembeli Borongan membeli " + jumlah + " unit " + mobil.getTipeMobil());
    }
}

// Class Mobil
class Mobil {
    private String tipeMobil;
    private int hargaPerUnit;

    public Mobil(String tipeMobil) {
        this.tipeMobil = tipeMobil;
        this.hargaPerUnit = 0; // Harga awal diatur oleh karyawan
    }

    public String getTipeMobil() {
        return tipeMobil;
    }

    public void setHargaPerUnit(int harga) {
        this.hargaPerUnit = harga;
    }

    public int getTotalHarga(int jumlah) {
        return hargaPerUnit * jumlah;
    }
}

// Class Transaksi
class Transaksi {
    private String idTransaksi;
    private Pembeli pembeli;
    private Mobil mobil;
    private int jumlah;
    private int totalHarga;

    public Transaksi(String idTransaksi, Pembeli pembeli, Mobil mobil, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.pembeli = pembeli;
        this.mobil = mobil;
        this.jumlah = jumlah;
        this.totalHarga = mobil.getTotalHarga(jumlah);
    }

    public void prosesPembelian() {
        System.out.println("Transaksi ID: " + idTransaksi);
        System.out.println("Pembeli: " + pembeli.getInfo());
        System.out.println("Mobil: " + mobil.getTipeMobil() + " x" + jumlah);
        System.out.println("Total Harga: " + totalHarga);
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}