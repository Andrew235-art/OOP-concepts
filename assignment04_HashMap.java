import java.util.HashMap;

public class assignment04_HashMap {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<Integer, String> map = new HashMap<>();
        
        // Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        
        // Access elements using keys
        System.out.println("Value for key 2: " + map.get(2));
        
        // Display all key-value pairs
        System.out.println("HashMap: " + map);
    }
}
