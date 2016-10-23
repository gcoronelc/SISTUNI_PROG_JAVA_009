package pe.egcc.app.ejm05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

  public static void main(String[] args) {
    List<String> ciudades = new ArrayList<>();
    
    ciudades.add("Chiclayo");
    ciudades.add("Madrid");
    ciudades.add("Santiago");
    ciudades.add("Buenos Aires");
    ciudades.add("Malos Aires");
    
    for (String c : ciudades) {
      System.out.println(c);
    }
  }
  
}
