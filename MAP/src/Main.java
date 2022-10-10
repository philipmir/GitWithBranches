import java.util.*;

public class Main {
    public static void main(String[] args) {

    Map<String, String> encryptions = new HashMap<>();


        // Create operations
        encryptions.put("hey", "5345basdweg");
        encryptions.put("abc", "jrjkewrk123");
        encryptions.put("pass123", "notsosecret");

        // Read operation
        System.out.println(encryptions.get("pass123"));

        for(String key : encryptions.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + encryptions.get(key));
        }
        // Update operations
        encryptions.put("hey", "89asdjnjkheqwe90");

        System.out.println(encryptions);

        // Delete operation
        String removedEncryption = encryptions.remove("hey");
        System.out.println("Removed " + removedEncryption);




    }
}