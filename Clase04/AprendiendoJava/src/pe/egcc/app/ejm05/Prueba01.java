package pe.egcc.app.ejm05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    List lista = new ArrayList();
    
    lista.add(1);
    lista.add(123.45);
    lista.add("Gustavo");
    lista.add(new Random());
    lista.add(new int[]{12,14,65,23,78});
    
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(lista.get(i));      
    }
    
    System.out.println("--------------");
    for (Object object : lista) {
      System.out.println(object);
    }
    
    System.out.println("---------------");
    
    Random r = (Random) lista.get(3);
    System.out.println(r.nextInt(60));
    
    int[] a = (int[]) lista.get(4);
    for (int i : a) {
      System.out.println(i);
    }
  }
  
}
