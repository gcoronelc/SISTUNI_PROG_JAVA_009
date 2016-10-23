package pe.egcc.app.ejm05;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    
    Map<String,Object> rec = new HashMap<>();
    
    rec.put("java", 16);
    rec.put("sql", 10);
    rec.put("oracle", 18);
    rec.put("sql", 17);
    rec.put("net", "none");
    
    for(String key: rec.keySet()){
      System.out.println(key + " - " + rec.get(key).toString());
    }
    
  }
}
