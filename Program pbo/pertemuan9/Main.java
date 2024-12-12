// Superclass
class Kendaraan {
    protected String nama;
    protected int tahunProduksi;

    public Kendaraan(String nama, int tahunProduksi) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }

    // Dynamic Binding Method
    public void jenisKendaraan() {
        System.out.println("Ini adalah kendaraan umum.");
    }

    // Static Binding Method
    public static void infoKendaraan() {
        System.out.println("Info: Ini adalah kelas Kendaraan.");
    }
}

// Subclass dari Kendaraan
class Mobil extends Kendaraan {
    public Mobil(String nama, int tahunProduksi) {
        super(nama, tahunProduksi);
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah mobil.");
    }

    public static void infoKendaraan() {
        System.out.println("Info: Ini adalah kelas Mobil.");
    }
}

class SepedaMotor extends Kendaraan {
    public SepedaMotor(String nama, int tahunProduksi) {
        super(nama, tahunProduksi);
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah sepeda motor.");
    }

    public static void infoKendaraan() {
        System.out.println("Info: Ini adalah kelas SepedaMotor.");
    }
}

// Subclass dari Kendaraan dan superclass dari Truk dan Bus
class MobilBerat extends Kendaraan {
    public MobilBerat(String nama, int tahunProduksi) {
        super(nama, tahunProduksi);
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah mobil berat.");
    }

    public static void infoKendaraan() {
        System.out.println("Info: Ini adalah kelas MobilBerat.");
    }
}

// Subclass dari MobilBerat
class Truk extends MobilBerat {
    private int kapasitasMuatan;

    public Truk(String nama, int tahunProduksi, int kapasitasMuatan) {
        super(nama, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah truk dengan kapasitas muatan " + kapasitasMuatan + " ton.");
    }

    public static void infoKendaraan() {
        System.out.println("Info: Ini adalah kelas Truk.");
    }
}

class Bus extends MobilBerat {
    private int kapasitasPenumpang;

    public Bus(String nama, int tahunProduksi, int kapasitasPenumpang) {
        super(nama, tahunProduksi);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public void jenisKendaraan() {
        System.out.println("Ini adalah bus dengan kapasitas penumpang " + kapasitasPenumpang + " orang.");
    }

    public static void infoKendaraan() {
        System.out.println("Info: Ini adalah kelas Bus.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil("Toyota", 2022);
        Kendaraan kendaraan2 = new SepedaMotor("Honda", 2021);
        Kendaraan kendaraan3 = new Truk("Truk Volvo", 2020, 15);
        Kendaraan kendaraan4 = new Bus("Bus Mercedes", 2019, 50);

        // Dynamic Binding - calls overridden methods based on object type
        kendaraan1.jenisKendaraan(); // Output: Ini adalah mobil.
        kendaraan2.jenisKendaraan(); // Output: Ini adalah sepeda motor.
        kendaraan3.jenisKendaraan(); // Output: Ini adalah truk dengan kapasitas muatan 15 ton.
        kendaraan4.jenisKendaraan(); // Output: Ini adalah bus dengan kapasitas penumpang 50 orang.

        // Static Binding - calls methods based on reference type
        Kendaraan.infoKendaraan();  // Output: Info: Ini adalah kelas Kendaraan.
        Mobil.infoKendaraan();      // Output: Info: Ini adalah kelas Mobil.
        SepedaMotor.infoKendaraan(); // Output: Info: Ini adalah kelas SepedaMotor.
        Truk.infoKendaraan();       // Output: Info: Ini adalah kelas Truk.
        Bus.infoKendaraan();        // Output: Info: Ini adalah kelas Bus.

        // Static Binding with superclass reference pointing to subclass object
        kendaraan1.infoKendaraan();  // Output: Info: Ini adalah kelas Kendaraan.
        kendaraan2.infoKendaraan();  // Output: Info: Ini adalah kelas Kendaraan.
        kendaraan3.infoKendaraan();  // Output: Info: Ini adalah kelas Kendaraan.
        kendaraan4.infoKendaraan();  // Output: Info: Ini adalah kelas Kendaraan.
    }
}