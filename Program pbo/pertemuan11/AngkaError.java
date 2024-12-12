import java.util.Scanner;

public class AngkaError {
    public static void main(String[] args) {
        // Buat objek Scanner
        Scanner input = new Scanner(System.in);
        int angka = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Masukkan sembarang angka:");
            try {
                angka = input.nextInt();
                validInput = true;  // Input is valid, exit the loop
            } catch (Exception e) {
                System.out.println("Inputan salah! Silakan masukkan angka yang valid.");
                input.next();  // Clear the invalid input
            }
        }

        System.out.println("Angka yang dimasukkan: " + angka);
        input.close();  // Close the scanner to prevent resource leak
    }
}