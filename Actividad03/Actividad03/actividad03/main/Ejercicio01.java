package Actividad03.actividad03.main;
import java.io.IOException;
import static Actividad03.actividad03.introduceDatos.Pregunta.*; 
import static Actividad03.actividad03.operaciones.OperacionesLinkia.convertirLinkiaCoins;
import static Actividad03.actividad03.operaciones.Valores.*;
import static Actividad03.actividad03.operaciones.aritmeticas.Operaciones.*;
import static Actividad03.actividad03.operaciones.geometricas.Operaciones.*;


public class Ejercicio01 {
    public static void main(String args[]) throws IOException {
        int opcion = 0;
        double valor= 0;

        //Muestra un menu al usuario por consola
        do {
            System.out.println();
            System.out.println("Seleccione la funcion que quiere realizar");
            System.out.println("1. Convertir dinero en Linkia Coins");
            System.out.println("2. Mostrar el número PI");
            System.out.println("3. Mostrar el valor Absoluto de un numero");
            System.out.println("4. Mostrar un número aleatorio entre el 0 y el número introducido");
            System.out.println("5. Mostrar el logaritmo en base E del numero introducido");
            System.out.println("6. Mostrar el resultado de elevar el primero número al segundo");
            System.out.println("7. Mostrar el seno del angulo introducido");
            System.out.println("8. Mostrar el coseno del angulo introducido");
            System.out.println("0. Finalizar el programa");
            System.out.println();
            opcion = pideEntero("Elija la operación que desea realizar");

            //Comprueba que la opcion introducida por el usuario esta en el rango de opciones
            while(opcion< 0 || opcion >8){
                System.out.println();
                System.out.println("Debe introducir un numero entero entre el 0 y el 8");
                System.out.println();
                opcion = pideEntero("Elija la operación que desea realizar");
            }

            //Muestra un mensaje de despedida si el usuario introduce la opcion de salir del programa
            if(opcion==0){
                System.out.println();
                System.out.println("Gracias por utilizar el programa, hasta la vista");
                System.out.println();
            }

            //Switch stament que seleciona la operacion a realizar segun la opcion elegida por el usuario
            switch (opcion) {
                case 1:
                    System.out.println();
                    valor= pideDouble("Introduce la cantidad de dinero que quiere convertir a Linkia coins");
                    convertirLinkiaCoins(valor);
                    
                    break;
                case 2:
                    muestraPI();
                    break;
                case 3:
                    System.out.println();
                    valor= pideDouble("Introduce un numero para calcular su valor abosluto");
                    muestraValorAbsoluto(valor);
                    break;
                case 4:
                    System.out.println();
                    opcion= pideEntero("Introduce un número para calcular un valor aleatorio entre 0 y ese numero");
                    muestraValorAleatorio(opcion);
                    break;
                case 5:
                    System.out.println();
                    valor= pideDouble("Introduce un numero para calcular su logaritmo base E");
                    muestraLogaritmo(valor);
                    break;
                case 6:
                    double valorSecundario;
                    System.out.println();
                    valor= pideDouble("Introduce un numero que será la base de la potencia");
                    valorSecundario= pideDouble("Introduce un numero que será la potencia");
                    calculaPotencia(valor, valorSecundario);
                    break;
                case 7:
                    System.out.println();
                    valor= pideDouble("Introduce un angulo para calcular su seno");
                    muestraSeno(valor);
                    break;
                case 8:
                    System.out.println();
                    valor= pideDouble("Introduce un angulo para calcular su coseno");
                    muestraCoseno(valor);
                    break;
            }
        } while (opcion != 0);
        
        
    }
}