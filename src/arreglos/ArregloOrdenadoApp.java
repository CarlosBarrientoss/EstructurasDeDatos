package arreglos;

/**
 *
 * @author carlo
 */
public class ArregloOrdenadoApp {

    public static void main(String[] args) {
        // 1. Creamos arreglo con 30 elementos
        int tamMax = 30;                    // tamaño máximo del arreglo
        ArregloOrdenado arrOrd;             // referencia a la clase ArregloOrdenado

        arrOrd = new ArregloOrdenado(tamMax);  // crea la instancia de la clase ArregloOrdenado
        // con un tamaño maximo de elementos para el arreglo 
        // igual a variable tamMax

        // 2. Insertamos 10 valores al arreglo
        arrOrd.insertar(77);
        arrOrd.insertar(99);
        arrOrd.insertar(44);
        arrOrd.insertar(55);
        arrOrd.insertar(22);
        arrOrd.insertar(89);
        arrOrd.insertar(11);
        arrOrd.insertar(0);
        arrOrd.insertar(66);
        arrOrd.insertar(34);

        // 3. Imprimimos valores de arreglo arrOrd
        arrOrd.mostrarArreglo();

// 4. Buscamos elemento en arreglo
        long buscar = 55;
        int posicion;

        posicion = arrOrd.busquedaBinaria(buscar);

        if (posicion != -1) {
            System.out.println("Se encontró elemento " + buscar + " en la posición " + posicion);
        } else {
            System.out.println("No se encontró el elemento " + buscar);
        }
// 5. Borrar items del arreglo
        arrOrd.eliminar(0);
        arrOrd.eliminar(55);
        arrOrd.eliminar(99);

// 6. Mostrar valores del arreglo arrOrd
        arrOrd.mostrarArreglo();

    }
}
