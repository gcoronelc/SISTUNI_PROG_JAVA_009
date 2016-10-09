package pe.egcc.proyectaimporte.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ImporteModel {

  // Datos
  private BigDecimal capital;
  private BigDecimal tasa;
  private BigInteger periodos;
  // Resultado
  private BigDecimal importe;

  public ImporteModel() {
  }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public BigInteger getPeriodos() {
        return periodos;
    }

    public void setPeriodos(BigInteger periodos) {
        this.periodos = periodos;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }



}
