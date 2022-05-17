package JavaAdvanced;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

class WriteScanner {

    static String readWord() {
        try (Scanner scanner = new Scanner(Paths.get("input.txt"))) {
            int number = scanner.nextInt();
            for (int i = 0; i < number - 1; ++i) {
                scanner.next();
            }
            return scanner.next();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchElementException e) {
            throw new IndexOutOfBoundsException("Zbyt mało słów w pliku");
        }
    }

    static void writeWord(String word) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(word);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String word = readWord();
        writeWord(word);
    }
}