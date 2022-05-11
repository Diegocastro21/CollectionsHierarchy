package MapPackage;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapEJemplo {
    public static void main(String[] args) {
        /*
        * Puede usar los metodos declarados en Map, Object, AbstractMap
        * ademas cuenta con estos para su uso
        * ceilingEntry()
        * ceilingKey()
        * clear()
        * clone()
        * comparator()
        * compute()
        * computeIfAbsent()
        * computeIfPresent()
        * containsKey()
        * containsValue()
        * descendingKeySet()
        * descendingMap()
        * entrySet()
        * firstEntry()
        * firstKey()
        * floorEntry()
        * floorKey()
        * get()
        * headMap()
        * higherEntry()
        * higherKey()
        * keySet()
        * lastEntry()
        * lastKey()
        * lowerEntry()
        * lowerKey()
        * merge()
        * navigableKeySet()
        * pollFirstEntry()
        * pollLastEntry()
        * put()
        * putAll()
        * remove()
        * size()
        * subMap()
        * tailMap()
        * values()
        * */
        TreeMap<Integer, String> t = new TreeMap<Integer, String>();

        t.put(1, "apples");
        t.put(3, "Oranges");
        t.put(-1, "guave");
        t.put(2, "Mangoes");

        for(Map.Entry m:t.entrySet()){
            System.out.println(m.getValue()+" "+m.getKey());
        }
    }
}
