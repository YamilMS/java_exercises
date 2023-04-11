package actividad05.ejercicio02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilidades {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String inputUsuario= "";

    public static int pedirEntero(String pregunta){
        //Convierte el input del usuario en un integer
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
                System.out.println("Introduce un numero entero sin decimales");
                System.out.println();
                preguntar= true;
            };
        }while(preguntar);

        return entero;
    }
}
