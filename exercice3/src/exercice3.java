import java.io.*;

public class exercice3 {
    public static void main(String[] args) {
        String rep = "/C:/Users/trdni/Documents"; //le chemin dois etre modifié et pointer sur un dossier.

        File repFile = new File(rep);

        File[] fichiersTxt = repFile.listFiles(new FileFilter() {

            //On creer notre boolen qui nous servira de filtre
            //Le .txt peut-etre modifié par tout type d'extentions
            public boolean accept(File pathname) {
                String fileName = pathname.getName();

                return fileName.endsWith(".txt");
            }

        });

        for (File fichierTxt : fichiersTxt) {
            System.out.println(fichierTxt.getName());
        }

    }
}