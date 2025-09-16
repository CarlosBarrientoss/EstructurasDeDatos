package pila;

/**
 *
 * @author carlo
 */
//Implementación de una clase Pila con Arreglo encapsulado. El arrglo se encargará de guardar los elementos de la pila
public class Pila {

    private Object[] arregloPila;   // arreglo que contiene los elementos de la pila// Significa que el arreglo es de tipo Object, y como todas las clases en Java heredan de Object, puedes almacenar cualquier tipo de dato en él:casting
    private int tamanoPila;         // tamaño del arreglo arregloPila
    private int cima;               // variable que contiene el valor del indice de la cima de la pila
    //----------------------------------------------------------------------------

    // constructor
    public Pila(int tamano) {
        this.tamanoPila = tamano;                   // establece el tamaño del arreglo arregloPila
        cima = -1;                                  // el valor cima = -1 indica que la pila esta vacia (no elementos)
        arregloPila = new Object[tamanoPila];       // creacion del arreglo que contendra los elementos de la pila
    }
    //----------------------------------------------------------------------------
// metodo que inserta un elemento en la cima de la pila

    public void insertar(Object elemento) {
        cima = cima + 1;                       // incrementa valor de cima en 1
        arregloPila[cima] = elemento;          // inserta elemento en la cima de la pila
    }
//-----------------------------------------------------------------------------

// metodo que retira el elemento que se encuentra en la cima de la pila y retorna este elemento eliminado
    public Object quitar() {
        Object temp = arregloPila[cima];       // guardamos en variable temp el elemento de la cima de la pila
        cima = cima - 1;                       // decrementa el valor de cima en 1
        return temp;                           // retorna elemento eliminado
    }
//-----------------------------------------------------------------------------
// metodo que devuelve el elemento que se encuentra en la cima de la pila

    public Object cimaPila() {
        return arregloPila[cima];
    }
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
// metodo que verifica si la pila esta vacia (no tiene elementos)

    public boolean pilaVacia() {
        return cima == -1;
    }
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
// metodo que verifica si la pila esta llena (comprueba si la cima es tamanoPila-1)

    public boolean pilaLlena() {
        return cima == tamanoPila - 1;
    }
//-----------------------------------------------------------------------------

// metodo que devuelve el numero actual de elementos en la pila
    public int tamano() {
        return cima + 1;
    }
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
// metodo que muestra todos los elementos de la pila

    public void mostrarElementosPila() {
        for (int i = 0; i < tamano(); i++) {
            System.out.print(arregloPila[i]);
            System.out.print(" ");
        }
    }

}
