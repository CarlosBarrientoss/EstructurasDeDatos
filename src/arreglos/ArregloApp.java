package arreglos;

/**
 *
 * @author carlo
 */
public class ArregloApp {

    public static void main(String[] args) {
       
        long[] arr;         // referencia a arreglo        
        arr = new long[20]; // creacion arreglo con items del tipo primitivo long
        int numElems;       // variable que almacena el numero actual de items en el arreglo arr
        int j;              // indice de arreglo
        long buscarItem;
        
        // [ 77 | 99 | 44 | 55 | 22 ] 
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // insertar 10 items en el arreglo
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        
        numElems = 10;
        //
        for (j = 0; j < numElems; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        // busca item con valor 66 en arreglo
//        buscarItem = 33;
//        
//        for (j = 0; j < numElems; j++) {
//            if (arr[j] == buscarItem) { // se encontro item
//                break;  // salir del bucle for porque item se encontro
//            }
//        }
//
//        if (j == numElems) {  // se llego al final del arreglo, no se encontro item
//            System.out.println("No se pudo encontrar el numero " + buscarItem);
//        } else { // se encontro item
//            System.out.println("Se encontro numero " + buscarItem);
//        }
        
        // borra item con valor 55
        buscarItem = 77;
        for (j = 0; j < numElems; j++) {  // buscar item
            if (arr[j] == buscarItem) {   // item encontrado salir del bucle
                break;
            }
        }

       for (int k = j; k < numElems; k++) {  // mueve items superiores hacia abajo a partir del indice del item
           arr[k] = arr[k + 1];
       }
       numElems--;                   // reduce el numero de items en arreglo en 1
//-------------------------------------------------------------------------------------------------------
//// muestra o imprime items
       for (j = 0; j < numElems; j++) {
           System.out.print(arr[j] + " ");
      }
    }
}
