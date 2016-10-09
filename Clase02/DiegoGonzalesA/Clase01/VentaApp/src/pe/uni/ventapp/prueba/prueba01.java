
package pe.uni.ventapp.prueba;

import pe.uni.ventapp.service.VentaService;

public class prueba01 {
    
     public static void main(String[] args) {
         
        //Dato 
        double precio = 500.00;
        int cantidad = 20;
        
        //Proceso
        VentaService service = new VentaService();
        double importe = service.calcularImporte(precio, cantidad);
        double impuesto = service.calcularImpuesto(precio, cantidad);
        double total = service.calcularTotal(precio, cantidad);
        
        //Reporte   
        System.out.println("Precio del Producto: "+ precio);
        System.out.println("Cantidad de Pedidos: "+ cantidad);
        System.out.println("Importe del Pedido: "+ importe);
        System.out.println("Impuesto Aplicado (18%): "+ impuesto);
        System.out.println("Total a Pagar: "+ total);
    
     }   
    
}
