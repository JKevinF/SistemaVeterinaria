
package sistemaveterinaria;

import java.io.*;
import javax.swing.JOptionPane;


public class Archivo {
    File archivo;
    public void creararchivotxt(){
        archivo = new File("datos.txt");
        try {
            if (archivo.createNewFile()) {
                //System.out.println("Archivo creado con exito");
            }
            else {
                //System.out.println("Archivo existente");
            }
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
    private void eliminar(){
        if (archivo.delete()) {
            System.out.println("Archivo Eliminado con exito");
        } else {
            System.out.println("Error al eliminar archivo");
        }
    }
    public void escribir(Registro x){
        try {
            FileWriter escritura = new FileWriter(archivo);
            escritura.write(x.getNombredueño()+" : "+x.getDni()+
                    "\n"+x.getNombremascota()+"\n"+x.getRaza()+
                    "\n"+x.getSexo()+"\n"+x.getTratamiento());
            escritura.close();
            System.out.println("Registro completo");
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
    }
    public void leer(){
        String contenido;
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            
            contenido = lectura.readLine();
            while (contenido != null){
                System.out.println(contenido);
                contenido = lectura.readLine();
            }
            System.out.println("FIn de Registro");
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
        
    }
    /*
    public static void main(String[] args) {
            Archivo archivo = new Archivo();
            archivo.creararchivotxt();
            archivo.escribir();
    }*/
}
