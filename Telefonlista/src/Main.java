import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> Telefonlista = new HashMap<>();


        Telefonlista.put("Greta", "543 3431 1533");
        Telefonlista.put("Karin", "634 2341 2344");
        Telefonlista.put("Kevin", "324 5430 1222");

        System.out.println(Telefonlista.get("Greta"));

        System.out.println("Vad vill du göra?");
        System.out.println("1. Kolla någons nummer");
        System.out.println("2. Lägga till telefonnummer");
        String val = sc.nextLine();



        if (val.equals("1")) {
            System.out.println("Vilken person söker du?");
            String name = sc.nextLine();

            for(String nummer : Telefonlista.keySet()) {
                //  System.out.println(nummer);
                if (nummer.equals(name)) {
                    System.out.println("Nummer: " + Telefonlista.get(nummer));
                    System.out.println("Namn: " + nummer);
                }
            }
        } else if (val.equals("2")) {
            System.out.println("Vilket namn?");
            String add = sc.nextLine();
            System.out.println("Vilket nummer?");
            String addnumber = sc.nextLine();

            Telefonlista.put(add, addnumber);

            System.out.println(Telefonlista);



            //System.out.println(Telefonlista.get(add) + (addnumber));
            //System.out.println(Telefonlista.keySet());


        }


    }


}
