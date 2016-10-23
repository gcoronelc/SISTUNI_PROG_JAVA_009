/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectobanco.prueba;
import pe.egcc.proyectobanco.service.InteresSimple;
import pe.egcc.proyectobanco.service.InteresCompuesto;
/**
 *
 * @author RICARDO
 */
public class prueba2 {
  public static void main(String[] args) {
    
    double principal = 2000;
        double interes = 0.15;
        int meses =5;
        
        //InteresSimple
        InteresSimple simple = new InteresSimple(principal, interes, meses);
        System.out.println("Monto final: " + simple.getResultado());
        
      //InteresCompuesto
        InteresCompuesto compuesto = new InteresCompuesto(principal, interes, meses);
        //compuesto.mostrarResultado();
      System.out.println("Monto final: " + compuesto.getResultado());
  }
}
