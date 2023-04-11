package actividad05.ejercicio02;

public class SaborHelado extends Comida {
    private double porcentajeGrasa;
    private String edulcorante;

    public SaborHelado(String nombre, double kcal, double precio, double porcentajeGrasa, String edulcorante) {
        super(nombre, kcal, precio);
        this.porcentajeGrasa= porcentajeGrasa;
        this.edulcorante= edulcorante;
    }

    @Override
    public String toString() {
        return super.toString() + ", grasa=" + porcentajeGrasa + "% , edulcorante=" + edulcorante;
    }
    
    
}
