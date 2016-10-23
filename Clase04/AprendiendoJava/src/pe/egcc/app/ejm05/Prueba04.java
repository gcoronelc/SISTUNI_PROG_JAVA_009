package pe.egcc.app.ejm05;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    Map rec = new HashMap();
    
    rec.put("producto", "Televisor");
    rec.put("precio", 1567.89);
    rec.put("cant", 2);
    rec.put("total", 3135.78);
    
    for(Object key: rec.keySet()){
      System.out.println(key.toString() +
              " - " + rec.get(key).toString());
    }
    
  }
  
}
