// Interface untuk Hewan
interface Hewan {
    void bernapas();
    boolean isHidup();
}

// Interface untuk kemampuan terbang
interface BisaTerbang {
    void bisaTerbang(boolean status);
    boolean isTerbang();
}

// Kelas Ayam yang mengimplementasikan interface Hewan dan BisaTerbang
public class Ayam implements Hewan, BisaTerbang {
    private boolean terbang = false; // status kemampuan terbang
    private boolean hidup = true;    // status hidup

    @Override
    public void bernapas() {
        System.out.println("Aku bernapas");
    }

    @Override
    public boolean isHidup() {
        return hidup;
    }

    @Override
    public void bisaTerbang(boolean status) {
        this.terbang = status; // Mengatur apakah ayam bisa terbang
    }

    @Override
    public boolean isTerbang() {
        return terbang; // Mengembalikan status terbang
    }

    public static void main(String[] args) {
        // Membuat objek Ayam
        Ayam kutuk = new Ayam();

        // Mengatur apakah ayam bisa terbang
        kutuk.bisaTerbang(true);  

        // Mencetak apakah ayam bisa terbang
        System.out.println("Apakah bisa terbang: " + kutuk.isTerbang());

        // Memanggil metode bernapas
        kutuk.bernapas();  

        // Mencetak apakah ayam hidup
        System.out.println("Apakah benda hidup: " + kutuk.isHidup());
    }
}
