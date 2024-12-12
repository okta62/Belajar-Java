public class OrderedPair<K, V> {

    private K key; // The key of the pair
    private V value; // The value of the pair, now using generic type V

    // Constructor
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value; // Assign the value directly without casting
    }

    // Getter for the key
    public K getKey() {
        return key;
    }

    // Getter for the value with condition
    public String getValue() {
        if (this.key.equals("aaa")) { // Use equals() for string comparison
            return String.valueOf(this.value); // Convert value to String
        } else {
            return "salah"; // Return "salah" if key is not "aaa"
        }
    }

    // Main method to test the OrderedPair class
    public static void main(String[] args) {
        // Create an OrderedPair instance with key "aaa" and value "2"
        OrderedPair<String, String> p2 = new OrderedPair<>("aaa", "2");
        // Print the value associated with the key
        System.out.println(p2.getValue()); // This should output: 2
    }
}