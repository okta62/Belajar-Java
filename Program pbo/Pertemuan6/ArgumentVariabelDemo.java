public class ArgumentVariabelDemo {
    public static void main(String[] args) {
        // Call the method with multiple arguments
        cetakMaks(34, 3, 3, 2, 56.5);
        
        // Call the method using an array
        cetakMaks(new double[]{1, 2, 3});
    }

    // Method to print the maximum value among the arguments
    public static void cetakMaks(double... numbers) {
        // Check if no arguments were passed
        if (numbers.length == 0) {
            System.out.println("Tidak ada argumen.");
            return;
        }

        // Find the maximum value
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }

        // Print the maximum value
        System.out.println("Nilai maksimal: " + result);
    }
} 