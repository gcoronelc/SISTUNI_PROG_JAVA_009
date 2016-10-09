package pe.egcc.app.lib;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class PromedioService {

 // private int n;
 public double promedio(double n1, double n2) {
  double promedio;
  promedio = (n1 + n2) / 2;
  return promedio;
 }

 public double promedio(double n1, double n2, double n3) {
  double promedio;
  promedio = (n1 + n2 + n3) / 3;
  return promedio;
 }

 public double promedio(double n1, double n2, double n3, double n4) {
  double promedio;
  promedio = (n1 + n2 + n3 + n4) / 4;
  return promedio;
 }

 public double promedio(double n1, double n2, double n3, double n4, double n5) {
  double promedio;
  promedio = (n1 + n2 + n3 + n4 + n5) / 5;
  return promedio;
 }

}
