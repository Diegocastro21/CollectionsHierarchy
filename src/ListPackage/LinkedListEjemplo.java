package ListPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEjemplo {
    public static void main(String[] args) {
        /*
        * LinkedList()
        * Construye una lista Enlazada vacia
        * */
        LinkedList<String> listaEnlazadaString = new LinkedList<>();
        LinkedList<String> listaEnlazadaString2 = new LinkedList<>();
        listaEnlazadaString.add("Puerta");
        listaEnlazadaString.add("Techo");
        listaEnlazadaString.add("Ventana");
        listaEnlazadaString.add(1, "Focos");
        LinkedList<Integer> listaEnlazadaInteger = new LinkedList<>();
        for (int i = 0; i < 12; i++) {
            listaEnlazadaInteger.add(i);
        }
        /*
        * LinkedList(Collections c)
        * Construye una lista que contiene los elementos de la coleccion especificada
        * en el orden en que son devueltos por el iterador de la coleccion
        * */
        LinkedList<Integer> listaEnlazadaInteger2 = new LinkedList<>(listaEnlazadaInteger);

        /*
        * Usaremos solo los metodos que no hemos utilizado anteriormente
        * los pueden identificar en las otras clases
        * addFirst()
        * addLast()
        * descendingIterator()
        * getFirst()
        * getLast()
        * offerFirst()
        * offerLast()
        * peekFirst()
        * peekLast()
        * pollFirst()
        * pollLast()
        * push()
        * removeFirst()
        * removeLast()
        * removeFirstOccurrence()
        * removeLastOccurrence()
        * */

        /*
        * addFirst()
        * Inserta el elemento especificado al principio de esta lista
        * */

        System.out.println(listaEnlazadaString);

        listaEnlazadaString.addFirst("Patio");
        System.out.println(listaEnlazadaString);

        /*
        * addLast()
        * Anexa el elemento especificado al final de la lista
        * */

        listaEnlazadaString.addLast("Mesa");
        System.out.println(listaEnlazadaString);
        System.out.println("------------------------------------\n");

        /*
        * descendingIterator()
        * Devuelve un iterador sobre los elementos de este deque en orden
        * secuencial inverso
        * */

        Iterator x = listaEnlazadaString.descendingIterator();

        while(x.hasNext()){
            System.out.println("Elemento : "+x.next());
        }
        System.out.println("------------------------------------\n");
        /*
        * getFirst()
        * Devuelve el primer elemento de la lista
        *  */
        System.out.println(listaEnlazadaString);
        System.out.println("Primer elemento: "+listaEnlazadaString.getFirst());
        /*
        * getLast()
        * Devuelve el ultimo elemento de esta lista
        * */
        System.out.println("Ultimo elemento: "+listaEnlazadaString.getLast());
        System.out.println("------------------------------------\n");

        /*
        * offerFirst()
        * Inserta el elemento especificado en la parte
        * delantera de esta lista
        * */
        System.out.println(listaEnlazadaString);
        listaEnlazadaString.offerFirst("Picina");
        /*
        * offerLast()
        * Inserta el elemento especificado
        * al final de la lista
        * */
        listaEnlazadaString.offerLast("Segunda planta");
        System.out.println(listaEnlazadaString);
        System.out.println("------------------------------------\n");
        /*
        * peekFirst()
        * Recupera, pero no quita, el primer elemento de esta lista
        * o devuelve null si esta lista esta vacia
        * */
        System.out.println(listaEnlazadaString+" "+ listaEnlazadaString2);
        System.out.println(listaEnlazadaString.peekFirst());
        System.out.println(listaEnlazadaString2.peekFirst());
        /*
        * peekLast()
        * Recupera, pero no quita, el  ultimo elemento de esta lista
        * o devuelve null si esta lista esta vacia
        * */
        System.out.println(listaEnlazadaString.peekLast());
        System.out.println(listaEnlazadaString2.peekLast());
        System.out.println("------------------------------------\n");

        /*
        * pollFirst()
        * Recupera y quita el primer elemento de esta lista
        * o devuelve null si esta vacia
        * */
        System.out.println(listaEnlazadaString+" "+ listaEnlazadaString2);
        System.out.println(listaEnlazadaString.pollFirst());
        System.out.println(listaEnlazadaString2.pollFirst());
        /*
        * pollLast()
        * recupera y remueve el ulitmo elemento de esta lista
        * o devuelve null si esta vacia
        * */
        System.out.println(listaEnlazadaString. pollLast());
        System.out.println(listaEnlazadaString2.pollLast());
        System.out.println(listaEnlazadaString+" "+ listaEnlazadaString2);
        System.out.println("------------------------------------\n");
        /*
        * push()
        * Inserta un elemento en la pila reprentada por esta lista
        * */
        listaEnlazadaString.push("Sotano");
        System.out.println(listaEnlazadaString);
        System.out.println("------------------------------------\n");
        /*
        * removeFirst()
        * Quita y devuelve el primer elemento de la lista
        * y lanza una excepcion si la lista esta vacia
        * */
        System.out.println(listaEnlazadaString+" "+ listaEnlazadaString2);
        System.out.println(listaEnlazadaString.removeFirst());
        //System.out.println(listaEnlazadaString2.removeFirst());
        /*
        * removeLast()
        * Quita y devuelve el ultimo elemento de la lista
        * y lanza una excepcion si la lista esta vacia
        * */
        System.out.println(listaEnlazadaString.removeLast());
        //System.out.println(listaEnlazadaString2.removeLast());
        System.out.println(listaEnlazadaString+" "+ listaEnlazadaString2);
        /*
        * removeFirstOccurrence()
        * Quita la primera aparicion del elemento especificado
        * en esta lista
        * */
        for (int i = 0; i < 12; i++) {
            listaEnlazadaInteger.add(i);
        }
        System.out.println(listaEnlazadaInteger);
        listaEnlazadaInteger.removeFirstOccurrence(2);
        /*
        * removeLastOccurrence()
        * Quita la ultima aparicion del elemento
        * especificado en esta lista
        * */
        listaEnlazadaInteger.removeLastOccurrence(1);
        System.out.println(listaEnlazadaInteger);

    }
}
