package pe.egcc.app.ejm04;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    int[] notas = new int[5];
    
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(i + ".- " + nota);
    }
   
    notas[2] = 20;
    notas[1] = 15;
    
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(i + ".- " + nota);
    }
    
  }
  
}
