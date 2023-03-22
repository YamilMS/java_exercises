package operacionesFicheros;

import java.io.*;

public class Operaciones {

    /**
     * En Operaciones vamos a encontrar una serie de metodos que nos permiten crear, escribir, mostrar, leer, borrar
     * renombrar y modificar archivos
     */

     //Se declaran variables globales que van a usar los metodos de la clase Operaciones
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Lee el input del usuario por teclado.
    static String inputUsuario= "";
    static String sep = File.separator; //obtiene el separador que usa el OS del cliente
    static String saltoLinea = System.getProperty("line.separator"); //obtiene el salto de linea que usa el OS del cliente
    

    //
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

    //
    public static String[] listarArchivos (String rutaCarpetaArchivos) throws IOException{
        File carpetaArchivos = new File(rutaCarpetaArchivos);
        File[] archivos = carpetaArchivos.listFiles();
        String[] dirArchivos = new String[archivos.length];
        System.out.println("Estos son los archivos contenidos en el directorio: " + rutaCarpetaArchivos);
        for(int i=0; i<archivos.length; i++) {
            if (archivos[i].isFile()) {
                System.out.println(i+1 + " - " + archivos[i].getName());
                dirArchivos[i]= archivos[i].getPath();
            }
         }
        return dirArchivos;
    }

    //
    public static void muestraArchivo(String archivo) throws IOException{
        File showFile = new File(archivo);
        FileReader fr = new FileReader(showFile); //Stream conectado al fichero a leer.        
        BufferedReader brFile = new BufferedReader(fr); //Buffer que almacena datos del stream
        for( String linea=brFile.readLine(); linea != null; linea=brFile.readLine()){
            System.out.println("\n" + linea);  //mostramos por consola el texto leído
        } 
        brFile.close();
    }

    //
    public static void borrarArchivo(String archivo) throws IOException{
        try{
            File documento = new File(archivo);
            if(documento.delete()){
                System.out.println(documento.getName() + " borrado con exito");
            } else {
                System.out.println("Error al borrar el archivo");
            }
        }catch(Exception e){
            System.out.println("Error en el bloque try de la funcion borrarArchivo");
        }  
    }

    //
    public static void renombrarArchivo(String archivo) throws IOException{
        String rutaProyecto = System.getProperty("user.dir");
        String rutaFile= rutaProyecto + sep + "archivos";
        try{
            System.out.println("Seleccione el nombre con el que quiere renombrar el archivo");
            inputUsuario = br.readLine();
            File newName= new File(rutaFile + sep + inputUsuario);
            File documento = new File(archivo);
            if(documento.renameTo(newName)){
                System.out.println(documento.getName() + " renombrado con exito");
            } else {
                System.out.println("Error al borrar el archivo");
            }
        }catch(Exception e){
            System.out.println("Error en el bloque try de la funcion borrarArchivo");
        }  
    }

    //
    public static void reemplazarCaracteres (String archivo) throws IOException{
        try{
            RandomAccessFile raf= new RandomAccessFile(archivo, "rw");
            System.out.println("Seleccione el caracter que desea reemplazar");
            inputUsuario = br.readLine();
            char caracterReemplazado = inputUsuario.charAt(0);
            System.out.println("Seleccione el caracter que quiere que aparezca");
            inputUsuario = br.readLine();
            while (raf.getFilePointer() < raf.length()) {
                byte ch = raf.readByte(); 
                if(caracterReemplazado == ch){
                    raf.seek(raf.getFilePointer()-1);
                    raf.writeBytes(inputUsuario);
                }
            }
            raf.close();
        }catch(Exception e){
            System.out.println("Error en el bloque try de la funcion reemplazarCaracteres");
        }
    }
}
