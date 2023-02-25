import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        //declaramos el array de 5 elementos que contiene los recipientes inicializados en 0
        double [] recipientes = new double [5];
        
        //declaramos una variable que usaremos para el bufferedReader y otra para asignar el valor en int de esta variable
        String inputUsuario = "0";
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        //bucle para volver a mostrar el menú
        do {
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones");
            System.out.println("1- Añadir refresco a un recipiente");
            System.out.println("2- Quitar refresco de un recipiente");
            System.out.println("3- Calcular el total de refresco");
            System.out.println("0- Finalizar");
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
                        // Aquí el usuario elige el recipiente
                        System.out.println("Introduce el numero del recipiente del 0 al 4, por favor");
                        String inputRecipiente = br.readLine();
                        int recipiente = Integer.parseInt(inputRecipiente);
                        while(recipiente<0 || recipiente>4){
                            System.out.println("Ha introducido un valor fuera de rango. Introduce el numero del recipiente del 0 al 4, por favor");
                            inputRecipiente = br.readLine();
                            recipiente = Integer.parseInt(inputRecipiente);
                        }
    
                        // Aquí el usuario elige la cantidad y esta es asignada como valor al recipiente del array seleccionado
                        System.out.println("Introduce la cantidad a ingresar en el recipiente " + recipiente + ", por favor");
                        String inputCantidad = br.readLine();
                        double cantidad = Double.parseDouble(inputCantidad);
                        while(cantidad<0){
                            System.out.println("La cantidad de refresco debe ser positiva, prueba a introducir de nuevo la cantidad");
                            inputCantidad = br.readLine();
                            cantidad = Double.parseDouble(inputCantidad);
                        }
                        recipientes[recipiente] += cantidad;

                        // Por último recorremos el array mostrando los recipientes (indice) y su cantidad (valor)
                        System.out.println("");
                        System.out.println("----- El estado actual de los recipientes es: ");
                        for(int i= 0; i<recipientes.length; i++){
                            System.out.println("en el recipiente " + i + " hay " + recipientes[i] + " litros");
                        }
                        System.out.println("");
                        break;
    
                    case 2:
                        // Aquí el usuario elige el recipiente
                        System.out.println("Introduce el numero del recipiente del 0 al 4, por favor");
                        inputRecipiente = br.readLine();
                        recipiente = Integer.parseInt(inputRecipiente);
                        while(recipiente<0 || recipiente>4){
                            System.out.println("Ha introducido un valor fuera de rango. Introduce el numero del recipiente del 0 al 4, por favor");
                            inputRecipiente = br.readLine();
                            recipiente = Integer.parseInt(inputRecipiente);
                        }
    
                        // Aquí el usuario elige la cantidad y esta es asignada como valor al recipiente del array seleccionado
                        System.out.println("Introduce la cantidad a retirar en el recipiente " + recipiente + ", por favor");
                        inputCantidad = br.readLine();
                        cantidad = Double.parseDouble(inputCantidad);
                        double test = recipientes[recipiente] - cantidad;
                        while(cantidad<0 || test<0){
                            System.out.println("La cantidad de refresco debe ser positiva y no puede restar mas litros de los que hay, prueba a introducir de nuevo la cantidad");
                            inputCantidad = br.readLine();
                            cantidad = Double.parseDouble(inputCantidad);
                        }
                        recipientes[recipiente] -= cantidad;
                        // Por último recorremos el array mostrando los recipientes (indice) y su cantidad (valor)
                        System.out.println("");
                        System.out.println("----- El estado actual de los recipientes es: ");
                        for(int i= 0; i<recipientes.length; i++){
                            System.out.println("en el recipiente " + i + " hay " + recipientes[i] + " litros");
                        }
                        System.out.println("");
                        break;
    
                    case 3:
                        double resultado= 0;
                        for(int i= 0; i<recipientes.length; i++){
                            resultado += recipientes[i];
                            System.out.println("en el recipiente " + i + " hay " + recipientes[i] + " litros");
                        }
                        System.out.println("");
                        System.out.println("La cantidad total de litros que hay en todos los recipientes es: " + resultado);
                        System.out.println("");
                        break;
    
                    default:
                    System.out.println("");
                    System.out.println("------------------------------------------------------------------------------------------------");
                    System.out.println("Ha introducido un valor incorrecto, por favor seleccione una opción entre 0, 1, 2 y 3");
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