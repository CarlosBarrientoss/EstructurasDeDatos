package arreglos;

/**
 *
 * @author carlo
 */
public class ArregloOrdenado {

    private long[] arr;
    private int numElems;

    public ArregloOrdenado(int tam) {
        arr = new long[tam];
    }

    //Busqueda Binaria. Retorna posición del elemento dato en el arreglo, caso contraría retorna -1
    public int busquedaBinaria(long dato) {
        int minimo = 0;                       // indice minimo del arreglo
        int maximo = numElems - 1;            // indice maximo del arreglo
        int central;                          // indice del punto central del arreglo

        while (minimo <= maximo) {  //
            central = (minimo + maximo) / 2;  // calcula el punto central del arreglo

            if (arr[central] == dato) {        // elemento encontrado
                return central;
            } else {
                if (dato > arr[central]) {     // elemento se encuentra en la mitad superior
                    minimo = central + 1;
                } else {
                    maximo = central - 1;
                }
            }
        }
        return -1;
    }

//----------------------------------------------------------------------------------
    // inserta dato en el arreglo
    public void insertar(long dato) {
        int j;
        for (j = 0; j < numElems; j++) {           // recorre arreglo elemento por elemento
            if (arr[j] > dato) {                   // elemento en la posición j es mayor a elemento a insertar
                break;                             // se detiene bucle. elemento a insertar estará en posición j
            }
        }

        // desplaza celdas de arreglo una posición hacia arriba a partir del índice j donde se insertará el elemento
        for (int k = numElems; k > j; k--) {          // recorre arreglo en reversa desde el último índice hacia el índice j
            arr[k] = arr[k - 1];                      // copia valor de celda una hacia arriba
        }

        arr[j] = dato;                              // inserta dato en arreglo
        numElems++;                                 // incrementa número actual de elementos en arreglo
    }

//----------------------------------------------------------------------------------
// elimina dato de arreglo; retorna false si no se puede eliminar dato porque no existe en arreglo
    public boolean eliminar(long dato) {
        int j = busquedaBinaria(dato);      // realiza búsqueda de argumento dato en arreglo. Retorna índice con la ubicación de dato en arreglo

        if (j == -1) {                       // no se encontró elemento dato en arreglo
            return false;
        } else {
            for (int k = j; k < numElems; k++) {   // desplazar elementos arreglo hacia abajo a partir del índice j
                arr[k] = arr[k + 1];                // desplaza elemento hacia abajo
            }
            numElems--;                           // decrementa en uno la cantidad de elementos en el arreglo
        }
        return true;                              // todo bien, se borró elemento dato
    }
//--------------------------------------------------------------------------------
    // muestra contenido del arreglo

    public void mostrarArreglo() {
        for (int j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " ");   // imprime cada elemento seguido de un espacio
        }
        System.out.println("");               // salto de línea al final
    }

    //---------------------------------------------------------------------------
    // muestra el valor del elemento en la posición i del arreglo
    public long valorElemento(int i) {
        return arr[i];
    }

}
//Implementación del metodo Insertar
//Implementación del metodo eliminar
//Implementación del metodo mostrar arreglo
//Definición del metodo va elemento
//prueba de la clase arreglo ordenado
