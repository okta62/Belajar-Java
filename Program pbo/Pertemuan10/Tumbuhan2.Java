// Interface
interface MahlukHidup {
    void bernapas();  // Method to be implemented by any living being
    boolean isHidup(); // Method to check if it's alive
}

// Abstract class
abstract class Dedaunan {
    abstract void daunBergerak();  // Abstract method for leaf movement

    // You can add shared methods for subclasses here if needed
}

// Concrete class implementing the interface and extending abstract class
public class Tumbuhan extends Dedaunan implements MahlukHidup {

    @Override
    public void bernapas() {
        System.out.println("Aku tidak bernapas.");
    }

    @Override
    public boolean isHidup() {
        return true;
    }

    @Override
    public void daunBergerak() {
        System.out.println("Daun bergerak karena angin.");
    }

    public static void main(String[] args) {
        Tumbuhan cemara = new Tumbuhan();  // Create instance of Tumbuhan
        cemara.bernapas();  // Call bernapas() method
        System.out.println("Apakah benda hidup: " + cemara.isHidup());  // Check if it's alive
        cemara.daunBergerak();  // Call daunBergerak() method
    }
}
