import java.io.*;
import java.net.URL;

public class exercice6 {
    public static void main(String[] args) throws Exception {
        String pictureUrl = "http://images.fastcompany.com/upload/Simple.jpg";
        String destinationFile = "/C:/Users/trdni/Documents/Simple.jpg";

        saveImage(pictureUrl, destinationFile);
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream read = url.openStream();
        OutputStream write = new FileOutputStream(destinationFile);

        byte[] i = new byte[2048];
        int length;

        while ((length = read.read(i)) != -1) {
            write.write(i, 0, length);
        }

        read.close();
        write.close();
    }

}