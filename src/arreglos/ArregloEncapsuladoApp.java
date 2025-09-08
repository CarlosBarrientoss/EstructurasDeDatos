package arreglos;

/**
 *
 * @author carlo
 */
public class ArregloEncapsuladoApp {
    public static void main(String[] args) {
      // 1. crear un arreglo con tamaño de 30 elementos
      // 2. insetar 10 elementos en el arreglo
      // 3. imprimir los valores del arreglo en pantalla
      // 4. buscamos el elemento en el arreglo
      // 5. borramos 3 elementos del arreglo
      // 6. imprimir valores del arreglo
      
      // 1. crear un arreglo con tamaño de 30 elementos
      int tamanoArreglo = 30;
      Arreglo arr;
      arr = new Arreglo(tamanoArreglo);
      
      // 2. insetar 10 elementos en el arreglo
      arr.insertar(77);
      arr.insertar(99);
      arr.insertar(44);
      arr.insertar(55);
      arr.insertar(22);
      arr.insertar(88);
      arr.insertar(11);
      arr.insertar(0);
      arr.insertar(66);
      arr.insertar(33);
      
      // 3. imprimir los valores del arreglo en pantalla
      arr.mostrarElementos();
      
      // 4. buscamos el elemento en el arreglo
      int valorBuscar = 35;
      if(arr.buscar(valorBuscar)){
          System.out.println("Se encontró el valor " + valorBuscar);
      }else{
          System.out.println("No se encontró el valor " + valorBuscar); 
      }
      
      // 5. borramos 3 elementos del arreglo
      arr.eliminar(0);
      arr.eliminar(55);
      arr.eliminar(99);
      
      // 6. imprimir valores del arreglo
      arr.mostrarElementos();
    }
}
