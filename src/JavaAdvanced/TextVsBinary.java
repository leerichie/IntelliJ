package JavaAdvanced;

import java.io.*;

public class TextVsBinary {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("textFile.txt"));
             DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataFile.dat"))) {
            for (int i = 0; i < 1000; ++i) {
                long val = Long.MAX_VALUE;
                bw.write(String.valueOf(val));
                dos.writeLong(val);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}