import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class reads a file containing numbers and analyzes the content.
 * The program asks the user for a file name.
 * The file is supposed to contain values.
 * The first line of this file contains the total number of values, and the following lines contain the datas.
 */
public class DataAnalyzer {

    public static void main(String[] args) throws IOException, BadDataException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        DataSetReader data = new DataSetReader();

        System.out.print("Quel est le nom du fichier à lire ? : ");
        String leFichier = sc.next();

        try {
            double[] lesChiffres = data.readFile(leFichier);
            for(double chiffre : lesChiffres){
                System.out.println(chiffre);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}

