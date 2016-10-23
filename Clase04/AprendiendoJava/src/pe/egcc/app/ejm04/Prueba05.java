package pe.egcc.app.ejm04;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    int[] notas = {12,18,15,6,12,14,18,12,13,16,7};
    
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }
    
    System.out.println("-------------");
    notas = new int[]{20,18,15,14,18};
    
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }
    
  }
  
}
