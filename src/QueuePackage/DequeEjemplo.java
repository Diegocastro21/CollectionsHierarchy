package QueuePackage;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
public class DequeEjemplo {
    public static void main(String[] args) {
        /*
        * Deque
        * solo ejemplos con los metodos que no hemos utlizado antes
        * si no aparecen aca busquenlo en los otros .java de QueuePackage
        * */
        Deque<String> stringDeque = new LinkedList<String>();
        stringDeque.add("C");
        stringDeque.addFirst("C++");
        stringDeque.addLast("Java");

        System.out.println("Elementos despues de add, addFirst, addLast " + stringDeque);
        Iterator x = stringDeque.descendingIterator();

        while(x.hasNext()){
            System.out.println("Elemento : "+x.next());
        }
        System.out.println("------------------------------------\n");
        Deque<String> dq = new LinkedList<String>();
        dq.add("JavaScript");
        dq.add("Python");

        stringDeque.addAll(dq);

        System.out.println("Elementos despues de addAll: " + stringDeque);

        stringDeque.offer(".Net");
        stringDeque.offerFirst("C#");
        stringDeque.offerLast("VBScript");

        System.out.println("Elementos despues de offer, offerFirst and offerLast: " + stringDeque);

        stringDeque.push("HTML");

        System.out.println("Elementos despues del push: " + stringDeque);

    }
}
