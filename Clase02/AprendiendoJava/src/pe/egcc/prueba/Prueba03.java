package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    Producto pA = new Producto();
    
    mostrar(pA);
    
    pA.setNombre("Pepsi Cola");
    
    mostrar(pA);
    
    Producto pB = new Producto("Empanada de Algo", 6.70, 1000, true);
    
    mostrar(pB);
  }

  private static void mostrar(Producto p) {
    System.out.println("---------------------");
    System.out.println("Nombre : " + p.getNombre());
    System.out.println("Precio : " + p.getPrecio());
    System.out.println("Stock  : " + p.getStock());
    System.out.println("Activo : " + p.isActivo());
  }
}
