package SetPackage;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
public class SortedSetEjemplo {
    public static void main(String[] args) {
        SortedSet<Integer> integerSortedSet = new TreeSet<>();
        SortedSet<Integer> integerSortedSet1 = new TreeSet<>();
        integerSortedSet1.add(3);
        integerSortedSet1.add(9);
        integerSortedSet1.add(4);
        integerSortedSet1.add(5);
        for (int i = 0; i <20; i++) {
            integerSortedSet.add(i);
        }

        /*
        * first()
        * Devuelve el primer elemento (el mas bajo)
        * actualmente en este conjunto
        * */
        System.out.println(integerSortedSet);
        System.out.println(integerSortedSet.first());
        System.out.println("------------------------------------\n");
        /*
        * comparator()
        * devuelve el comparador utilizado para ordernar los elementos
        * o null si este conjunto utiliza el orden natural de sus elementos
        * */
        System.out.println(integerSortedSet.comparator());
        System.out.println("------------------------------------\n");
        /*
        * headSet()
        * Devuelve una vista de la parte de este conjunto cuyos elementos
        * son estrictamente menores que toElement
        * */

        System.out.println(integerSortedSet.headSet(5));
        System.out.println("------------------------------------\n");
        /*
        * last()
        * Devuelve el ultimo elemento(Mas alto) actualmente en este conjunto
        * */
        System.out.println(integerSortedSet1);
        System.out.println(integerSortedSet1.last());
        System.out.println("------------------------------------\n");
        /*
        * subSet()
        * Devuelve una vista de la parte de este conjunto cuyos elementos
        * van desde fromElement - toElement
        * */
        System.out.println(integerSortedSet.subSet(3,12));
        System.out.println("------------------------------------\n");
        /*
        * tailSet()
        * Devuelve una vista de la parte de este conjunto cuyos
        * elementos son mayores o iguales que fromElement
        * */
        System.out.println(integerSortedSet.tailSet(6));
        System.out.println("------------------------------------\n");
        SortedSet<String> stringSortedSet = new TreeSet<String>();

        stringSortedSet.add("India");
        stringSortedSet.add("Australia");
        stringSortedSet.add("South Africa");

        stringSortedSet.add("India");

        System.out.println(stringSortedSet);

        stringSortedSet.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + stringSortedSet);

        System.out.println("Iterating over set:");
        Iterator<String> i = stringSortedSet.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("------------------------------------\n");
        SortedSet<String> stringSortedSet1 = new TreeSet<String>();

        stringSortedSet1.add("A");
        stringSortedSet1.add("B");
        stringSortedSet1.add("C");
        stringSortedSet1.add("B");
        stringSortedSet1.add("D");
        stringSortedSet1.add("E");

        System.out.println("Initial TreeSet " + stringSortedSet1);

        stringSortedSet1.remove("B");

        System.out.println("After removing element " + stringSortedSet1);
    }
}
