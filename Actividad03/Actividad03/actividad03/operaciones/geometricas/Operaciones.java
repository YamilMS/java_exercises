package Actividad03.actividad03.operaciones.geometricas;

public class Operaciones {
    /**
     * Esta clase contiene operaciones geometricas que muestran 
     * por consola el resultado de hacer operaciones con angulos 
     **/

    //Declaramos una variable para pasar los inpunt del usuario a radianes para realizar los calculos en los metodos de la clase
    static double radianes;

    public static void muestraSeno(double valor){
        //Calcula el seno del valor introducido por el usuario y lo muestra por consola
        radianes= Math.toRadians(valor);
        System.out.println();
        System.out.println("El sen(" + valor +"º) de su numero es: " + Math.sin(radianes));
        System.out.println();
    }
    public static void muestraCoseno(double valor){
        //Calcula el coseno del valor introducido por el usuario y lo muestra por consola
        radianes= Math.toRadians(valor);
        System.out.println();
        System.out.println("El cos(" + valor +"º) de su numero es: " + Math.cos(radianes));
        System.out.println();
    }

}
