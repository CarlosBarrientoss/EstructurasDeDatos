package arreglos;

/**
 *
 * @author carlo
 */
public class Arreglo {

    private long[] arr;              //referencia al arreglo con elementos tipo long
    private int numElems;            // número actual de elementos del arreglo 

    public Arreglo(int tam) {
        arr = new long[tam];         //crea el arreglo
        numElems = 0;                //arreglo inicia con 0 elementos
    }

    //método que busca un valor especifico en arreglo
    //el elemento dato especifica el valor del elemento
    public boolean buscar(long dato) {
        int j;
        for (j = 0; j < numElems; j++) {
            if (arr[j] == dato) {    //se encontré el elemento
                break;
            }
        }
        if (j == numElems) {            //llegó al final del arreglo
            return false;           //no se encontró el elemento buscado
        } else {
            return true;            // se encontró elemento
        }
    }

    //inserta un nuevo elemento en el arreglo
    public void insertar(long dato) {
        arr[numElems] = dato;       //inserta dato en arreglo
        numElems++;                 //Incrementa en uno el número de elemntos
    }

    // borra elemento del arreglo que sea igual al valor del argumento dato desplazando los valores del arreglo una celda hacía abajo
    public boolean eliminar(long dato) {
        int j;
        for (j = 0; j < numElems; j++) {    //busca el elemento en el arreglo
            if (arr[j] == dato) {       //se encontró el valor en el arreglo
                break;
            }
        }
        if (j == numElems) {            // no se encontró el valor buscado
            return false;
        } else {                      // valor encontrado en el arreglo
            for (int k = j; k < numElems - 1; k++) {   //desplaza elementos superiores al indice J
                arr[k] = arr[k + 1];
            }
            numElems--;
            return true;
        }
    }

    public void mostrarElementos() {
        for (int j = 0; j < numElems; j++) {   //recorre todos los elementos del arreglo
            System.out.println(arr[j] + "");  //imprime cada elemento del arreglo en consola
        }
        System.out.println("");  //*imprime línea en blanco
    }
    
    //muestra el valor del elemento en la posición i del arreglo
    public long valorElemento(int i){
        return arr[i];                   //retorna el valor del elemento en la posición i del arreglo
    }
}
