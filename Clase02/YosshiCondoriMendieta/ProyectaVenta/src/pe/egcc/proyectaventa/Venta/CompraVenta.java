/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.proyectaventa.Venta;

/**
 *
 * @author Alumno
 */
public class CompraVenta {
    
    private final double  IGV = 0.18;
    public double impuesto(double producto, double cantidad){
        double impuesto;
        impuesto = (producto * cantidad)* IGV;
        return impuesto;
    }

    public double producto_total(double producto, double cantidad){
        double productototal;
        
        productototal= producto + impuesto(producto, cantidad);
        
        return productototal;
        
    }
    
    public double total(double cantidad, double producto){
        double total_;
        
        total_=producto_total(producto, cantidad)* cantidad;
        return total_;
    }
}
