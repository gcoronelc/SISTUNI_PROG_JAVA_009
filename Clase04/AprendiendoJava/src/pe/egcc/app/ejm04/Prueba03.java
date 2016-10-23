package pe.egcc.app.ejm04;

import java.util.Arrays;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    int notas[] = {10,15,20,18,10,16};
    
    Arrays.stream(notas).forEach(n -> System.out.println(n) );
    
    System.out.println("Mayor: " + 
            Arrays.stream(notas).max().getAsInt() );
    System.out.println("Mayor: " + 
            Arrays.stream(notas).average().getAsDouble() );
    
    System.out.println("------------");
    
    Arrays.stream(notas).filter(n -> n>15)
            .forEach(n -> System.out.println(n) );
    
  }
  
}
