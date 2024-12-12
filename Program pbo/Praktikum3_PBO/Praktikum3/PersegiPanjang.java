public class PersegiPanjang {
    // panjang dan lebar dari persegi panjang (private untuk enkapsulasi)
    private int panjang;
    private int lebar;

    // konstruktor default
    public PersegiPanjang() {
        // nilai default panjang dan lebar adalah 0
        this.panjang = 0;
        this.lebar = 0;
    }

    // konstruktor dengan parameter panjang dan lebar
    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    // setter untuk panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    // getter untuk panjang
    public int getPanjang() {
        return this.panjang;
    }

    // setter untuk lebar
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    // getter untuk lebar
    public int getLebar() {
        return this.lebar;
    }

    // mengembalikan nilai luas persegi panjang
    public int getLuas() {
        return this.panjang * this.lebar;
    }

    // mengembalikan nilai keliling persegi panjang
    public int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}
