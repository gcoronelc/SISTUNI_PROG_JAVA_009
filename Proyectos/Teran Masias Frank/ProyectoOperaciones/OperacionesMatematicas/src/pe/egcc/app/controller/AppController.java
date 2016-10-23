package pe.egcc.app.controller;

import pe.egcc.app.service.Logueo;
import pe.egcc.app.service.MyMath;

public class AppController {
    
    public long factorial(int n){
        return MyMath.factorial(n);
    }
    
    public boolean esPrimo(int n){
        return MyMath.esPrimo(n);
    }
    
    public int mcd(int n1, int n2){
        return MyMath.mcd(n1, n2);
    }
    
    public int mcm(int n1, int n2){
        return MyMath.mcm(n1, n2);
    }
    
    public String fibonacci(int n){
        return MyMath.fibonacci(n);
    }
    
    public boolean loguear(String cad1, String cad2){
        return Logueo.logueo(cad1, cad2);
    }
    
    public boolean esCapicua(int n){
        return MyMath.esCapicua(n);
    }
}
