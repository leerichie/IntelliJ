package JavaAdvanced;

import java.io.*;

class Data implements Serializable {
    final double y;

    public Data(double y) {
        this.y = y;
    }
}

class Serialization {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialize.dat"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialize.dat"))
        ) {
            Data data = new Data(2.5);
            oos.writeObject(data);

            Object d = ois.readObject();
            System.out.println(d);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}