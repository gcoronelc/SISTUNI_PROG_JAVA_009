
package pe.app.Model;


public class premiumVentas extends tiendaVentas {
    //descuento fijo del 10%
    //polimorfismo
    @Override
    public double descuento(){
        
               return redondear(0.10 * importePagar());
          
    }
    public double neto(){
           
             return importePagar() - descuento();

        }
    //aplicando IGV
    public double precioFinal(){
    double finalP= neto()*1.18;
    return redondear(finalP);
}
    
    
    
    
}
