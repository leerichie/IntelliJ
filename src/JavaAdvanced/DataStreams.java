package JavaAdvanced;

import java.io.*;
public class DataStreams {
    public static void main(String[] args) {
        double mean = read();
        write(mean);
    }
    private static double read() {
        try (FileInputStream fis = new FileInputStream("data.dat");
             DataInputStream dis = new DataInputStream(fis)) {
            double sum = dis.readInt();
            sum += dis.readLong();
            sum += dis.readDouble();
//            System.out.println(dis.readInt());
//            System.out.println(dis.readDouble());
//            System.out.println(dis.readLong());
            return sum / 3;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void write(double mean) {
        try (FileOutputStream fos = new FileOutputStream("output.dat");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeDouble(mean);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
