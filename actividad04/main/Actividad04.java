package main;

import java.io.File;
import java.io.IOException;

import static introduceDatos.Pregunta.pideEntero;
import static operacionesFicheros.Operaciones.*;

class Actividad04 {
    public static void main(String[] args) throws IOException {

        int opcion = 0; // En esta variable guardaremos las opciones numericas que proporciona el usuario
        String rutaProyecto = System.getProperty("user.dir"); //Obtenemos la ruta del directorio del usuario
        String sep = File.separator; //Obtenemos el caracter que usa OS del cliente como separador
        String carpetaArchivos = rutaProyecto + sep + "archivos"; //Creamos la ruta hacia el directorio que queremos por defecto
        File carpeta = new File(carpetaArchivos); //En la variable carpeta creamos un File con el path correcto
        if (!carpeta.exists()) { 
            carpeta.mkdir(); //Verificamos si dicho directorio existe y de no hacer así lo creamos.
        }


        // Muestra un menu al usuario por consola
        do {
            System.out.println("\nSeleccione la funcion que quiere realizar");
            System.out.println("1. Nuevo archivo");
            System.out.println("2. Listar archivos");
            System.out.println("3. Muestra un archivo");
            System.out.println("4. Borrar un archivo");
            System.out.println("5. Renombrar un archivo");
            System.out.println("6. Reemplazar caracteres de un archivo");
            System.out.println("0. Finalizar el programa\n");
            opcion = pideEntero("introduzca la operación a realizar");

            // Comprueba que la opcion introducida por el usuario esta en el rango de
            // opciones
            while (opcion < 0 || opcion > 6) {
                System.out.println("\nDebe introducir un numero entero entre el 0 y el 6\n");
                opcion = pideEntero("introduzca la operación a realizar");
            }

            // Muestra un mensaje de despedida si el usuario introduce la opcion de salir
            // del programa
            if (opcion == 0) {
                System.out.println("\nGracias por utilizar el programa, hasta la vista\n");
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

                case 3:
                    String[] directoriosMostrar= listarArchivos(carpetaArchivos);
                    int posicionMostrar= pideEntero("Introduce el archivo que desea visualizar");
                    if(posicionMostrar<=directoriosMostrar.length){
                        muestraArchivo(directoriosMostrar[posicionMostrar-1]);
                    } else{
                        System.out.println("\nNo existe el archivo que desea mostrar");
                    }
                    break;

                case 4:
                    String[] directoriosBorrar= listarArchivos(carpetaArchivos);
                    int posicionBorrar= pideEntero("Introduce el archivo que desea eliminar");
                    if(posicionBorrar<=directoriosBorrar.length){
                        borrarArchivo(directoriosBorrar[posicionBorrar-1]);
                    } else{
                        System.out.println("\nNo existe el archivo que desea borrar");
                    }
                    break;
                 
                case 5:
                    String[] directoriosRenombrar= listarArchivos(carpetaArchivos);
                    int posicionRenombrar= pideEntero("Introduce el archivo que desea renombrar");
                    if(posicionRenombrar<=directoriosRenombrar.length){
                        renombrarArchivo(directoriosRenombrar[posicionRenombrar-1]);
                    } else{
                        System.out.println("\nNo existe el archivo que desea renombrar");
                    }
                    break;

                case 6:
                    String[] directoriosReemplazar= listarArchivos(carpetaArchivos);
                    int posicionReemplazar= pideEntero("Introduce el archivo que desea reemplazar");
                    if(posicionReemplazar<=directoriosReemplazar.length){
                        reemplazarCaracteres(directoriosReemplazar[posicionReemplazar-1]);
                    } else{
                        System.out.println("\nNo existe el archivo que desea modificar");
                    }
                    break;
            } 
        } while (opcion != 0);
    }
}