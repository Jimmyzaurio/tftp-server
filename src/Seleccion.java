import java.io.File;
import javax.swing.JFileChooser;

public class Seleccion {    
    public static void main (String[] args) {
        JFileChooser fileChooser = new JFileChooser(); 
        int resultado = fileChooser.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: "+f.getAbsolutePath());
        }
    } //main
}