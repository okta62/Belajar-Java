interface MahlukHidup {
    void bernapas();
    boolean isHidup();
}

public class Tumbuhan implements MahlukHidup {

    @Override
    public void bernapas() {
        System.out.println("Aku tidak bernapas seperti hewan.");
    }

    @Override
    public boolean isHidup() {
        return true;
    }

    public static void main(String[] args) {
        Tumbuhan cemara = new Tumbuhan();
        cemara.bernapas();
        System.out.println("Apakah benda hidup: " + cemara.isHidup());
    }
}
