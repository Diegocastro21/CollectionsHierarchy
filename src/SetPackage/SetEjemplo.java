package SetPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEjemplo {
    public static void main(String[] args) {
        Set<Integer> setIntegers = new HashSet<>();
        Set<Integer> setIntegers2 = new HashSet<>();
        Set<Integer> setIntegers3 = new HashSet<>();
        Set<String> setString = new HashSet<>();
        Set<String> setString2 = new HashSet<>();


        /*
        * add()
        * Agrega el elemento especificado a este conjunto si aun no esta presente
        * SI ya se encuentra el elemento no permite que se duplique
        */

        setIntegers.add(2);
        setIntegers.add(3);
        setIntegers.add(5);
        setIntegers.add(2);
        System.out.println(setIntegers);
        System.out.println("--------------------- 1 ----------------------\n");
        /*
        * addAll()
        * Agrega todos los elementos de la coleccion especificada a este conjunto
        * Si aun no estan presentes
        * Si ya estan presenten no se agregan
        * */
        for (int i = 0; i < 10; i++) {
            setIntegers2.add(i);
            setIntegers3.add(i);
        }
        System.out.println("setIntegers : " + setIntegers);
        System.out.println("setInteger2 : " + setIntegers2);
        setIntegers.addAll(setIntegers2);
        System.out.println("setIntegers :  " + setIntegers);
        System.out.println("--------------------- 2 ----------------------\n");
        /*
        * clear()
        * Elimina todos los elementos de este conjunto
        * */
        System.out.println(setIntegers2);
        setIntegers2.clear();
        System.out.println(setIntegers2);
        System.out.println("--------------------- 3 ----------------------\n");

        /*
        * contains()
        * Devuelve true si este conjunto contiene el elemento especificado
        * */
        setString.add("Avion");
        setString.add("Carro");
        setString.add("Moto");
        System.out.println(setString);
        System.out.println("Contiene Carro: "+setString.contains("Carro"));
        System.out.println("Contiene Bicicleta: "+setString.contains("Bicicleta"));
        System.out.println("--------------------- 4 ----------------------\n");

        /*
        * containsAll()
        * Devuelve true si este conjunto contiene todos los elementos de
        * la coleccion especificada
        * */
        for (int i = 0; i < 5 ; i++) {
            setIntegers2.add(i);
        }
        System.out.println("Set 1: "+setIntegers);
        System.out.println("Set 2: "+setIntegers2);
        System.out.println("set 1 Contiene los elementos de set 2 :"
                +setIntegers.containsAll(setIntegers2));
        setIntegers2.add(15);
        System.out.println("Set 2 Actualizado: "+setIntegers2);
        System.out.println("set 1 Contiene los elementos de set 2 :"
                +setIntegers.containsAll(setIntegers2));
        setIntegers2.remove(15);
        System.out.println("--------------------- 5 ----------------------\n");

        /*
        * equals()
        * Compara el objeto especificado con este conjunto para la igualdad
        * aunque los Sets contengan los mismos elementos si no son iguales
        * completamente en tamaño marcara false
        * */

        System.out.println("Set 1: "+setIntegers);
        System.out.println("Set 2: "+setIntegers2);
        System.out.println("Set 3: "+setIntegers3);
        System.out.println("Set 1 es igual a Set 3: "+setIntegers.equals(setIntegers3));
        System.out.println("Set 1 es igual a Set 2: "+setIntegers.equals(setIntegers2));
        System.out.println("--------------------- 6 ----------------------\n");

        /*
        * hashcode()
        * Devuelve el valor del codigo hash para este set
        * */

        System.out.println("HahsCode : "+setString.hashCode());
        System.out.println("--------------------- 7 ----------------------\n");

        /*
        * isEmpty
        * Devuelve true si el set no contiene elementos
        * de lo contrario devuelve false
        * */
        System.out.println(setString);
        System.out.println(setString2);
        System.out.println("Esta vacio este set : "+setString.isEmpty());
        System.out.println("Esta vacio este set : "+setString2.isEmpty());
        System.out.println("--------------------- 8 ----------------------\n");

        /*
        * iterator()
        * Devuelve un iterador sobre los elementos de este conjunto
        * */
        Iterator<Integer> it = setIntegers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            //elimina los elementos menores a 6
            if (i < 6){
                it.remove();
            }
        }
        System.out.println(setIntegers);
        System.out.println("--------------------- 9 ----------------------\n");

        /*
        * remove()
        * Quita el elemento especificado de este conjunto si esta presente
        * */

        System.out.println(setString);
        setString.remove("Avion");
        System.out.println(setString);
        System.out.println("--------------------- 10 ----------------------\n");

        /*
        * removeAll()
        * Quita de este conjunto todos sus elemetnos contenidos en la coleccion especificada
        * */

        System.out.println(setIntegers2);
        System.out.println(setIntegers3);
        setIntegers3.removeAll(setIntegers2);
        System.out.println(setIntegers3);
        System.out.println("--------------------- 11 ----------------------\n");

        /*
        * retainALl()
        * Conserva solo los elementos de este conjunto contenidos en la coleccion especificada
        * */

        for (int i = 0; i < 4; i++) {
            setIntegers.add(i);
        }
        System.out.println(setIntegers);
        System.out.println(setIntegers2);
        setIntegers.retainAll(setIntegers2);
        System.out.println(setIntegers);
        System.out.println("--------------------- 12 ----------------------\n");

        /*
        * size()
        * Devuelve el numero de elementos de este conjunto
        * */
        System.out.println("Size del set: "+setIntegers.size());
       System.out.println("--------------------- 13 ----------------------\n");

       /*
       * toArray()
       * Devuelve una matriz que contiene todos los elementos de este conjunto
       * */
        setString.add("Helicoptero");
        setString.add("MotoCross");
        setString.add("Yate");
        setString.add("Tren");
        Object [] arreglo = setString.toArray();
        for (Object i :
                arreglo) {
            System.out.println("[ "+i+" ]");
        }








    }
}
