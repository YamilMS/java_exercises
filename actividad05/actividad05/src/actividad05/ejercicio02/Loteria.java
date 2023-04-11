package actividad05.ejercicio02;

public class Loteria implements Vendible {
    private double precio;
    private int numeroDeLoteria;

    public Loteria(){

    }

    public Loteria(int numeroDeLoteria, double precio) {
        this.numeroDeLoteria = numeroDeLoteria;
        this.precio = precio;
    }

    public int getNumeroDeLoteria() {
        return numeroDeLoteria;
    }

    public void setNumeroDeLoteria(int numeroDeLoteria) {
        this.numeroDeLoteria = numeroDeLoteria;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio= precio;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "Loteria [numero= " + numeroDeLoteria + ", precio= "+ precio + "e]";
    }

}
