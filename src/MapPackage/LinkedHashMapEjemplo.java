package MapPackage;
import java.util.LinkedHashMap;
public class LinkedHashMapEjemplo {
    public static void main(String[] args) {
        /*
        * clear()
        * containsValue()
        * entrySet()
        * get()
        * keySet()
        * removeEldestEntry()
        * values()
        * */
        LinkedHashMap<String, String> stringLinkedHashMap = new LinkedHashMap<String, String>();

        stringLinkedHashMap.put("one", "practice.colombia.org");
        stringLinkedHashMap.put("two", "code.colombia.org");
        stringLinkedHashMap.put("four", "quiz.colombia.org");

        System.out.println(stringLinkedHashMap);


        System.out.println("Getting value for key 'one': " + stringLinkedHashMap.get("one"));

        System.out.println("Size of the map: " + stringLinkedHashMap.size());

        System.out.println("Is map empty? " + stringLinkedHashMap.isEmpty());

        System.out.println("Contains key 'two'? " + stringLinkedHashMap.containsKey("two"));

        System.out.println("Contains value 'practice.geeks" + "forgeeks.org'? "
                + stringLinkedHashMap.containsValue("practice" + ".colombia.org"));

        System.out.println("delete element 'one': " + stringLinkedHashMap.remove("one"));

        System.out.println("Mappings of LinkedHashMap : " + stringLinkedHashMap);
    }
}
