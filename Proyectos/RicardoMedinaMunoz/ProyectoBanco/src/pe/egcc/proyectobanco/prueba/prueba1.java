/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectobanco.prueba;
import pe.egcc.proyectobanco.model.CuentaModelo;

/**
 *
 * @author RICARDO
 */
public class prueba1 {
  public static void main(String[] args) {
 
//se crea objeto cuenta1 sin parámetros
//se ejecuta el constructor por defecto
CuentaModelo cuenta1 = new CuentaModelo();

cuenta1.setNombre("Ricardo Medina");
cuenta1.setNumeroCuenta("11892-1234-122");
cuenta1.setTipoInteres(0.15);
cuenta1.setSaldo(500);

//se crea el objeto cuenta2 con los valores leidos por teclado
//se ejecuta el constructor con parámetros
CuentaModelo cuenta2 = new CuentaModelo("Jose Salazar Ruiz", "1245666", 0.35, 300);

//se crea cuenta3 como copia de cuenta1
//se ejecuta el constructor copia
CuentaModelo cuenta3 = new CuentaModelo(cuenta1);

//mostrar los datos de cuenta1
System.out.println("Nombre del titular: " + cuenta1.getNombre());
System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
System.out.println("Saldo: " + cuenta1.getSaldo());
System.out.println();
       
//se realiza un ingreso en cuenta1
cuenta1.ingreso(200);

//mostrar el saldo de cuenta1 después del ingreso
System.out.println("Saldo: " + cuenta1.getSaldo());

//se realiza un retiro en cuenta1
cuenta1.retiro(900);
System.out.println("Saldo: " + cuenta1.retiro(900));



//mostrar los datos de cuenta2
System.out.println("Datos de la cuenta 2");
System.out.println("Nombre del titular: " + cuenta2.getNombre());
System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
       
//mostrar los datos de cuenta3
System.out.println("Datos de la cuenta 3");
System.out.println("Nombre del titular: " + cuenta3.getNombre());
System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();
       
//realizar una transferencia de 10€ desde cuenta3 a cuenta2
cuenta3.transferencia(cuenta2, 10);
       
//mostrar el saldo de cuenta2
System.out.println("Saldo de la cuenta 2");
System.out.println("Saldo: " + cuenta2.getSaldo());
System.out.println();
       
//mostrar el saldo de cuenta3
System.out.println("Saldo de la cuenta 3");
System.out.println("Saldo: " + cuenta3.getSaldo());
System.out.println();
  

}
  }

