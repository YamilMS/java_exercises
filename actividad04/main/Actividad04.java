package main;

import java.io.File;
import java.io.IOException;

import static introduceDatos.Pregunta.pideEntero;
import static operacionesFicheros.Operaciones.*;

class Actividad04 {
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        String rutaProyecto = System.getProperty("user.dir");
        String sep = File.separator;
        String carpetaArchivos = rutaProyecto + sep + "archivos";
        // String saltoLinea = System.getProperty("line.separator");
        File carpeta = new File(carpetaArchivos);
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }


        // Muestra un menu al usuario por consola
        do {
            System.out.println();
            System.out.println("Seleccione la funcion que quiere realizar");
            System.out.println("1. Nuevo archivo");
            System.out.println("2. Listar archivos");
            System.out.println("3. Muestra un archivo");
            System.out.println("4. Borrar un archivo");
            System.out.println("5. Renombrar un archivo");
            System.out.println("6. Reemplazar caracteres de un archivo");
            System.out.println("0. Finalizar el programa");
            System.out.println();
            opcion = pideEntero("introduzca la operación a realizar");

            // Comprueba que la opcion introducida por el usuario esta en el rango de
            // opciones
            while (opcion < 0 || opcion > 6) {
                System.out.println();
                System.out.println("Debe introducir un numero entero entre el 0 y el 6");
                System.out.println();
                opcion = pideEntero("introduzca la operación a realizar");
            }

            // Muestra un mensaje de despedida si el usuario introduce la opcion de salir
            // del programa
            if (opcion == 0) {
                System.out.println();
                System.out.println("Gracias por utilizar el programa, hasta la vista");
                System.out.println();
            }

            //Switch stament que seleciona la operacion a realizar segun la opcion elegida por el usuario
            switch (opcion) {
                case 1:
                    System.out.println();
                    nuevoArchivo(carpetaArchivos);
                    break;
                case 2:
                    listarArchivos(carpetaArchivos);
                    break;
                /* 
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
                */
            } 
        } while (opcion != 0);
    }
}