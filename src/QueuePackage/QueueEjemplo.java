package QueuePackage;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.LinkedList;
public class QueueEjemplo {

    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();


        System.out.println(cola);
        /*
        * add()
        * Inseta el elemento especificado en esta cola si es posible hacerlo inmediatamente
        * sin infringir las restricciones de capacidad, devolviendo true
        * al tener exito y lanzando un excepcion si no hay espacio disponible*/
        cola.add(4);
        cola.add(5);
        cola.add(9);
        System.out.println(cola);
        /*
        * offer()
        * Inserta el elemento especificado en esta cola si es posible hacerlo
        * inmediatamente sin infringir las restricciones de capacidad*/
        for (int i = 0; i < 13; i++) {
            cola.offer(i);
        }
        System.out.println(cola);

        System.out.println("---------------- 1 --------------\n");

        /*
        * element()
        * Recupera, pero no quita, el jefe de esta cola
        * y manda excepcion si no hay elementos en la cola
        * */

        System.out.println(cola.element());
        try {
            System.out.println(cola2.element());
        }catch (NoSuchElementException e){
            System.out.println(e);
            System.out.println("Error no hay elementos en la cola");
        }
        System.out.println("-------------- 2 --------------\n");

        /*
        * peek()
        * Recupera, pero no quita el encabezado de esta cola o devuelve null
        * si esta vacia*/
        System.out.println(cola.peek());
        System.out.println(cola2.peek());
        System.out.println("--------------------- 3 -------------------\n");

        /*
        * poll()
        * Recupera y quita el encabezado de esta cola, o devuelve
        * null si esta cola esta vacia
        * */

        System.out.println(cola);
        System.out.println(cola2);
        System.out.println("[ Despues del poll() ] ");
        System.out.println(cola.poll());
        System.out.println(cola2.poll());
        System.out.println(cola);

        System.out.println("-------------------- 4 ---------------------\n");

        /*
        * remove()
        * Recupera y quita el encabezado de esta cola
        * pero este manda excepcion si la cola se encuentra vacia
        * */

        System.out.println(cola);
        System.out.println(cola2);
        System.out.println("[ Despues del remove() ] ");
        System.out.println(cola.remove());
        try{
            System.out.println(cola2.remove());
        }catch (NoSuchElementException e){
            System.out.println(e);
            System.out.println("Error no hay elementos en la cola");
        }

        System.out.println(cola);

    }
}
