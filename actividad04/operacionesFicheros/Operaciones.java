package operacionesFicheros;

import java.io.*;

public class Operaciones {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String inputUsuario= "";
    static String sep = File.separator;
    static String saltoLinea = System.getProperty("line.separator");
 
    public static void nuevoArchivo(String rutaCarpetaArchivos) throws IOException{
        System.out.println("Seleccione el nombre que quiere asignarle a su archivo, no olvide asignarle una extension de archivo");
        inputUsuario = br.readLine();
        File newArchivo= new File(rutaCarpetaArchivos + sep + inputUsuario);

        System.out.println("Introduce el texto que desee en su archivo " + inputUsuario);
        inputUsuario = br.readLine();
        FileWriter fw = new FileWriter(newArchivo); //Stream conectado al fichero a escribir.
        BufferedWriter bw = new BufferedWriter(fw);   //Buffer que almacena datos hacia el stream
        bw.write(inputUsuario + saltoLinea); //guarda los datos en el buffer con un salto de linea

        bw.flush();   //envía los datos que queden al buffer
        bw.close();   //se liberan los recursos asignados al outputStream
    }

    public static File[] listarArchivos (String rutaCarpetaArchivos) throws IOException{
        File carpetaArchivos = new File(rutaCarpetaArchivos);
        File[] archivos = carpetaArchivos.listFiles();
        System.out.println("Estos son los archivos contenidos en el directorio: " + rutaCarpetaArchivos);
        for(int i=0; i<archivos.length; i++) {
            if (archivos[i].isFile()) {
                System.out.println(i+1 + " - " + archivos[i].getName());
                System.out.println("La ruta de este archivo es: " + archivos[i].getPath());
            }
         }
        return archivos;
    }
}
