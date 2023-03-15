package introduceDatos;
    
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pregunta {
    /**
     * Esta clase contiene una serie de metodos que reciben un input de usuario y lo transforman en un valor númerico haciendo
     * las correspondientes validaciones para obtener un output valido
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String inputUsuario= "";

    public static int pideEntero(String pregunta){
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
                System.out.println("Introduce un numero entero sin decimales de 0 a 6");
                System.out.println();
                preguntar= true;
            };
        }while(preguntar);

        return entero;
    }

}
