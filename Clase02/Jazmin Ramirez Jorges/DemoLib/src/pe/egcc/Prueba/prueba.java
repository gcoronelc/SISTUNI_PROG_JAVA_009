/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.Prueba;


import pe.egcc.app.lib.PromedioService;

/**
 *
 * @author B202-09
 */
public class prueba {

 public static void main(String[] args) {

  PromedioService ed = new PromedioService();
  int n1 = 2;
  int n2 = 4;
  int n3 = 6;
  int n4 = 8;
  int n5 = 10;
  System.out.println("El promedio de" + n1 + "y" + n2 + "es:" + ed.promedio(n1, n2));
  System.out.println("El promedio de" + n1 + "," + n2 + "y" + n3 + "es:" + ed.promedio(n1, n2, n3));
  System.out.println("El promedio es:" + ed.promedio(n1, n2, n3, n4));
  System.out.println("El promedio es:" + ed.promedio(n1, n2, n3, n4, n5));
 }
}
