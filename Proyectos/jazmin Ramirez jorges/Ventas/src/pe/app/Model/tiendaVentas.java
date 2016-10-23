
package pe.app.Model;


public class  tiendaVentas extends ventaView {
 //por cada venta realizada se cobra un fletario segun categoria
//si la cantidad es >= 10 hay un descuento 
    public tiendaVentas(int cantidad, double preciou, String lineaP ){
        super(cantidad, preciou,lineaP);
     }
    public tiendaVentas(){
    }  
    private final double Igv=0.18;
    public double fletario() {
            if (lineaP == "Electrodomesticos")
            {

                flete = 20;
             }
            else if (lineaP == "Muebles"){

                flete = 15;
            }
            else{
            flete = 10;
            }
            return flete*cantidad;
        }

//polimorfismo
@Override
        public double importePagar(){
            
            return fletario()+ cantidad*preciou;

        }
       
  
        public double descuento(){
            if (cantidad >= 10){
               return redondear(0.07 * importePagar());
            }else{
                return 0;
               
            }

        }
         
        

  public double redondear(double resultado) {
   //Variables
        int entero;
        int i;
        double red;
        //Convirtiendo a número con dos dígitos decimales. 
        entero = (int) (resultado * 100);
        red = entero / 100.0;
        //Extrayendo el tercer dígito decimal
        i = (int) ((resultado - red) * 1000);
        //Condición para incrementar el segundo dígito decimal 
        if (i >= 5) {
            resultado = (red + 0.01);
        } else {
            resultado = red;
        }

        return resultado;

    }
      
    public double neto() {
           
             return importePagar() - descuento();

        }

 
    public double precioFinal(){
    double finalP= neto()*1.18;
    return redondear(finalP);
    }

  }
    
    

