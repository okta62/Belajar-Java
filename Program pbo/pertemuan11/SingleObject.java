public class SingleObject {

    // Create a static instance of this class
    private static SingleObject instance = new SingleObject();

    // Private constructor so that no instances can be created outside this class
    private SingleObject() {}

    // Public static method to provide access to the instance
    public static SingleObject getInstance() {
        return instance;
    }

    // Method to display a message
    public void showMessage() {
        System.out.println("Hello World!");
    }

    // Main method to demonstrate the Singleton
    public static void main(String[] args) {
        // Get the only object available
        SingleObject object = SingleObject.getInstance();
        // Show the message
        object.showMessage(); // This should output: Hello World!
    }
}

