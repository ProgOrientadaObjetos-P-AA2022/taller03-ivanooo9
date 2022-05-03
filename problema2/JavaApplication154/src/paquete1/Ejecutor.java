package paquete1;

public class Ejecutor {
    
    public static void main(String[] args) {
   
    EquivalenteHora eh = new EquivalenteHora();    
    int Horas = 12; 
    int Minutos = 30; 
    int Dias = 30;
    int Segundos = 30;
    
    eh.establecerHoras(Horas); 
    eh.establecerMinutos(Minutos); 
    eh.establecerDias(Dias); 
    eh.establecerSegundos(Segundos);     
    
    System.out.printf("");
    
    }
      
}

