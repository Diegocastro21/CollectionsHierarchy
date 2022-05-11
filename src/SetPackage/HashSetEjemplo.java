package SetPackage;
import java.util.HashSet;
public class HashSetEjemplo {
    public static void main(String[] args) {
        /*
        * HashSet
        * mantiene los mismos metodos con los cuales
        * ya realizamos ejemplos
        * asi que mostramos solo un ejemplo breve
        * */
        HashSet<Integer> numbers = new HashSet<Integer>();
        HashSet<String> cars = new HashSet<String>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        System.out.println("------------------------------------\n");

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        System.out.println(cars.size());
        cars.remove("Volvo");
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
    }
}
