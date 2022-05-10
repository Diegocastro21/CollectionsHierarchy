package QueuePackage;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueEjemplo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        PriorityQueue<String> StringPQ = new PriorityQueue<>();
        /*
        * Este cuenta con metodos ya usados con anterioridad
        * como lo son
        * add()
        * clear()
        * comparator()
        * contains()
        * forEach()
        * iterator()
        * offer()
        * peek()
        * poll()
        * remove()
        * removeAll()
        * removeIf()
        * retainAll()
        * size()
        * spliterator()
        * toArray()
        * asi que solo vamos un ejemplo
        * */

        pQueue.add(5);
        pQueue.add(10);
        pQueue.add(15);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());
        pQueue.forEach(System.out::println);
        System.out.println("-----------------------------\n");

        StringPQ.add("Buenas");
        StringPQ.add("Tardes");
        StringPQ.add("Casi");
        StringPQ.add("Noche");

        Iterator iterator = StringPQ.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


    }
}
