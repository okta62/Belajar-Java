// Abstract class Hewan
public abstract class Hewan {
    private boolean terbang = false;

    // Setter untuk menentukan apakah hewan bisa terbang
    public void setBisaTerbang(boolean terbang) {
        this.terbang = terbang;
    }

    // Getter untuk memeriksa apakah hewan bisa terbang
    public boolean isTerbang() {
        return this.terbang;
    }

    // Metode abstrak untuk bernapas
    public abstract void bernapas();
}

// Subclass Burung mengimplementasikan metode abstrak dari Hewan
class Burung extends Hewan {
    @Override
    public void bernapas() {
        System.out.println("Burung bernapas menggunakan paru-paru.");
    }
}

