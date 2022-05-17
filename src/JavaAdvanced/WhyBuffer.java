package JavaAdvanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SuppressWarnings("StatementWithEmptyBody")
class WhyBuffer {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("lorem ipsum.txt");

        long start = System.nanoTime();
        while (fr.read() != -1) ;
        long stop = System.nanoTime();

        System.out.println("FileReader:\t\t" + (stop - start));



        BufferedReader br = Files.newBufferedReader(Paths.get("lorem ipsum.txt"));

        start = System.nanoTime();
        while (br.readLine() != null) ;
        stop = System.nanoTime();

        System.out.println("BufferedReader:\t" + (stop - start));
    }
}
