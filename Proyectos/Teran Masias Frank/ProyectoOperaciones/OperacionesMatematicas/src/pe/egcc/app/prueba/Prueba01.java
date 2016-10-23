/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.prueba;

import pe.egcc.app.service.Logueo;
import pe.egcc.app.service.MyMath;

/**
 *
 * @author S61851
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        System.out.println("El factorial de 5 es: " + MyMath.factorial(5));
        System.out.println("El numero 5 "+ MyMath.esPrimo(5));
        System.out.println("El Máximo como un Divisor de 3 y 5 es:"+ MyMath.mcd(48, 60));
        System.out.println("El Minimo como un Multiplo de 3 y 5 es:"+ MyMath.mcm(48, 60));
        System.out.println("La serie de Fibonacci de 0:"+ MyMath.fibonacci(5));
        System.out.println("Ingreso:" + Logueo.logueo("admin", "admin"));
        System.out.println("El numero es :" + (MyMath.esCapicua(12321)));
    }
    
}
