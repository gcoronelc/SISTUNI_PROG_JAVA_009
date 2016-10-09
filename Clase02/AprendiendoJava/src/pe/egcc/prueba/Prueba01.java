package pe.egcc.prueba;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total = 100;
    
    // Proceso
    double[] repo = new double[3];
    for (int i = 0; i < repo.length; i++) {
      repo[i] = redondear(total / 3);
    }
    
    // Reporte
    double suma = 0.0;
    for (int i = 0; i < repo.length; i++) {
      double d = repo[i];
      System.out.println("Tramo " + i + ": " + d);
      suma += d;
    }
    System.out.println("Suma: " + suma);
    
  }

  private static double redondear(double d) {
    d *= 100;
    d = Math.round(d) /100.0;
    return d;
  }

  
}
