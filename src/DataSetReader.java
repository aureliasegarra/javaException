import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;


/**
 * This class is in charge of reading the file
 */
public class DataSetReader {

    private double[] data;

    /**
     *  This method reads a set of data
     * @param filename is a text file containing the data
     * @return the file data in an array of double
     */
    public double[] readFile(String filename) throws IOException {
        File fichier = new File(filename);

        try (Scanner in = new Scanner(fichier)) {
            readData(in);
            return data;
        }
        finally {
            in.close();
        }
    }

    /**
     * This method reads all the data
     * @param in the Scanner in
     */
    private void readData(Scanner in) throws BadDataException {
        if (!in.hasNextInt()){
            throw new BadDataException("Fin du fichier");
        };

        int tailleTableau = in.nextInt();
        data = new double[tailleTableau];

        for (int i = 0; i < tailleTableau; i++){
            readValue(in, i);
        }
    }

    /**
     * This method reads a data value with the Scanner and places it in the data array at index i
     * @param in type Scanner
     * @param i type integer
     */
    private void readValue(Scanner in, int i) throws BadDataException {
        if(!in.hasNextDouble()){
            throw new BadDataException("Plus de données à lire !");
        }

        double values = in.nextDouble();
        data[i] = values;
    }
}
