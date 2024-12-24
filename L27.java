package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L27 {

    public static void main(String[] args) {
        try {

             File f1 = new File("src/names.txt");
            Scanner sc1 = new Scanner(f1);
            Tools1 t1 = new Tools1();
            for (; sc1.hasNextLine(); ) 
            {
                String name = sc1.nextLine();
                System.out.println(t1.reverse(name));
            }
            sc1.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file 'names.txt' was not found.");
            e.printStackTrace();
        }
    }
}
