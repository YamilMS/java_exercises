package Actividad03.actividad03.operaciones.aritmeticas;

public class Operaciones {
    /**
     * Esta clase contiene metodos para hacer operaciones aritmeticas y mostrar su valor por consola
     */

    public static void muestraLogaritmo(double valor){
        //Calcula el logaritmo en base E del parametro y lo muestra por pantalla
        System.out.println();
        System.out.println("El logaritmo en base E de su numero es: " + Math.log(valor));
        System.out.println();
    }
    public static void calculaPotencia(double valor1, double valor2){
        //Eleva el primer parametro al segundo y lo muestra por pantalla
        System.out.println();
        System.out.println("El resultado de elevar " + valor1 + " a " + valor2 + " es: " + Math.pow(valor1, valor2));
        System.out.println();
    }

}
