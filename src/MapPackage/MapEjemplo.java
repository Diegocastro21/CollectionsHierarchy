package MapPackage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapEjemplo {
    public static void main(String[] args) {
        /*
        * utilizar en Map
        * clear()
        * containsKey()
        * containsValue()
        * entrySet()
        * equals()
        * get()
        * hashCode()
        * isEmpty()
        * keySet()
        * put()
        * putAll()
        * remove()
        * size()
        * values()
        * getOrDefault(Object key, V defaultValue)
        * merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
        * putIfAbsent(K key, V value)
        * */


        Map<Integer, String> h = new HashMap<Integer, String>();

        h.put(1, "Apples");
        h.put(2, "Orange");
        h.put(3, "Mango");

        for (Map.Entry m:h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("For LinkedHashMap");

        LinkedHashMap<Integer, String> h1 = new LinkedHashMap<Integer, String>();

        h1.put(1, "Apples");
        h1.put(2, "Orange");
        h1.put(3, "Mango");

        for (Map.Entry m1:h.entrySet()){
            System.out.println(m1.getKey()+" "+m1.getValue());
        }
    }
}
