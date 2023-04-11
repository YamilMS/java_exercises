package actividad05.ejercicio01;

public class Cuenta {
    private int numeroDeCuenta;
    private double saldo;
    private String nombreTitular;

    public Cuenta(int numeroDeCuenta, double saldo, String nombreTitular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }
    
    public Cuenta(){}
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
}
