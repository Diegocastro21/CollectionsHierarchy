package MapPackage;
import java.util.HashMap;
public class HashMapEjemplo {
    public static void main(String[] args) {

        /*
        * HashMap permite usar todos estos metodos :
        * clear()
        * clone()
        * compute()
        * computeIfAbsent()
        * computeIfPresent()
        * containsKey()
        * containsValue()
        * entrySet()
        * get()
        * isEmpty()
        * keySet()
        * merge()
        * put()
        * putAll()
        * remove()
        * size()
        * values()
        * */

        HashMap<Integer, String> hm1 = new HashMap<>(10);

        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>(2);


        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        System.out.println("Mappings of HashMap hm1 are : "
                + hm1);

        System.out.println("Mapping of HashMap hm2 are : "
                + hm2);
    }
}
