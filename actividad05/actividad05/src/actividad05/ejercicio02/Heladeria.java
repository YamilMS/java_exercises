package actividad05.ejercicio02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static actividad05.ejercicio02.Utilidades.pedirEntero;

public class Heladeria {
    public static void main(String[] args) throws IOException {
        int opcion=0;
        ArrayList<Vendible> pedido = new ArrayList<Vendible>();

        pedido.add(new Loteria(119383939, 3.5));
        pedido.add(new Horchata("Horchata", 20, 2.5, 250, 30));
        pedido.add(new Cucurucho("Cucurucho de galleta", 20, 1, 2));
        pedido.add(new Cucurucho("Cucurucho de chocolate", 25, 1.5, 2));

        ((Cucurucho) pedido.get(2)).addBolaHelado(new SaborHelado("vainilla", 30, 1, 15, "azucar"));
        ((Cucurucho) pedido.get(2)).addBolaHelado(new SaborHelado("cholate", 15, 1, 15, "aspartamo"));
        ((Cucurucho) pedido.get(3)).addBolaHelado(new SaborHelado("cookies", 35, 1.25, 20, "azucar"));
        ((Cucurucho) pedido.get(3)).addBolaHelado(new SaborHelado("fresa", 10, 1, 5, "aspartamo"));
        
        

        do {
            System.out.println("\nQuiere realizar alguna operacion?");
            System.out.println("1. Sustituir un pedido por una horchata");
            System.out.println("2. Ver pedido actual");
            System.out.println("0. Finalizar el programa\n");

            System.out.println("\nInformacion del pedido:");
            double costePedido=0;
            for(int i=0; i<pedido.size(); i++){
                System.out.println(i + "-" + pedido.get(i));
                if(pedido.get(i) instanceof Cucurucho){
                    costePedido+=((Cucurucho) pedido.get(i)).calculaPrecioTotal();
                } else{
                    costePedido+= pedido.get(i).getPrecio();
                }
            }
            System.out.println("El coste total del pedido es de: " + costePedido + "\n");

            opcion = pedirEntero("introduzca la operación a realizar");

            // Comprueba que la opcion introducida por el usuario esta en el rango de
            // opciones
            while (opcion < 0 || opcion > 2) {
                System.out.println("\nDebe introducir un numero entero entre el 0 y el 2\n");
                opcion = pedirEntero("introduzca la operación a realizar");
            }

            // Muestra un mensaje de despedida si el usuario introduce la opcion de salir
            // del programa
            if (opcion == 0) {
                System.out.println("\nGracias por utilizar el programa, hasta la vista\n");
            }

            //Switch stament que seleciona la operacion a realizar segun la opcion elegida por el usuario
            switch (opcion) {
                
                case 1:
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String inputUsuario= "";
                    double decimal;
                    opcion= pedirEntero("Indica el numero del producto que desea modificar");
                    pedido.set(opcion, new Horchata("null", costePedido, costePedido, opcion, costePedido));
                    System.out.println("Nombre de la horchata?");
                    inputUsuario= br.readLine();
                    ((Comida) pedido.get(opcion)).setNombre(inputUsuario);
                    System.out.println("Precio?");
                    inputUsuario= br.readLine();
                    decimal = Double.parseDouble(inputUsuario);
                    ((Comida) pedido.get(opcion)).setPrecio(decimal);
                    System.out.println("Kcal?");
                    inputUsuario= br.readLine();
                    decimal = Double.parseDouble(inputUsuario);
                    ((Comida) pedido.get(opcion)).setKcal(decimal);
                    System.out.println("Cantidad de horchata?");
                    inputUsuario= br.readLine();
                    decimal = Double.parseDouble(inputUsuario);
                    ((Horchata) pedido.get(opcion)).setCantidad(decimal);
                    System.out.println("Que porcentaje de chufa tiene?");
                    inputUsuario= br.readLine();
                    decimal = Double.parseDouble(inputUsuario);
                    ((Horchata) pedido.get(opcion)).setPorcentajeChufa(decimal);
                    break;
                
                case 2:
                    System.out.println("Informacion del pedido:");
                    costePedido=0;
                    for(int i=0; i<pedido.size(); i++){
                        System.out.println(i + "-" + pedido.get(i));
                        if(pedido.get(i) instanceof Cucurucho){
                            costePedido+=((Cucurucho) pedido.get(i)).calculaPrecioTotal();
                        } else{
                            costePedido+= pedido.get(i).getPrecio();
                        }
                    }
                    System.out.println("El coste total del pedido es de: " + costePedido);
                    break;  
            } 
        } while (opcion != 0);
    }
}
