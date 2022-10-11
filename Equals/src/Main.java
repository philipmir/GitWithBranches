import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //List<String> names = new ArrayList<>();
        Set<String> names = new HashSet<>();  // Tillåter enbart ett unikt värde så två String "Anna" går intw!

        names.add("Anna");
        names.add("Anna");

        // tusen rader senare..

        System.out.println(names.contains("Anna"));
        System.out.println(names.size());

        //List<Person> people = new ArrayList<>();
        Set<Person> people = new HashSet<>();   // Tillåter enbart ett unikt värde så två String "Anna" går intw!
       // Person bertilPerson = new Person("Bertil");  // Ett annat sätt att kolla om personen finns.

        people.add(new Person("Bertil"));
        people.add(new Person("Bertil"));
       // people.add(bertilPerson);  // Ett annat sätt att kolla om personen finns.




        // tusen rader senare..

        System.out.println(people.contains(new Person("Bertil")));
        System.out.println(people.size());

       // if (bertilPerson.equals(new Person("Bertil"))) {  // Ett annat sätt att kolla om personen finns.
       //     System.out.println("They are the same!");
       // }







    }
}