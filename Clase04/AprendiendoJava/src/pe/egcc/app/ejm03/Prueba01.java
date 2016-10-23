package pe.egcc.app.ejm03;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    Clase1 o1 = new Clase3();
    Object o2 = o1;
    Clase2 o3= (Clase2) o1;
    Clase3 o4 = (Clase3) o1;
  }

  
}
