import java.util.ArrayList;

public class ListMobilDemo {
    public static void main(String[] args) {
        // Create an ArrayList to store Mobil objects
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        // Add Mobil objects to the ArrayList
        daftarMobil.add(new Mobil("Toyota", "Corolla", 2020));
        daftarMobil.add(new Mobil("Honda", "Civic", 2019));
        daftarMobil.add(new Mobil("Ford", "Focus", 2018));

        // Display the list of Mobil
        System.out.println("Daftar Mobil:");
        for (Mobil mobil : daftarMobil) {
            System.out.println(mobil);
        }

        // Access and display details of a specific Mobil object
        Mobil mobilPertama = daftarMobil.get(0);
        System.out.println("\nMobil pertama di daftar:");
        System.out.println("Merk: " + mobilPertama.getMerk());
        System.out.println("Model: " + mobilPertama.getModel());
        System.out.println("Tahun: " + mobilPertama.getTahun());
    }
}