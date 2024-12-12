public class PersegiPanjang2 {
    // Panjang dan lebar dari persegi panjang (diatur private untuk enkapsulasi)
    private int panjang;
    private int lebar;

    // Variabel static untuk menghitung jumlah objek yang dibuat
    private static int jumlahObjek = 0;

    // Konstruktor default yang menambah jumlah objek
    public PersegiPanjang2() {
        this.panjang = 0;
        this.lebar = 0;
        jumlahObjek++;
    }

    // Konstruktor dengan parameter panjang dan lebar yang menambah jumlah objek
    public PersegiPanjang2(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        jumlahObjek++;
    }

    // Mengembalikan jumlah objek yang telah dibuat
    public static int getJumlahObjek() {
        return jumlahObjek;
    }

    // Mengembalikan nilai luas persegi panjang
    public int getLuas() {
        return panjang * lebar;
    }

    // Mengembalikan nilai keliling persegi panjang
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
    
    // Setter untuk panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // Setter untuk lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Getter untuk panjang
    public int getPanjang() {
        return this.panjang;
    }

    // Getter untuk lebar
    public int getLebar() {
        return this.lebar;
    }
}
