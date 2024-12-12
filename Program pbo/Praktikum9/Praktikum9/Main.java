
class Kendaraan {
    protected String nama;
    protected int tahunProduksi;
    protected String platNomor;
    protected String merek;
    protected int bensin; 

    protected static int jumlahKendaraan = 0;

    public Kendaraan(String nama, int tahunProduksi, String platNomor, String merek, int bensin) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        this.platNomor = platNomor;
        this.merek = merek;
        this.bensin = bensin;
        jumlahKendaraan++; // Increment setiap kali objek baru dibuat
    }

    // Metode statis untuk mendapatkan jumlah kendaraan
    public static int getJumlahKendaraan() {
        return jumlahKendaraan;
    }

    // Dynamic Binding Method
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah kendaraan umum.");
        System.out.println("Merek: " + merek + ", Plat Nomor: " + platNomor + ", Bensin: " + bensin + " liter");
    }
}

// Subclass dari Kendaraan
class Mobil extends Kendaraan {
    public Mobil(String nama, int tahunProduksi, String platNomor, String merek, int bensin) {
        super(nama, tahunProduksi, platNomor, merek, bensin);
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah mobil, namanya: " + nama + ", diproduksi tahun: " + tahunProduksi);
        System.out.println("Merek: " + merek + ", Plat Nomor: " + platNomor + ", Bensin: " + bensin + " liter");
    }
}

class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama, int tahunProduksi, String platNomor, String merek, int bensin) {
        super(nama, tahunProduksi, platNomor, merek, bensin);
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah sepeda motor, namanya: " + nama + ", diproduksi tahun: " + tahunProduksi);
        System.out.println("Merek: " + merek + ", Plat Nomor: " + platNomor + ", Bensin: " + bensin + " liter");
    }
}

// Subclass dari Kendaraan dan superclass dari Truk dan Bus
class MobilBerat extends Kendaraan {
    public MobilBerat(String nama, int tahunProduksi, String platNomor, String merek, int bensin) {
        super(nama, tahunProduksi, platNomor, merek, bensin);
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah mobil berat, namanya: " + nama + ", diproduksi tahun: " + tahunProduksi);
        System.out.println("Merek: " + merek + ", Plat Nomor: " + platNomor + ", Bensin: " + bensin + " liter");
    }
}

// Subclass dari MobilBerat
class Truk extends MobilBerat {
    private int kapasitasMuatan;

    public Truk(String nama, int tahunProduksi, String platNomor, String merek, int bensin, int kapasitasMuatan) {
        super(nama, tahunProduksi, platNomor, merek, bensin);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah truk, namanya: " + nama + ", diproduksi tahun: " + tahunProduksi);
        System.out.println("Merek: " + merek + ", Plat Nomor: " + platNomor + ", Bensin: " + bensin + " liter");
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " ton");
    }
}

class Bus extends MobilBerat {
    private int kapasitasPenumpang;

    public Bus(String nama, int tahunProduksi, String platNomor, String merek, int bensin, int kapasitasPenumpang) {
        super(nama, tahunProduksi, platNomor, merek, bensin);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void deskripsiKendaraan() {
        System.out.println("Ini adalah bus, namanya: " + nama + ", diproduksi tahun: " + tahunProduksi);
        System.out.println("Merek: " + merek + ", Plat Nomor: " + platNomor + ", Bensin: " + bensin + " liter");
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
    }
}

// Main Class untuk menguji Dynamic Binding dan properti statis
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil("Avanza", 2022, "B 1234 XYZ", "Toyota", 40);
        Kendaraan kendaraan2 = new SepedaMotor("Vario", 2021, "D 5678 ABC", "Honda", 5);
        Kendaraan kendaraan3 = new Truk("Fuso", 2020, "F 9012 DEF", "Mitsubishi", 80, 15);
        Kendaraan kendaraan4 = new Bus("Transjakarta", 2019, "B 3456 GHI", "Mercedes", 60, 50);

        // Dynamic Binding - memanggil metode deskripsiKendaraan() sesuai dengan tipe objek aktual
        kendaraan1.deskripsiKendaraan(); // Output untuk Mobil
        kendaraan2.deskripsiKendaraan(); // Output untuk SepedaMotor
        kendaraan3.deskripsiKendaraan(); // Output untuk Truk
        kendaraan4.deskripsiKendaraan(); // Output untuk Bus

        // Menampilkan jumlah kendaraan yang telah dibuat
        System.out.println("Jumlah kendaraan yang telah dibuat: " + Kendaraan.getJumlahKendaraan());
    }
}
