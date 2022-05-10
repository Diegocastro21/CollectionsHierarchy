package ListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEjemplo  {
    public static void main(String[] args) {

        /*
        * ArrayList()
        * Construye una lista vacia con una capacidad inicial de diez
        * */
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayList.add("Pera");
        arrayList.add("Manzana");
        arrayList.add("Uva");
        arrayList.add("Mango");
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        ArrayList<Integer> arrayIntegers = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            arrayListInt.add(i);
            arrayIntegers.add(i);
        }
        /*
        * ArrayList(int initialCapacity)
        * Construye una lista vacia con la capacidad inicial especificada
        * */
        ArrayList<String> arrayListCon = new ArrayList<>(2);
        /*
        * ArrayList(Collections c)
        * Construye una lista que contiene los elementos de la coleccion
        * especificada, en el orden en que son devueltos por eliterador de la coleccion
        * */
        ArrayList<Integer> arrayListInt2 = new ArrayList<>(arrayListInt);

         /*
         * Solo utilizaremos los metodos que no hemos utilizado en la ListEjemplo
         * Clone()
         * ensureCapacity()
         * forEach()
         * removeIf()
         * removeRange()
         * trimToSize()
         */

        /*
        * clone()
        * Devuelve una copia superficial de esta instancia de ArrayList
        * */
        System.out.println("ArrayList 1: "+arrayList);
        System.out.println("ArrayList 2: "+arrayListString);

        arrayListString = (ArrayList)arrayList.clone();

        System.out.println("ArrayList 2 Clon: "+arrayListString);
        System.out.println("----------------- 1 -------------------\n");

        /*
        * ensureCapacity()
        * Aumenta la capacidad de esta instancia de ArrayList,
        * si es necesario, para garantizar que pueda contener almenos
        * el numero de elementos especificados por el argumento de capacidad minima*/
        arrayListInt.add(14);
        arrayListInt.add(15);
        arrayListInt.add(23);
        arrayListInt.ensureCapacity(500);

        /*
        * forEach()
        * Realiza la accion dada para cada alemento del iterable hasta
        * que todos los elemntos se hayan procesado o la accion arroje una excepcion
        * */

        arrayList.forEach(i -> System.out.print("[ "+i+" ] "));
        System.out.println("\n-------------------- 2 -------------------\n");

        /*
        * max()
        * min()
        * es de collections y nos ayuda con las listas
        * */
        System.out.println(arrayListInt);
        System.out.println("max: "+Collections.max(arrayListInt));
        System.out.println("min: "+Collections.min(arrayListInt));
        System.out.println("-------------------- 3 -------------------\n");

        /*
        * removeIf()
        * Quita todos los elementos de esta coleccion
        * que satisfacen el predicado dado
        * */
        System.out.println(arrayListInt);
        arrayListInt.removeIf(n -> (n % 2 == 0));
        System.out.println(" ImPares: "+arrayListInt);
        System.out.println("-------------------- 4 -------------------\n");

        /*
        * removeRange()
        * Quita de esta lista todos los elementos
        * cuyo indice esta entre fromIndex - toIndex
        * esta es protected void asi que hay que especificar
        * en la clase que es extends ArrayList<Integer> ejemplo:
        * ArrayListEjemplo extends ArrayList<Integer>
        * y crear una lista vacia ejemplo :
        * ArrayListEjemplo listaRemoveRange = new ArrayListEjemplo();
        * le das los valores .add();
        * y ya podrias usar el metodo;
        * arrayList.removeRange(1, 4);
        * */

        /*
        * trimToSize()
        * recorta la capacidad de esta instacia de ArrayList
        * para que sea del tamaño de la lista
        * */
        arrayList.trimToSize();
        System.out.println(arrayList);

    }
}
