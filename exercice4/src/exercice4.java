import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
            File file = new File("/C:/Users/trdni/Documents/myFile.txt");
            try(FileOutputStream flux = new FileOutputStream(file);){
                String text = "Hello world";
                Boolean write = true;
                while (write) {
                    Scanner sc = new Scanner(System.in);
                    text = sc.nextLine();
                    if (text.equals("quit")) {
                        write = false;
                    }
                    else {
                        text = text + " ";
                        for (int i = 0; i < text.length(); i++) {
                            flux.write(text.charAt(i));
                        }
                    }
                }
                flux.close();
            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }