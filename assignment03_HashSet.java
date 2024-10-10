import java.util.HashSet;

public class assignment03_HashSet {
    public static void main(String[] args) {
        // Create a HashSet to store unique elements
        HashSet<String> fruits = new HashSet<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate entry
        
        // HashSet automatically handles duplicates
        System.out.println("HashSet Elements: " + fruits);
    }
}
