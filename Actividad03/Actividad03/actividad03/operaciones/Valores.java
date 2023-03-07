package Actividad03.actividad03.operaciones;

public class Valores {
    /**
     * Esta clase contiene metodos que muestran diferentes valores del parametro usado en cada metodo.
     **/
    
    public static void muestraPI(){
        System.out.println();
        System.out.println("El número PI es: " + Math.PI);
        System.out.println();
    }

    public static void muestraValorAbsoluto(double valor){
        System.out.println();
        System.out.println("El valor absoluto de " + valor + " es: " + Math.abs(valor));
        System.out.println();
    }

    public static void muestraValorAleatorio(int valor){
        System.out.println();
        System.out.println("Su numero aleatorio entre 0 y " + valor + " es: " + Math.floor(Math.random()*(valor+1)));
        System.out.println();
    }

}
