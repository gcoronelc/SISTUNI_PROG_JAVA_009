package pe.egcc.proyectaimporte.prueba;

import java.math.BigDecimal;
import java.math.BigInteger;
import pe.egcc.proyectaimporte.model.ImporteModel;
import pe.egcc.proyectaimporte.service.ImporteService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    ImporteModel model = new ImporteModel();
    model.setCapital(BigDecimal.valueOf(356.78));
    model.setTasa(BigDecimal.valueOf(0.2));
    model.setPeriodos(BigInteger.valueOf(3));
    // Procesoq
    ImporteService service = new ImporteService();
    service.procesar(model);
    // Reporte
    System.out.println("Capital: " + model.getCapital());
    System.out.println("Tasa (mensual): " + model.getTasa());
    System.out.println("Periodo (meses): " + model.getPeriodos());
    System.out.println("Importe: " + model.getImporte());

    
  }
  
}
