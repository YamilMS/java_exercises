package actividad05.ejercicio02;

public abstract class Comida implements Vendible {
    static String tipo= "Comida";
    private String nombre;
    private double precio;
    private double kcal;

    public Comida(String nombre, double kcal, double precio) {
        this.nombre = nombre;
        this.kcal = kcal;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        Comida.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getKcal() {
        return kcal;
    }
    public void setKcal(double kcal) {
        this.kcal = kcal;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", kcal= " + kcal + ", precio= " + precio + "e";
    }

    
}
