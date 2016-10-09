
package pe.uni.ventapp.prueba;

import pe.uni.ventapp.service.VentaService2;

public class prueba02 {
    
    public static void main(String[] args) {
        
        double precio = 100.4;
        int cantidad = 8;
        double igv = 0.2;


        VentaService2 service = new VentaService2(precio, cantidad, igv);
        
        double importe = service.calcularImporte();
        double impuesto = service.calcularImpuesto();
        double total = service.calcularTotal();
        
        
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("IGV: "+igv);
        System.out.println("************************");
        System.out.println("*PROCESANDO INFORMACIÓN*");
        System.out.println("************************");
        System.out.println("Importe: "+ importe);
        System.out.println("Impuesto: "+ impuesto );
        System.out.println("Total: "+ total);
        
    }
    
}
