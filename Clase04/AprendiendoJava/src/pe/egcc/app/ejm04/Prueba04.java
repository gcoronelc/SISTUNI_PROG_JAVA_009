package pe.egcc.app.ejm04;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    
    String[] nombres = new String[5];
    
    for (int i = 0; i < nombres.length; i++) {
      String nombre = nombres[i];
      System.out.println(i + ".- " + nombre);
    }
    
    nombres[1] = "Chiclayo";
    nombres[2] = "Arequipa";
    
    for (int i = 0; i < nombres.length; i++) {
      String nombre = nombres[i];
      System.out.println(i + ".- " + nombre);
    }
    
  }
}
