package SetPackage;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.Collections;
public class LinkedHashSetEjemplo {
    public static void main(String[] args) {
        /*
        * LinkedHashSet
        * nos da la posibilidad de usar los metodos
        * comunes de HashSet, AbstractSet
        * AbstractCollection entre otros
        * asi que solo haremos un ejemplo breve
        * */
        Integer[] val = {0,1};
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>();

        integerLinkedHashSet.add(7118);
        integerLinkedHashSet.add(800);
        integerLinkedHashSet.add(1178);
        integerLinkedHashSet.add(1190);

        //spliterator  split and iterate the split parts in parallel

        Spliterator<Integer> str = integerLinkedHashSet.spliterator();

        str.forEachRemaining(

                (Integer n) -> {

                    System.out.println(n);

                    val[0] = Collections.max(integerLinkedHashSet);

                    val[1]=Collections.min(integerLinkedHashSet);
                }
        );

        System.out.println("Max number = "+ val[0]);

        System.out.println("Min number = "+ val[1]);

    }
}
