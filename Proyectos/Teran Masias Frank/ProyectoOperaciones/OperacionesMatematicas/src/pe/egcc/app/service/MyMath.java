package pe.egcc.app.service;

public final class MyMath {
    
    private MyMath(){
    }
    
    public static long factorial(int n){
        
        long xfactorial=1 ;
        for (; n > 1 ; xfactorial *= n--);
        return xfactorial;
    }
    
    public static boolean esPrimo(int n){
        int contadorResiduo=0;
        boolean primo=false;
         for (int i = 1; i <= n; i++) {
            if((n%i)==0){
                contadorResiduo+=1;
            }
        }
        
        if(contadorResiduo<=2){
            primo=true;
        }
        
        return primo;
    }
    
    public static int mcd(int n1, int n2){
        int mcd = 0;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        return mcd;
    }
    
    public static int mcm(int n1, int n2) {
        int mcm;
        int a = Math.max(n1, n2);
        int b = Math.min(n1, n2);
        mcm = (a/mcd(a, b))*b;
        return mcm;
    }
    
    public static String fibonacci (int n){
        int num1 = 1, num2 = 0;
        String serieFibo;
        
        serieFibo= "" + num2;
        serieFibo=serieFibo + " " + num1;
        
        for(int i = 0; i < n; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            serieFibo=serieFibo + " " + num1;
        }
        return serieFibo;
    }
    
    public static boolean esCapicua(int n){
        long resto, falta, numeroInvertido=0;
        boolean capicua = false;
        
        falta = n;
        while(falta!=0){
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }
        
        if(numeroInvertido == n){
            capicua=true;
        }
        return capicua;
    }
}
