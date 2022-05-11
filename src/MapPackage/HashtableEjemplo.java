package MapPackage;

import java.util.Hashtable;

public class HashtableEjemplo {
    public static void main(String[] args) {
        /*
        * Metodos que podemos usar con HashTable
        * clear()
        * clone()
        * compute()
        * computeIfAbsent()
        * computeIfPresent()
        * contains()
        * containsKey()
        * containsValue()
        * elements()
        * entrySet()
        * equals()
        * get()
        * hashCode()
        * isEmpty()
        * keys()
        * keySet()
        * merge()
        * put()
        * putAll()
        * rehash()
        * remove()
        * size()
        * toString()
        * values()
        * */

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        Hashtable<Integer, String> hashtable2 = new Hashtable<Integer, String>();

        hashtable.put(1, "Colombia");
        hashtable.put(2, "Ecuador");
        hashtable.put(3, "Panama");

        hashtable2.put(1, "Venezuela");
        hashtable2.put(2, "Nicaragua");
        hashtable2.put(3, "Republica Dominicana");

        System.out.println("Mappings of hashtable 1 : " + hashtable);
        System.out.println("Mappings of hashtable 2 : " + hashtable2);


    }
}
