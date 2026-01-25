

public class vehiculo {
    private String placas;
    private String tipo;
    private String horaEntrada;

    public vehiculo (){

    }

    public vehiculo (String placas, String tipo, String horaEntrada){
        this.placas = placas;
        this.tipo = tipo;
        this.horaEntrada = horaEntrada;
    }

    public String obtenerResumen(){
            return "Placas: " + placas + " Tipo: " + tipo + " Hora de entrada: " + horaEntrada ;
    }
    
    public void ActualizarHoraEntrada(String horaEntrada){
        this.horaEntrada = horaEntrada;
    }

    public String getPlacas(){
        return placas;
    }   
    public String getTipo(){
        return tipo;
    }

    public String getHoraEntrada(){
        return horaEntrada;
    }
    
    
}
