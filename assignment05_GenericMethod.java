public class assignment05_GenericMethod {
    // Generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String array
        String[] strArray = {"Apple", "Banana", "Cherry"};
        
        // Call generic method
        System.out.println("Integer Array:");
        printArray(intArray);
        
        System.out.println("String Array:");
        printArray(strArray);
    }
}
