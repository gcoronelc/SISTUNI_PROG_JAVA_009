
package RegistroUsuario;

import javax.swing.JOptionPane;


public class Registro {
    public Registro(){
        
        
    }
    String sexo = "";
    Integer dia=0 , mes=0 , año=0 ;
    //creando variables
    
    public void getFecha(String a, String b , String c){
        //convirtiendo a enteros
        dia= Integer.parseInt(a);
        mes= Integer.parseInt(b);
        año= Integer.parseInt(c);
                
        
        
    }
    
    public void getSexo(String radio){
        sexo=radio;
        
    }
    
    public void mostrardatos(){
        JOptionPane.showMessageDialog( null, " Registrado " +dia+"/" +mes+"/" + año );
        JOptionPane.showMessageDialog(null,"El sexo seleccionado es : " +sexo );
        
    }
}
