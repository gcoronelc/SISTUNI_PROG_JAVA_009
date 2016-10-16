package pe.egcc.MyMath.service;

public class MyMathlService {
    
    public long CalcularFactorial(long numeroEntero){
        
        long numFactorial=1;
        for (int i = 1; i <= numeroEntero; i++) {
            numFactorial=numFactorial*i;
        }
        return numFactorial;
    }
    
}
