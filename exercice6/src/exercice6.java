import java.io.*;
import java.net.URL;

public class exercice6 {
    public static void main(String[] args) throws Exception {
        String pictureUrl = "http://images.fastcompany.com/upload/Simple.jpg"; //le chemin peut-etre modifié et pointer sur l'image copier a partir d'internet
        String destinationFile = "/C:/Users/trdni/Documents/Simple.jpg"; //le chemin dois etre modifié et pointer où sera enregistrer l'image

        saveImage(pictureUrl, destinationFile);
    }

    public static void saveImage(String pictureUrl, String destinationFile) throws IOException {
        URL url = new URL(pictureUrl);
        InputStream read = url.openStream(); //On ouvre un flux pour lire l'image
        OutputStream write = new FileOutputStream(destinationFile); //On ouvre un autre flux pour ecrire

        //On va s'interresser au traitement par Bytes
        byte[] i = new byte[2048];
        int length;

        while ((length = read.read(i)) != -1) {
            write.write(i, 0, length);
        }

        read.close();
        write.close();
    }

}