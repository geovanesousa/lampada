package br.com.geovanesousa.lampada;

public class Lampada {
    
    int wattsLampada = 0;
    
    public Lampada(){
        this.wattsLampada = 60;
        System.out.println("Lampada de "+this.wattsLampada+" watts.");
    }
    public Lampada(int numeroDeWattsDaLampada){
        this.wattsLampada = numeroDeWattsDaLampada;
        System.out.println("Lampada de "+this.wattsLampada+" watts.");
    }
    
}
