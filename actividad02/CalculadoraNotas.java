import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class CalculadoraNotas {
    public static void main(String args[]) throws IOException { 
        //declaramos la matriz que vamos a utilizar en el ejercicio
        String [][] notas = {
          {"M01", "M02", "M03", "M04"}, 
          {"8", "9", "3", "10"}, 
          {"5", "8", "7", "4"}, 
          {"10", "9", "6", "9"}
        };
        
        //declaramos una variable que usaremos para el bufferedReader y otra para asignar el valor en int de esta variable
        String inputUsuario = "0";
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        //bucle para volver a mostrar el menú
        do {
            for(int i=0; i<notas.length; i++){
              for(int j=0; j<notas[i].length; j++){
                  System.out.print(notas[j][i] + " ");
              }
              System.out.println();
            }

            System.out.println("Introduzca una accion a realizar:");
            System.out.println("1- Mostrar el nombre de todas las asignaturas");
            System.out.println("2- Modificar el nombre de una asignatura");
            System.out.println("3- Modificar la puntuación de una asignatura");
            System.out.println("4- Mostrar la puntuación menor de cada asignatura");
            System.out.println("0- Salir");
            System.out.println("Por favor introduzca la opcion elegida: ");
           
            try {
                inputUsuario = br.readLine();
                opcion = Integer.parseInt(inputUsuario);
            } catch (IOException ex) {
                System.out.println("Error al intentar acceder al teclado");
            }
            
            //En caso de que el usuario elija la opción 0 se le muestra un mensaje de despedida
            if(opcion!= 0){
                switch (opcion) {
                    case 1:
                        // Se recorre la primera fila mostrando los valores que son los nombres de las asignaturas
                        System.out.println("");
                        System.out.println("Las asignaturas son: ");
                       for(int x=0; x<notas[0].length; x++){
                        System.out.print(notas[0][x] + "  ");
                       }
                       System.out.println("");
                       System.out.println("");
                        break;
                       
                    case 2:
                        System.out.println("Introduce la posición de la asignatura a modificar. Esto es un valor del 0 al 3");
                          String inputPosicionAsignatura = br.readLine();
                          int posicionAsignatura = Integer.parseInt(inputPosicionAsignatura);
                       
                        while(posicionAsignatura< 0 || posicionAsignatura> 3){
                            System.out.println("Ha introducido un valor fuera de rango. Introduce el numero del recipiente del 0 al 3, por favor");
                            inputPosicionAsignatura = br.readLine();
                            posicionAsignatura = Integer.parseInt(inputPosicionAsignatura);
                        }
                        System.out.println("Introduce el nuevo nombre la asignatura");
                        String inputModificacion = br.readLine();
                        String modificacion = inputModificacion;
                        notas[0][posicionAsignatura]= modificacion;
                        break;
    
                    case 3:
                        System.out.println("Introduce la posición de la asignatura a modificar. Esto es un valor del 0 al 3");
                        inputPosicionAsignatura = br.readLine();
                        posicionAsignatura = Integer.parseInt(inputPosicionAsignatura);
                    
                       while(posicionAsignatura< 0 || posicionAsignatura> 3){
                           System.out.println("Ha introducido un valor fuera de rango. Introduce un numero del 0 al 3, por favor");
                           inputPosicionAsignatura = br.readLine();
                           posicionAsignatura = Integer.parseInt(inputPosicionAsignatura);
                       }
                       System.out.println("Introduce la posición de la nota a modificar. Esto es un valor del 1 al 3");
                       String inputPosicionNota = br.readLine();
                       int posicionNota = Integer.parseInt(inputPosicionNota);

                       while(posicionNota< 1 || posicionNota> 3){
                        System.out.println("Ha introducido un valor fuera de rango. Introduce el numero del recipiente del 1 al 3, por favor");
                        inputPosicionNota = br.readLine();
                        posicionNota = Integer.parseInt(inputPosicionAsignatura);
                      }

                       System.out.println("Introduce la nueva nota");
                       inputModificacion = br.readLine();
                       modificacion = inputModificacion;

                       notas[posicionNota][posicionAsignatura]= modificacion;
                       break;
                    
                    case 4:
                     
                      for(int y=0; y<notas.length; y++){
                        System.out.print( "La nota menor de la asignatura " + notas[0][y] + " es: ");
                        int min = Integer.parseInt(notas[1][y]); 
                        for (int z = 0; z< notas[y].length; z++){
                          if(z!=0){
                            int notasInteger= Integer.parseInt(notas[z][y]); 
                              if(notasInteger < min || notasInteger==min){
                                min = notasInteger;
                              }
                            }
                          }
                        System.out.print(min);
                        System.out.println();
                      }
                      break;
                       
                    default:
                    System.out.println("");
                    System.out.println("------------------------------------------------------------------------------------------------");
                    System.out.println("Ha introducido un valor incorrecto, por favor seleccione una opción entre 0, 1, 2, 3 y 4");
                    System.out.println("------------------------------------------------------------------------------------------------");
                    System.out.println("");
                }
            } else{
                System.out.println("");
                System.out.println("Gracias por utilizar la calculadora de refresco, hasta la vista");
                System.out.println("");
            }
            
            //hasta que el usuario no introduzca un 0 se ejecutará el bule
        } while (opcion != 0);

      } 
}
