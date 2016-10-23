package pe.egcc.app.ejm04;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba06 {
  
  public static void main(String[] args) {
    int[][] notas = new int[20][4];
    
    Random rnd = new Random();
    for (int i = 0; i < notas.length; i++) {
      int[] nota = notas[i];
      for (int j = 0; j < nota.length; j++) {
        nota[j] = rnd.nextInt(20) + 1;
      }
    }
    
    for (int i = 0; i < notas.length; i++) {
      int[] nota = notas[i];
      String fila = "";
      for (int n : nota) {
        fila += n + "\t";
      }
      System.out.println(fila);
    }
    
  }
}
