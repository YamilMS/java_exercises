package actividad05.ejercicio02;

public class Horchata extends Comida {
    private double cantidad;
    private double porcentajeChufa;
    

    public Horchata(String nombre, double kcal, double precio, double cantidad, double porcentajeChufa) {
        super(nombre, kcal, precio);
        this.cantidad = cantidad;
        this.porcentajeChufa = porcentajeChufa;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPorcentajeChufa() {
        return porcentajeChufa;
    }
    public void setPorcentajeChufa(double porcentajeChufa) {
        this.porcentajeChufa = porcentajeChufa;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidad= " + cantidad + "ml, porcentajeChufa= " + porcentajeChufa + "%";
    }
    
}
