package Actividad03.actividad03.introduceDatos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pregunta {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String inputUsuario= "";

    public static int pideEntero(String pregunta){
        int entero= 0;
        boolean preguntar= true;
        System.out.println(pregunta);

        do{
            try {
                inputUsuario = br.readLine();
                entero = Integer.parseInt(inputUsuario);
                preguntar= false;
            } catch (Exception e) {
                System.out.println();
                System.out.println("Introduce un numero entero sin decimales de 0 a 8");
                System.out.println();
                preguntar= true;
            };
        }while(preguntar);

        return entero;
    }

    public static double pideDouble(String pregunta){
        double numDecimal= 0.0;
        boolean preguntar= true;
        System.out.println(pregunta);

        do{
            try {
                inputUsuario = br.readLine();
                numDecimal = Integer.parseInt(inputUsuario);
                preguntar= false;
            } catch (Exception e) {
                System.out.println("Introduce un numero entero sin decimales de 0 a X");
                preguntar= true;
            };
        }while(preguntar);

        return numDecimal;
    }
}
