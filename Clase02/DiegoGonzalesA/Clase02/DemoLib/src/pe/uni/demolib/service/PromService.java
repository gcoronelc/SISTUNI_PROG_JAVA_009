package pe.uni.demolib.service;

import pe.uni.app.lib.PromedioService;

class PromService {
             
    public static void main(String[] args) {
        
        PromedioService p1 = new PromedioService();
          
        System.out.println("Caso 1: " + p1.promedio(34, 50));
        System.out.println("Caso 2: " + p1.promedio(34, 50, 32));
        System.out.println("Caso 3: " + p1.promedio(34, 50, 12, 44));
   
    }
       
      
      
    
}
