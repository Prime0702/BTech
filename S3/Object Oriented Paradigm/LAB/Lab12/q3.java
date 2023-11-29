import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>(); // Create ArrayList
        // Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        languages.add(1, "JavaScript");
        String str = languages.get(2); // Access elements to ArrayList
        System.out.print("Element at index 2: " + str);
        System.out.println("ArrayList: " + languages);
        languages.set(2, "CPP"); // change elements to ArrayList
        System.out.println("Modified ArrayList: " + languages);
        String str2 = languages.remove(2); // Remove elements to ArrayList
        System.out.println("Updated ArrayList: " + languages);
        System.out.println("Removed Element: " + str2);
    }
}
