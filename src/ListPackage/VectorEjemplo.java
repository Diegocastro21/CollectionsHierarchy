package ListPackage;
import java.util.Enumeration;
import java.util.Vector;
public class VectorEjemplo {
    public static void main(String[] args) {

        /*
        * Vector()
        * Construye un vector vacio para que su
        * matriz de datos interna tenga un tamaño 10
        * y su incremento de capacidad estandar sea cero
        * */
        Vector<Integer> vectorInteger= new Vector<Integer>();
        for (int i = 0; i < 5; i++) {
            vectorInteger.add(i);
        }
        /*
        * Vector(int initialCapacity)
        * Construye un vector con la capacidad inicial especificada
        * u con incremento de capacidad igual a cero
        * */
        Vector<String> vectorString = new Vector<String>( 25);
        vectorString.add("Metal");
        vectorString.add("Plastico");
        vectorString.add("Oro");
        /*
        * Vector(int initialCapacity, int capacityIncrement)
        * Construye un vector con la capacidad inicial especificada
        * y el incremento de capacidad
        * */
        Vector<String> vectorString2 = new Vector<String>(20, 15);
        /*
        * Vector(Collections c)
        * Construye un vector que contiene los elementos de la coleccion
        * especificada, en el orden enque son devueltos por el iterador de la
        * coleccion
        * */
        Vector<Integer> vectorInteger2 = new Vector<Integer>(vectorInteger);

        /*
        * Solo ejemplos con los metodos que no fueron utilizados con aterioridad
        * addElement()
        * capacity()
        * copyInto()
        * elementAt()
        * elements()
        * firstElement()
        * insertElementAt()
        * lastElement()
        * removeAllElements()
        * removeElement()
        * removeElementAt()
        * setElementAt()
        * setSize()
        * toString()
        * */
        /*
        * addElement()
        * Agrega el componente especificado al final de este
        * vector, aumentando su tamaño en uno
        * */
        System.out.println(vectorString);
        vectorString.addElement("Cristal");
        System.out.println(vectorString);
        System.out.println("-----------------------------------\n");

        /*
        * capacity()
        * Devuelve la capacidad actual de este vector
        * */
        System.out.println(vectorString.capacity());
        System.out.println("-----------------------------------\n");

        /*
        * copyInto()
        * Copia los componentes de este vector en la matriz especificada
        * */

        Integer matrizInt [] = new Integer[6];
        matrizInt[0] = 12;
        matrizInt[1] = 10;
        matrizInt[2] = 13;
        matrizInt[3] = 14;
        matrizInt[4] = 15;


        for (Integer i :
             matrizInt) {
            System.out.println(i);
        }

        vectorInteger.copyInto(matrizInt);

        for (Integer i :
                matrizInt) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------\n");
        /*
        * elementAt()
        * Devuelve el componente del indice especificado
        * */

        System.out.println(vectorInteger.elementAt(3));

        System.out.println("-----------------------------------\n");
        /*
        * elements()
        * Devuelve una enumeracion con los componentes de este vector
        * */

        Enumeration enu = vectorInteger.elements();
        System.out.println("Los elementos de la Enum son: ");
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }
        System.out.println("-----------------------------------\n");

        /*
        * firstElement()
        * Devuelve el primer componente de este vector
        * */

        System.out.println(vectorInteger);
        System.out.println(vectorInteger.firstElement());
        System.out.println("-----------------------------------\n");

        /*
        * insertElementAt()
        * Inserta el objeto especificado como componente en este
        * vector en el indice especificado
        * */
        System.out.println(vectorString);
        vectorString.insertElementAt("Chimenea",2);
        System.out.println(vectorString);
        System.out.println("-----------------------------------\n");
        /*
        * lastElement()
        * Devuelve el ultimo componente del vector
        * */
        System.out.println(vectorInteger);
        System.out.println(vectorInteger.lastElement());
        System.out.println("-----------------------------------\n");
        /*
        * lastIndexOf()
        * Devuelve el indice de la ultima aparicion del elemento especificado en este vector
        * o -1 si este vector no contiene elemento
        * */
        System.out.println(vectorInteger.lastIndexOf(2));
        System.out.println(vectorInteger.lastIndexOf(6));
        System.out.println("-----------------------------------\n");
        /*
        * removeAllElements()
        * Elimina todos los componentes de este vector
        * y establece su tamaño en cero
        * */
        System.out.println(vectorInteger2);
        vectorInteger2.removeAllElements();
        System.out.println(vectorInteger2);
        System.out.println("-----------------------------------\n");
        /*
        * removeElementAt()
        * Elimina el componente en el indice especificado
        * */
        System.out.println(vectorString);
        vectorString.removeElementAt(2);
        System.out.println(vectorString);
        System.out.println("-----------------------------------\n");
        /*
        * setElementAt()
        * Establece el componente en el indice especificado
        * de este vecotr para que sea el objeto especificado
        * */
        System.out.println(vectorString);
        vectorString.setElementAt("Chimenea",2);
        System.out.println(vectorString);
        System.out.println("-----------------------------------\n");
        /*
        * setSize()
        * Establece el tamaño del vector
        * */
        System.out.println(vectorString2);
        vectorString2.setSize(15);
        System.out.println("setSize(15): "+vectorString2);
        System.out.println("-----------------------------------\n");
        /*
        * toString()
        * Devuelve una representacion de cadena de este vector
        * que contiene la representacion de cadena de cada elemento
        * */

        System.out.println(vectorString.toString());

    }
}
