package pe.egcc.proyectaimporte.service;

import java.math.BigDecimal;
import pe.egcc.proyectaimporte.model.ImporteModel;

public class ImporteService {

  public void procesar(ImporteModel model) {
    // Variables
    BigDecimal importe;
    // Proceso  
    BigDecimal suma = model.getTasa().add(BigDecimal.valueOf(1.0));
    BigDecimal potenciaS = suma.pow(model.getPeriodos().intValue());
    importe = model.getCapital().multiply(potenciaS)
          .setScale(2, BigDecimal.ROUND_HALF_UP);
    // Reporte
    model.setImporte(importe);
  }

}
