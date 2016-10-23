

package pe.app.Model;

public class ventaView {
    public double preciou;
    public int cantidad;
    public String nombre;
    public double flete;
   public String lineaP;

    public ventaView(){
        this.flete=10;
        this.cantidad=0;
    }
    public ventaView(int cantidad, double preciou, String lineaP){
        this.cantidad=cantidad;
        this.lineaP=lineaP;
        this.preciou=preciou;
    }
   

     public double Flete()
        {
            return flete*cantidad;
        }
        public double importePagar()
        {
            return preciou * cantidad+ Flete();
        }
    
    
}
