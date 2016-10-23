package pe.egcc.app.service;

public final class Logueo {
    
    private Logueo(){}
    
    public static boolean logueo(String user, String password){
        boolean ingreso=false;
        
        if("admin".equals(user) && "admin".equals(password)) {
            ingreso = true;
        }
        return ingreso;
    }    
}
