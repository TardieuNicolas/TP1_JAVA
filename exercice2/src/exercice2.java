import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exercice2 {
    public static void main(String[] args){

        File file = new File("/C:/Users/trdni/Documents");
        String[] names = file.list();

        System.out.println("Chemin absolu du fichier :" + file.getAbsolutePath());
        System.out.println("Est-ce bien un répertoire ? " + file.isDirectory());

        String[] listeFichiers;
        File[] files = file.listFiles();

        File repertoire = new File("/C:/Users/trdni/Documents" );
        listeFichiers = repertoire.list();

        for (int i = 0; i < listeFichiers.length; i++)
            if (files[i].isFile() == true){
                System.out.println("Fichier: " + listeFichiers[i]);
            }



    }

}
