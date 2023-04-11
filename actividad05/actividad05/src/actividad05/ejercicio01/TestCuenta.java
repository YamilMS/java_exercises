package actividad05.ejercicio01;

import java.io.IOException;
import static actividad05.ejercicio01.Utilidades.*;


public class TestCuenta{
    public static void main(String[] args) throws IOException {

        int opcion = 0; // En esta variable guardaremos las opciones numericas que proporciona el usuario
        double opcionDecimal= 0;
        Cuenta[] cuentas = new Cuenta[2];
        cuentas[0] = new Cuenta(1234568, 250000, "Laura Millonetis");
        cuentas[1] = new Cuenta(87654321, 1000, "Pablo mileurista");
        // Muestra un menu al usuario por consola
        do {
            System.out.println("\nSeleccione la funcion que quiere realizar");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Realizar transferencia");
            System.out.println("9. Finalizar el programa\n");
            opcion = pedirEntero("introduzca la operación a realizar");

            // Comprueba que la opcion introducida por el usuario esta en el rango de
            // opciones
            while (opcion < 1 || opcion > 9) {
                System.out.println("\nDebe introducir un numero entero entre el 0 y el 6\n");
                opcion = pedirEntero("introduzca la operación a realizar");
            }

            // Muestra un mensaje de despedida si el usuario introduce la opcion de salir
            // del programa
            if (opcion == 9) {
                System.out.println("\nGracias por utilizar el programa, hasta la vista\n");
            }

            //Switch stament que seleciona la operacion a realizar segun la opcion elegida por el usuario
            switch (opcion) {
                
                case 1:
                    for (int i=0; i<cuentas.length; i++){
                        System.out.println(i + "- " + cuentas[i].getNumeroDeCuenta() + "cuyo titular es: " + cuentas[i].getNombreTitular());
                    }
                    opcion= pedirEntero("Seleccione la cuenta en la que quiere consultar el saldo");
                    System.out.println(cuentas[opcion].getSaldo());
                    break;
                
                case 2:
                    for (int i=0; i<cuentas.length; i++){
                        System.out.println(i + "- " + cuentas[i].getNumeroDeCuenta() + "cuyo titular es: " + cuentas[i].getNombreTitular());
                    }
                    opcion= pedirEntero("Seleccione la cuenta en la que quiere ingresar dinero");
                    opcionDecimal= pedirEntero("Selecione la cantidad de dinero a ingresar");
                    cuentas[opcion].setSaldo(cuentas[opcion].getSaldo() + opcionDecimal);
                    System.out.println("El saldo actual es: " + cuentas[opcion].getSaldo());
                    break;
                      
                case 3:
                    for (int i=0; i<cuentas.length; i++){
                        System.out.println(i + "- " + cuentas[i].getNumeroDeCuenta() + "cuyo titular es: " + cuentas[i].getNombreTitular());
                    }
                    opcion= pedirEntero("Seleccione la cuenta en la que quiere sacar dinero");
                    opcionDecimal= pedirEntero("Seleccione la cantidad de dinero que quiere sacar");
                    cuentas[opcion].setSaldo(cuentas[opcion].getSaldo() - opcionDecimal);
                    System.out.println("El saldo actual es: " + cuentas[opcion].getSaldo());
                    break;
                    
                case 4:
                    for (int i=0; i<cuentas.length; i++){
                        System.out.println(i + "- " + cuentas[i].getNumeroDeCuenta() + "cuyo titular es: " + cuentas[i].getNombreTitular());
                    }
                    int opcion2;
                    opcion= pedirEntero("Seleccione la cuenta a la que quiere realizar una transferencia");
                    opcion2= pedirEntero("Seleccione la cuenta desde la que quiere realizar una transferencia");
                    opcionDecimal= pedirEntero("Seleccione la cantidad de dinero que quiere ingresarle");
                    cuentas[opcion].setSaldo(cuentas[opcion].getSaldo() - opcionDecimal);
                    cuentas[opcion2].setSaldo(cuentas[opcion2].getSaldo() + opcionDecimal);
                    System.out.println("El saldo actual del beneficiado es: " + cuentas[opcion].getSaldo() + "\n El saldo de la cuenta del pagador es: " + cuentas[opcion2].getSaldo());
                    break;
                    
            } 
        } while (opcion != 9);
    }
}

