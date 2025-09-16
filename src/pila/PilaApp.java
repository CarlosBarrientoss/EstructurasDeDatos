package pila;

/**
 *
 * @author carlo
 */
public class PilaApp {

    public static void main(String[] args) {
        Pila pila = new Pila(5);   // crea una pila de 5 elementos

        // inserta enteros a la pila
        pila.insertar(20);
        pila.insertar(40);
        pila.insertar(60);
        pila.insertar(80);
        pila.insertar(90);

        System.out.println("ELEMENTOS INSERTADOS EN LA PILA");
        pila.mostrarElementosPila();   // imprime elementos de la pila en pantalla

        System.out.println("");
        System.out.println("");
        System.out.println("ELEMENTO EN LA CIMA DE LA PILA " + pila.cimaPila());

        System.out.println("");
        System.out.println("");
        System.out.print("Pila esta llena? " + pila.pilaLlena());   // comprueba si la pila esta llena

        System.out.println("");
        System.out.println("ELEMENTOS ELIMINADOS DE LA PILA:");
        while (!pila.pilaVacia()) { //Recorre la pila mientras no esté vacía.
            Object valor = pila.quitar();   //quitar() devuelve el elemento eliminado de ese arreglo, su tipo de retorno también es Object:
            System.out.println("Valor eliminado " + valor);
        }
        System.out.println("");

// inserta nuevos elementos del tipo String a la pila
        pila.insertar("Perro");
        pila.insertar("Oso");
        pila.insertar("Gato");

        System.out.println("ELEMENTOS NUEVOS EN PILA:");
        pila.mostrarElementosPila();

        System.out.println("");
        System.out.println("");
        System.out.println("CANTIDAD DE ELEMENTOS EN LA PILA: " + pila.tamano());

    }
}
