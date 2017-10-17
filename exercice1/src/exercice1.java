import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exercice1 {
    public static void main(String[] args){

        File file = new File("/C:/Users/trdni/Documents/test.txt");

        System.out.println("Chemin absolu du fichier :" + file.getAbsolutePath());
        System.out.println("Nom du fichier : " + file.getName());
        System.out.println("Est-ce qu'il existe ? " + file.exists());
        System.out.println("Est-ce un répertoire ? " + file.isDirectory());
        System.out.println("Est-ce un fichier ? " + file.isFile());
    }

}
