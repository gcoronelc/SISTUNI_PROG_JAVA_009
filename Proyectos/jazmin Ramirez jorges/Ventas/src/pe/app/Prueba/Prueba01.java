/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.app.Prueba;
import pe.app.Model.tiendaVentas;
/**
 *
 * @author Cesar
 */
public class Prueba01 {
    public static void main(String[] args) {
        tiendaVentas vent=new tiendaVentas(10,100,"Electrodomesticos");
        
        System.out.println("El tipo de linea es:"+vent.lineaP);
        System.out.println("El descuentoes:"+vent.descuento());
        System.out.println("El importe es:"+vent.importePagar());
        System.out.println("El flete es:"+vent.fletario());
        System.out.println("El Neto es:"+vent.neto());
        System.out.println("El total es:"+vent.precioFinal());
    }
}
