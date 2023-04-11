package actividad05.ejercicio02;

import java.util.ArrayList;

public class Cucurucho extends Comida{
    private int numeroMaxBolas;

    ArrayList<SaborHelado> bolasDeHelado = new ArrayList<SaborHelado>();

    public Cucurucho(String nombre, double kcal, double precio, int numeroMaxBolas) {
        super(nombre, kcal, precio);
        this.numeroMaxBolas= numeroMaxBolas;
        Cucurucho.tipo= "cucurucho";
    }
    
    public void addBolaHelado(SaborHelado bolaHelado){
        if(bolasDeHelado.size()<numeroMaxBolas){
            bolasDeHelado.add(bolaHelado);
        }
    }

    public double calculaPrecioTotal(){
        double total= getPrecio();
        for(int i=0; i<bolasDeHelado.size(); i++){
            total+= bolasDeHelado.get(i).getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        String str = super.toString();
        for(int i=0; i<bolasDeHelado.size(); i++){
            str+= "\nbola" + i + "- " + bolasDeHelado.get(i).toString();
        }
        return str.indent(2);
    }

    
}
