package ListPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class ListEjemplo {

    public static void main(String[] args) {
        List<String> listaStrings = new ArrayList<>();
        List<String> listaStrings2 = new ArrayList<>();
        List<Integer> listaIntegers = new ArrayList<>();
        List<Integer> listaIntegers2 = new ArrayList<>();
        List<Integer> listaIntegers3 = new ArrayList<>();
        //Agregar elementos a una lista
        /*
        * add(E elemento);
        * De esta manera se ingresa un elemento a la lista
        * pero este elemto entra al final de la lista
        * */
        listaStrings.add("Bogota");
        listaStrings.add("Buenos aires");
        listaStrings.add("Lima");

        listaStrings.stream().forEach(System.out::println);
        System.out.println("--------------- 1 --------------\n");
        /*
        * add(int index, E elemento);
        * De esta forma ingresamos un elemento a la lista
        * eligiendo la posicion en la que queremos que se encuetre
        * el elemento y el elemento que estaba anterior a este pasa
        * a una posicion adelante.
        * */
        listaStrings.add(0,"La Habana");
        listaStrings.add(1,"Brasilia");
        listaStrings.stream().forEach(System.out::println);
        System.out.println("--------------- 2 --------------\n");
        //Agregar todos los elementos de una lista a otras listas
        listaStrings2.add("San Juan");
        /*
        * addAll(Collection)
        * con ayuda de este metodo podemos agregar los elementos
        * de una lista a otra lista
        * vemos que este se agrega a lo ultimo de la lista
        * */
        listaStrings2.addAll(listaStrings);
        listaStrings2.stream().forEach(System.out::println );
        System.out.println("---------------- 3 ------------------\n");
        /*
        * addAll(int index, Collection)
        * De esta manera podemos decirle en que ubicacion
        * desea que los elementos se agregen
        * */
        listaStrings2.add("Caracas");
        listaStrings2.add("Quito");
        listaStrings2.addAll(6,listaStrings);
        listaStrings2.stream().forEach(System.out::println);
        System.out.println("---------------------- 4 --------------\n");

        /*
        * clear()
        * Quita todos los elemento de la lista
        * */
        listaStrings2.clear();
        System.out.println("listaStrings2 = " + listaStrings2);
        System.out.println("------------------ 5 --------------------\n");
        /*
        * contains(Object o)
        * Devuelve true si este contiene el elemento especicificado
        * de lo contrario devuelve false
        * */
        listaStrings2.add("La Habana");
        listaStrings2.add("Caracas");
        System.out.println(listaStrings.contains("La Habana"));
        //Como este no lo tiene muestra false
        System.out.println(listaStrings.contains("Caracas"));
        System.out.println("------------- 6 ------------\n");
        /*
        * containsAll(Collection)
        * Devuelve true si la lista contiene todos los elementos de la coleccion especificada
        * de lo contrario devuelve false
        * pero no es necesario que tengan el mismo tamaño
        * con que todos los que contiene los tenga todos este sigue dando positivo
        * si almenos uno solo cambia este resulta false
        * */
        for (int i = 0; i < 10; i++) {
            listaIntegers.add(i);
            listaIntegers2.add(i);
        }
        listaIntegers3.add(1);
        listaIntegers3.add(2);
        listaIntegers3.add(3);
        listaIntegers3.add(4);
        System.out.println(listaIntegers.containsAll(listaIntegers3));
        listaIntegers3.add(200);
        System.out.println(listaIntegers.containsAll(listaIntegers3));
        System.out.println("------------------- 7 ------------------------\n");
        /*
        * equals()
        * con este tenemos que tener los mismos valores y tamaño para ser true
        * como su palabra lo dice debe ser totalmente igual
        * si cambia su tamaño o algun elemento este resulta false
        * */

        System.out.println(listaIntegers.equals(listaIntegers2));
        listaIntegers2.add(11);
        System.out.println(listaIntegers.equals(listaIntegers2));
        System.out.println("------------- 8 ------------\n");

        System.out.println(listaStrings);
        /*
        * get(int index)
        * devuelve el elemento en la posicion especificada de la lista
        * recordemos que los arreglos empiezan desde cero asi que se le
        * indica el numero anterior al que queremos o (posicion-1)
        * */
        System.out.println("Elemento 4: "+listaStrings.get(3));
        System.out.println("--------------------- 9 -----------------\n");

        /*
        * hashcode()
        * Devuelve el valor del codigo hash de esta lista
        * */
        System.out.println("Hashcode de listaInteger: "+listaIntegers.hashCode());
        System.out.println("------------------------- 10 -----------------------\n");

        /*
        * indexOf()
        * devuelve el indice de la primera aparicion del elemento especificado en la lista,
        * o -1 si esta lista no contiene el elemento
        * lastIndexOf()
        * Devuelve el indice de la ultima aparicion del elemento especificado en la lista,
        * o -1 si esta lista no contiene el elemento
        * */
        listaStrings.add("Buenos aires");
        listaStrings.add("Managua");
        listaStrings.add("Buenos aires");
        System.out.println(listaStrings);
        System.out.println("Primera aparicion: "+listaStrings.indexOf("Buenos aires"));
        System.out.println(listaStrings.indexOf("Quito"));
        System.out.println("Ultima aparicion: "+listaStrings.lastIndexOf("Buenos aires"));
        System.out.println(listaStrings.indexOf("Quito"));
        System.out.println("--------------------- 11 ---------------------\n");

        /*
        * isEmpty()
        * Devuelve true si esta lista no contiene elementos
        * */
        listaStrings2.clear();
        System.out.println("Lista 1: "+listaStrings);
        System.out.println("Lista 2: "+listaStrings2);
        System.out.println("Esta lista 1 esta vacia: "+listaStrings.isEmpty());
        System.out.println("Esta lista 2 esta vacia: "+listaStrings2.isEmpty());
        System.out.println("----------------------- 12 --------------------------\n");
        /*
        * remove(int index)
        * Quita el elemento en la posicion especificada en esta lista
        * remove(Object o)
        * Quita el elemento especificado de esta lista, si esta presente
        * */
        System.out.println(listaStrings);
        listaStrings.remove(2);
        listaStrings.remove("Brasilia");
        System.out.println(listaStrings);
        System.out.println("----------------- 13 -------------------\n");

        /*
        * removeAll(Collection)
        * Quita de esta lista todos sus elementos contenidos en la coleccion especificada
        * */
        listaIntegers3.remove(4);
        System.out.println(listaIntegers);
        System.out.println(listaIntegers3);

        listaIntegers.removeAll(listaIntegers3);
        System.out.println(listaIntegers);
        System.out.println("----------------------- 14 -----------------\n");

        /*
        * replaceAll()
        * Reemplaza cada elemento de esta lista con el resultado
        * de aplicar el operador a ese elemento
        * */

        System.out.println(listaStrings);
        listaStrings.replaceAll(e -> e.toLowerCase());
        System.out.println("Lista reemplazada: "+listaStrings);
        System.out.println("----------------------- 15 -----------------------\n");

        /*
        * retainAll()
        * Conserva solo los elementos de esta lista contenidos en la coleccion
        * */
        for (int i = 0; i < 5; i++) {
            listaIntegers.add(i,i);
        }
        System.out.println("Lista 1: "+listaIntegers);
        System.out.println("Lista 2: "+listaIntegers3);
        listaIntegers.retainAll(listaIntegers3);
        System.out.println("Lista 1: "+listaIntegers);
        System.out.println("----------------------- 16 -------------------------\n");

        /*
        * set(int index, Element e)
        * reemplaza el elemento en la posicion especificada en esta lista
        *  por el elemento especificado
        * */
        System.out.println(listaStrings);
        listaStrings.set(2, "Brasilia");
        listaStrings.set(5, "San juan");
        System.out.println(listaStrings);
        System.out.println("---------------------- 17 -------------------\n");
        /*
        * size()
        * Devuelve el numero de elementos de esta lista
        * */
        System.out.println(listaStrings.size());
        System.out.println("---------------------- 18 ---------------------\n");
        /*
        * sort()
        * Ordena esta lista segun el orden inducido por el comparador especificado
        * */

        for (int i = 5; i > 1; i--) {
            listaIntegers2.add(i);
        }
        System.out.println(listaIntegers2);
        listaIntegers2.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(listaIntegers2);
        System.out.println(listaStrings);
        listaStrings.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(listaStrings);
        System.out.println("-------------------- 19 -------------------------\n");

        /*
        * subList(int fromindex, int toIndex)
        * Devuelve una vista de la parte de esta lista entre el especificado
        * fromIndex - toIndex
        * */
        System.out.println(listaStrings.subList(0, 3));
        System.out.println(listaStrings.subList(-0,4));
        System.out.println("-------------------- 20 --------------------------\n");
        /*
        * toArray()
        * Devuelve una matriz que contiene todos los elementos de esta
        * lista en la secuencia adecuada
        * */

        Object [] arreglo = listaStrings.toArray();
        for (Object i :
             arreglo) {
            System.out.println("[ "+i+" ]");
        }
        System.out.println("------------------------ 21 ---------------------\n");
        /*
        * iterador()
        * nos ayuda a recorrer colecciones , como arraylist
        * se llama iterador para iterar es el termino de bucle
        * */
        System.out.println(listaIntegers2);

        Iterator<Integer> it = listaIntegers2.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if (i < 8){
                it.remove();
            }
        }
        System.out.println(listaIntegers2);
        System.out.println("-------------------------- 22 --------------------------\n");
        /*
        * listIterador()
        * Devuelve un iterador de la lista sobre los elementos de esta lista
        * */
        System.out.println(listaStrings);
        Iterator<String> itString = listaStrings.listIterator();
        while(itString.hasNext()){
            System.out.println(itString.next());
        }
        System.out.println("------------------------ 23 ----------------------------\n");
        /*
        * listIterador(int index)
        * Este iterador comienza por el indice que se le indique
        * */
        Iterator<String> itString2 = listaStrings.listIterator(2);
        while(itString2.hasNext()){
            System.out.println(itString2.next());
        }
    }
}
