package pe.egcc.prueba;

import pe.egcc.service.PruebaService;

public class Prueba02 {

  public static void main(String[] args) {
    PruebaService service = new PruebaService();
    System.out.println("Caso 1: " + service.promedio(34, 50));
    System.out.println("Caso 2: " + service.promedio(34, 50, 32));
    System.out.println("Caso 3: " + service.promedio(34, 50, 12, 44));
    System.out.println("Caso 4: " + service.promedio(34, 50, 56, 23,78));
  }
  
}