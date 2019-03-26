public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    // contruct

    public Horario(){

    }

    public Horario(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    // Getters

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public int getSegundo(){
        return this.segundo;
    }

    // Setters

    public void setHora(int h){
        this.hora = h;
    }

    public void setMinuto(int m){
        this.minuto = m;
    }

    public void setSegundo(int s){
        this.segundo = s;
    }
}