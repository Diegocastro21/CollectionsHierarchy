package MapPackage;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Set;
import java.util.Map;
public class SortedMapEjemplo {
    public static void main(String[] args) {
        /*
        * SortedMap puede usar los metodos declarados en :
        * java.util.Map
        * y cuentas con estos metodos para su uso:
        * comparator()
        * entrySet()
        * firstKey()
        * headMap()
        * keySet()
        * lastKey()
        * subMap()
        * tailMap()
        * values()
        * */
        SortedMap <Integer, String> tm
                = new TreeMap<Integer, String>();

        tm.put(3, "HEISENBERG");
        tm.put(2, "HEISENBERG");
        tm.put(1, "HEISENBERG");

        System.out.println(tm);

        tm.put(2, "For");

        System.out.println(tm);

        System.out.println("----------------------------------\n");
        SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
        sm.put(new Integer(2), "Bote");
        sm.put(new Integer(3), "Bicicleta");
        sm.put(new Integer(5), "Moto");
        sm.put(new Integer(4), "Carro");
        sm.put(new Integer(1), "Avion");
        Set s = sm.entrySet();

        Iterator i = s.iterator();

        while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();

            int key = (Integer)m.getKey();
            String value = (String)m.getValue();

            System.out.println("Key : " + key
                    + "  value : " + value);
        }
    }
}
