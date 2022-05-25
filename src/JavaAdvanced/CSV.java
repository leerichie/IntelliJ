package JavaAdvanced;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CSV {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("abc.csv"))) {
            scanner.nextLine();
            scanner.useDelimiter("[,\n]");
            while (scanner.hasNext()) {
                scanner.next();
                scanner.next();
                System.out.print(scanner.next());
                scanner.nextLine();
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}