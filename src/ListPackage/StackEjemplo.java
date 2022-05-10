package ListPackage;
import java.util.Stack;
public class StackEjemplo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();


        /*
        * Stack puede usar todos los metodos declarados en
        * java.util.Vector;
        * */
        /*
        * empty()
        * comprueba si la pila esta vacia
        * */
        System.out.println(stack.empty());
        System.out.println("--------------------------\n");
        /*
        * peek()
        * Mira el objeto en la parte superior de la pila sin quitarlo de la pila
        * */
        for (int i = 0; i < 9; i++) {
            stack.add(i);
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println("--------------------------\n");
        /*
        * search()
        * devuelve la posicion basada en -1
        * donde se encuentra un objeto en esta pila
        * ejemplo si hay 5 elementos del 1 - 5
        * y quieres el 3 devolvera (3-1) osea la 2
        * */
        System.out.println(stack.search(4));
        System.out.println("--------------------------\n");
        /*
        * push()
        * empuja un elemento en la parte superior de esta pila
        * */
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        System.out.println("--------------------------\n");
        /*
        * pop()
        * Quita el objeto en la parte superior de esta pila y devuelve ese
        * objeto como el valor de esta funcion
        * */
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
