package QueuePackage;
import java.util.ArrayDeque;
public class ArrayDequeEjemplo {
    public static void main(String[] args) {

        /*
        * ArrayDeque
        * al extender de AbstractCollection
        * e implements Deque
        * mantienen los mismo metodos asi que solo
        * vamos a hacer un ejemplo sencillo
        * */
        ArrayDeque<Integer> arrayDeque
                = new ArrayDeque<Integer>(10);

        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(50);

        System.out.println(arrayDeque);

        arrayDeque.clear();

        arrayDeque.addFirst(564);
        arrayDeque.addFirst(291);

        arrayDeque.addLast(24);
        arrayDeque.addLast(14);

        System.out.println(arrayDeque);
    }
}
