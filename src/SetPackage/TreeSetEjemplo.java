package SetPackage;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEjemplo {
    public static void main(String[] args) {

        /*
        * Usaremos solo los metodos que no hemos
        * dado ejemplo anteriormente
        * */
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        TreeSet<String> stringTreeSet = new TreeSet<>();

        /*
        * ceiling()
        * Devuelve el elemento minimo de este conjunto mayor o igual
        * que el elemento dado, o null si no existe tal elemento
        * */
        for (int i = 0; i < 12; i++) {
            integerTreeSet.add(i);
        }
        System.out.println(integerTreeSet);
        System.out.println(integerTreeSet.ceiling(6));
        System.out.println(integerTreeSet.ceiling(14));
        System.out.println("-------------------------------\n");
        /*
        * descendingSet()
        * Devuelve una vista de orden inverso de los elemenotos de este conjunto
        * */
        System.out.println(integerTreeSet);
        System.out.println(integerTreeSet.descendingSet());
        System.out.println("-------------------------------\n");
        /*
        * floor()
        * Devuelve el elemento mayor de este conjunto menor o igual que el
        * elemento dado,o null si no existe tal elemento
        * */
        System.out.println(integerTreeSet.floor(7));
        System.out.println(integerTreeSet.floor(-1));
        System.out.println("-------------------------------\n");
        /*
        * higher()
        * Devuelve el elemento minimo de este conjunto estrictamente
        * mayor que el elemento dado, o null si no existe
        * */
        System.out.println(integerTreeSet.higher(4));
        System.out.println(integerTreeSet.higher(-1));
        System.out.println("-------------------------------\n");
        /*
        * lower()
        * Devuelve el elemento mayor de este conjunto
        * estrictamente menor que el elemento dado, o null si no existe
        * */
        System.out.println(integerTreeSet.lower(5));
        System.out.println(integerTreeSet.lower(-1));
        System.out.println("-------------------------------\n");
        stringTreeSet.add("India");
        stringTreeSet.add("Australia");
        stringTreeSet.add("South Africa");

        stringTreeSet.add("India");

        System.out.println(stringTreeSet);

        stringTreeSet.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + stringTreeSet);

        System.out.println("Iterating over set:");
        Iterator<String> i = stringTreeSet.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
