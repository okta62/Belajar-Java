public class Mahasiswa {
    // Properti untuk menyimpan data mahasiswa
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;
    
    // Konstruktor default
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.alamat = "";
        this.ipk = 0.0;
    }
    
    // Konstruktor dengan parameter NIM
    public Mahasiswa(String nim) {
        this.nim = nim;
        this.nama = "";
        this.alamat = "";
        this.ipk = 0.0;
    }
    
    // Konstruktor dengan semua parameter
    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
    }
    
    // Method untuk menentukan predikat berdasarkan IPK
    public String predikat(double ipk) {
        if (ipk >= 3.50) {
            return "Cum Laude";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else if (ipk >= 2.50) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
    
    // Method untuk mencetak informasi mahasiswa
    public void cetak() {
        System.out.println("NIM     : " + this.nim);
        System.out.println("Nama    : " + this.nama);
        System.out.println("Alamat  : " + this.alamat);
        System.out.println("IPK     : " + this.ipk);
        System.out.println("Predikat: " + predikat(this.ipk));
    }
}
