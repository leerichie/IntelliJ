package JavaAdvanced;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class OddInts {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream("ints.dat"))) {
            //noinspection InfiniteLoopStatement
            while (true) {
                list.add(dis.readInt());
            }
        } catch (EOFException ignored) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i : list) {
            System.out.println(i);
        }
        list.removeIf(i -> i % 2 == 0);
        list.forEach(System.out::println);
    }
}