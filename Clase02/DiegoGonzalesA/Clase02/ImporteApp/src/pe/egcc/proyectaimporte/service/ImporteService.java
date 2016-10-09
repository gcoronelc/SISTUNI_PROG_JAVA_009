package pe.egcc.proyectaimporte.service;

import java.math.BigDecimal;
import java.math.MathContext;
import pe.egcc.proyectaimporte.model.ImporteModel;

public class ImporteService {

  public void procesar(ImporteModel model) {
    // Variables
    BigDecimal importe;
    //BigDecimal v1 = new BigDecimal(1);
    //MathContext mc = new MathContext(4); // 4 precision
    
   // Proceso  
   
    BigDecimal suma = model.getTasa().add(BigDecimal.valueOf(1.0));
    BigDecimal potenciaS = suma.pow(model.getPeriodos().intValue());
    importe = model.getCapital().multiply(potenciaS);
    
    /*total = model.getPrecio()
            .multiply(BigDecimal.valueOf(model.getCant().intValue()));
    BigDecimal divisor = BigDecimal.valueOf(1.0 + IGV);
    importe = total.divide(divisor,2,BigDecimal.ROUND_HALF_UP);
    impuesto = total.subtract(importe);*/
    
    // Reporte
    model.setImporte(importe);

  }

}
