package paquete1;

public class EquivalenteHora {
    private int Horas;
    private int Minutos;
    private int Segundos;
    private int Dias;
    
    public void establecerHoras(int c){
        Horas = c;
    }
    public void establecerMinutos(int c){
        Minutos = c;
    }
    public void establecerSegundos(int c){
        Segundos = c;
    }
    public void establecerDias(int c){
        Dias = c;
    }
    
// public void establecerValorFactura(){
    public int obtenerHoras(){
        return Horas;
    }
    
    
    public int obtenerMinutos(){
        return Minutos;
    }
    
    public int obtenerValorSegundos(){
        return Segundos;
    }
    
    public int obtenerValorDias(){
        return Dias;
    }    
  
}