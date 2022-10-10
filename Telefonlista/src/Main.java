import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> Telefonlista = new HashMap<>();


        Telefonlista.put("", "543 3431 1533");
        Telefonlista.put("Karin", "634 2341 2344");
        Telefonlista.put("Kevin", "324 5430 1222");

        System.out.println(Telefonlista.get("Greta"));

        System.out.println("Vilket namn");
        String val = sc.nextLine();




        for(String nummer : Telefonlista.keySet()) {
             //  System.out.println(nummer);
               if (nummer.equals(val)) {
                   System.out.println("Nummer: " + Telefonlista.get(nummer));
                   System.out.println("Namn: " + nummer);
               }
           }

    }


}
