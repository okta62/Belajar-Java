import java.util.Scanner;

public class ArrayInputOutputDemo {
    /* Main Method */
    public static void main(String[] args){
        // declare and create an array
        double[] arrNilai = new double[10];
        
        // create a Scanner for input
        Scanner input = new Scanner(System.in);
        
        // input values for each array element
        System.out.print("Enter " + arrNilai.length + " values: ");
        for (int i = 0; i < arrNilai.length; i++) {
            arrNilai[i] = input.nextDouble();
        }

        // output each array element
        System.out.print("Array values: ");
        for (double nilai : arrNilai) {
            System.out.print(nilai + " ");
        }

        // close the scanner
        input.close();
    }
}