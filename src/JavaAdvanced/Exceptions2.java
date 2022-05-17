package JavaAdvanced;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions2 {

    static void f() {
        try {
            new FileReader("asdf.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        f();
    }
}