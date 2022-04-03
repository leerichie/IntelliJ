package Homework;

public class AlaMaKota {
    public static void main(String[] args) {
        String sentence = "ala ma kota";
        char letter;
        int totalCharacters = 0;

        for (int i = 0; i < sentence.length(); i++) {
            letter = sentence.charAt(i);

            if (letter == 'a')
                totalCharacters++;
        }


        System.out.println("'a' appears "           // return; ????
                + totalCharacters + " times");
    }

}
