import java.io.*;

public class exercice3 {
    public static void main(String[] args) {
        String rep = "/C:/Users/trdni/Documents";

        File repFile = new File(rep);

        File[] fichiersTxt = repFile.listFiles(new FileFilter() {

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