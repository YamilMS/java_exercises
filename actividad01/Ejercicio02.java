public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        //EJERCICIO 2.1:

        //Tipo de dato entero de 8 bits de longitud.
        boolean variableBoolean= true;
        System.out.println("Variable tipo boolean muestra un valor true o false de 8 bits. Ejemplo: " + variableBoolean);

        //Tipo de dato entero de 8 bits de longitud.
        Byte variableByte= 8;
        System.out.println("Variable tipo Byte muestra un número entero de 8 bits. Ejemplo: " + variableByte);

        //Tipo de dato entero de 16 bits de longitud.
        short variableShort= 16;
        System.out.println("Variable tipo short muestra un número entero de 16 bits. Ejemplo: " + variableShort);

        //Tipo de dato entero de 32 bits de longitud.
        int variableEntera= 32;
        System.out.println("Variable tipo int muestra números enteros de 32 bits. Ejemplo: " + variableEntera);

        //Tipo de dato entero de 64 bits de longitud.
        long variableLong= 64;
        System.out.println("Variable tipo long muestra números enteros de 64 bits. Ejemplo: " + variableLong);

        //Tipo de dato punto flotante de 32 bits de longitud.
        float variablePuntoFlotante= 32.1f;
        System.out.println("Variable tipo float muestra números decimales de 32 bits. Ejemplo: " + variablePuntoFlotante);
        
        //Tipo de dato número decimal de 32 bits de longitud.
        double variableDecimal= 64.55;
        System.out.println("Variable tipo double muestra números decimales de 64 bits. Ejemplo: " + variableDecimal);

        //Tipo de dato caracter de 16 bits.
        char variableChar= 'C';
        System.out.println("Variable tipo char muestra un caracter Unicode de 16 bits. Ejemplo: " + variableChar);

        //Tipo de dato String que almacena una cadena de caracteres.
        String variableString= "Soy una variable String";
        System.out.println("Variable tipo String muestra una cadena de caracteres. Ejemplo: " + variableString);
        

        //EJERCICIO 2.2:
        int tempResul=5;
        System.out.println("--Operadores Aritmeticos--");
        System.out.println("El resultado de 1 + 3 es: " + (1 + 3));
        System.out.println("El resultado de 5 - 2 es: " + (5 - 2));
        System.out.println("El resultado de 2 * 4 es: " + (2 * 4));
        System.out.println("El resultado de 4 / 2 es: " + (4 / 2 ));
        System.out.println("El resultado de 4 % 2 es: " + (4 % 2 ));
        System.out.println("--Operadores Unitarios--");
        tempResul++;
        System.out.println("El resultado de 5++ es: " + tempResul);
        tempResul--;
        System.out.println("El resultado de 6-- es: " + tempResul);
        tempResul= -tempResul;
        System.out.println("El resultado de variable = -5 es: " + tempResul);
        System.out.println("El resultado de variable = !true es: " + (variableBoolean= !true));
        System.out.println("--Operadores Asignación--");
        System.out.println("El resultado de asignar un valor (5) a una variable mediante el oprador '=' es " + (tempResul = 5));
        System.out.println("El resultado de 5+= 5 es " + (tempResul += 5));
        System.out.println("El resultado de 10-= 5 es " + (tempResul -= 5));
        System.out.println("El resultado de 5*= 2 es " + (tempResul *= 2));
        System.out.println("El resultado de 10/= 2 es " + (tempResul /= 2));
        System.out.println("El resultado de 5%= 5 es " + (tempResul %= 5));
        System.out.println("--Operadores Relacionales--");
        tempResul=5;
        System.out.println("El resultado de compara 5== 10 es: " + (tempResul==10));
        System.out.println("El resultado de compara 5!= 10 es: " + (tempResul!=10));
        System.out.println("El resultado de compara 5> 6 es: " + (tempResul>6));
        System.out.println("El resultado de compara 5< 10 es: " + (tempResul<10));
        System.out.println("El resultado de compara 5>= 10 es: " + (tempResul>=10));
        System.out.println("El resultado de compara 5<= 5 es: " + (tempResul<=5));
        System.out.println("--Operadores Lógicos--");
        System.out.println("El resultado de true && false es: " + (true && false));
        System.out.println("El resultado de false || true es: " + (false || true));
        System.out.println("El resultado de !false es: " + (!false));
    }

}
