package pe.egcc.app.ejm05;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    
    List<Producto> lista = new ArrayList<>();
    
    lista.add(new Producto("Televisor", 1245.0, 20));
    lista.add(new Producto("Refrigeradora", 2345.0, 65));
    lista.add(new Producto("Juego de Sala", 2365.0, 23));
    lista.add(new Producto("Juego de Comedor", 8745.0, 87));
    lista.add(new Producto("Cocina", 1623.0, 21));
    lista.add(new Producto("Laptop", 4556.0, 69));
    
    for (Producto p : lista) {
      System.out.println(p.getNombre() + " - " + p.getPrecio() + " - " + p.getStock());
    }
  }
}
