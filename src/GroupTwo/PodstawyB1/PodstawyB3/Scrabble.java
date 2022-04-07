package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.Random;

public class Scrabble {
    public static void main(String args[]) {
    }
    public void scrabbleWord(char... letters) {     // random letter
        char result[] = new char[letters.length];
        String pool = String.valueOf(letters);
        Random r = new Random();

        for (int i = 0; i < letters.length; i++) {
            char letter = pool.charAt(r.nextInt(pool.length()));
            result[i] = letter;
            pool = pool.replaceFirst(String.valueOf(letter), "");
        }

        System.out.println(String.valueOf(result));
    }
    public static void generate(char... letters) {          //  random index
        char result[] = new char[letters.length];
        Random random = new Random();

        for (char letter : letters) {
            boolean notEmpty = false;
            do {
                notEmpty = false;
                int index = random.nextInt(letters.length);
                if (result[index] != (char) 0) {
                    notEmpty = true;
                } else {
                    result[index] = letter;
                    notEmpty = false;
                }
            } while (notEmpty);
        }

        System.out.println(String.valueOf(result));
    }
}