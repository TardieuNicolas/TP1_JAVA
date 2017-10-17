import java.io.*;

public class exercice5 {
    public static void main(String[] args) {
        FileInputStream read = null;
        FileOutputStream write = null;

        try{
            read = new FileInputStream(new File("/C:/Users/trdni/Documents/Simple.jpg"));
            write = new FileOutputStream(new File("/C:/Users/trdni/Documents/SimpleCopy.jpg"));
            byte[] buffer = new byte[8];
            int i = 0;

            while ((i = read.read(buffer)) >= 0){
                write.write(buffer);
                System.out.println("");
                buffer = new byte[8];
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            try {
                if (read != null)
                    read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (write != null)
                    write.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}