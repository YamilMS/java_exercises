package Actividad03.actividad03.main;
import java.io.IOException;

import static Actividad03.actividad03.introduceDatos.Pregunta.*; 
import static Actividad03.actividad03.operaciones.OperacionesLinkia.convertirLinkiaCoins;
import static Actividad03.actividad03.operaciones.Valores.*;


public class Ejercicio01 {
    public static void main(String args[]) throws IOException {
        int opcion = 0;
        double valor= 0;
        do {
            System.out.println();
            System.out.println("Seleccione la funcion que quiere realizar");
            System.out.println("1. Convertir dinero en Linkia Coins");
            System.out.println("2. Mostrar el número PI");
            System.out.println("3. Mostrar el valor Absoluto de un numero");
            System.out.println("4. Mostrar un número aleatorio entre el 0 y el número introducido");
            System.out.println("5. Mostrar el logaritmo en base E del numero introducido");
            System.out.println("6. Mostrar el resultado de elevar el primero número al segundo");
            System.out.println("7. Mostrar el seno del número introducido");
            System.out.println("8. Mostrar el coseno del número introducido");
            System.out.println("0. Finalizar el programa");
            System.out.println();
            opcion = pideEntero("Elija la operación que desea realizar");

            while(opcion< 0 || opcion >8){
                System.out.println();
                System.out.println("Debe introducir un numero entero entre el 0 y el 8");
                System.out.println();
                opcion = pideEntero("Elija la operación que desea realizar");
            }

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
                    muestraPI();
                    break;
                case 4:
                    muestraPI();
                    break;
                case 5:
                    muestraPI();
                    break;
                case 6:
                    muestraPI();
                    break;
                case 7:
                    muestraPI();
                    break;
                case 8:
                    muestraPI();
                    break;
            }
        } while (opcion != 0);

        if(opcion==0){
            System.out.println();
            System.out.println("Gracias por utilizar el programa, hasta la vista");
            System.out.println();
        }
        
        
    }
}