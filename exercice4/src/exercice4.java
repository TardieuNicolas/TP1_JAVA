import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class exercice4 {
    public static void main(String[] args) {
            File file = new File("/C:/Users/trdni/Documents/myFile.txt"); //le chemin dois etre modifié et pointer sur un dossier.
            try(FileOutputStream flux = new FileOutputStream(file);){
                String text = "Hello world";
                Boolean write = true;

                //La boucle va nous permettre d'ecrire ligne par ligne dans notre fichier
                // Apres chaque saisie nous comparons la chaine au mot clé "quit" en cas d'egalité la boucle s'arrete
                while (write) {
                    Scanner sc = new Scanner(System.in);
                    text = sc.nextLine();
                    if (text.equals("quit")) {
                        write = false;
                    }
                    else {
                        text = text + " "; //On ajoute un espace pour une meilleur lisibilité dans le fichier final
                        //On boucle pour ecrire les lettres une a une dans le fichier
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