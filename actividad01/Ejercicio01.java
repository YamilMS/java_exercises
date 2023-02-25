import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        int manzanas_tienda;

        int manzanas_queremos_comprar;

        double precio_manzana;

        double dinero_pagado;

        int mangos_tienda;
        
        int mangos_queremos_comprar;

        double precio_mango;

 

        manzanas_tienda = 20;

        manzanas_queremos_comprar = 2;

        precio_manzana = 0.40;

        mangos_tienda= 30;

        precio_mango= 2.00;

 

        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");

        // modificamos el contenido de las variables numericas para representar la

        // compra de manzanas

        dinero_pagado = precio_manzana * manzanas_queremos_comprar;

        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;

 

        // mostramos por consola el valor de las variables numericas. De forma implícita

        // se convierte de de numero a string.

        System.out.println("Nos han costado:" + dinero_pagado);

        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");

 

        System.out.println("Quantas mazanas más quieres comprar?");

        // Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".

        // Las variables del tipo "BufferedReader" contienen funciones para leer datos

        // por consola

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // utilizamos la función "readLine" de la variable "br" para leer un dato por

        // consola. Guardamos el número introducido en la variable "valor_escrito"

        String valor_escrito = br.readLine();

 

        /*

         * Convertimos mediante una conversion explicita la variable "valor_escrito" a

         * un valor entero para poder operar con él y lo almacenamos en la variable

         */

        manzanas_queremos_comprar = Integer.parseInt(valor_escrito);

 

        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");

        // modificamos el contenido de las variables numericas para representar la

        // compra de manzanas

        dinero_pagado = precio_manzana * manzanas_queremos_comprar;

        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;

        // mostramos por consola el valor de las variables numericas. De forma implícita

        // se convierte de de numero a string.

        System.out.println("Nos han costado:" + dinero_pagado);

        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");
        

        System.out.println("En la tienda hay " + mangos_tienda + " mangos a " + precio_mango + "euros la unidad");

        System.out.println("Cuantos mangos quieres comprar?");

        String valor_escrito_mangos= br.readLine();
 
        mangos_queremos_comprar= Integer.parseInt(valor_escrito_mangos);

        System.out.println("Vamos a comprar " + mangos_queremos_comprar + " mangos");

        dinero_pagado = precio_mango * mangos_queremos_comprar;

        mangos_tienda = mangos_tienda - mangos_queremos_comprar;

        System.out.println("Nos han costado:" + dinero_pagado);

        System.out.println("En la tienda quedan " + mangos_tienda + " mangos");
        

    }

}