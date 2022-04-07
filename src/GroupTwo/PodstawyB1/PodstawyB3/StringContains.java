package GroupTwo.PodstawyB1.PodstawyB3;

public class StringContains {
    public static void main(String[] args) {

        System.out.println("The quick brown fox jumped over the candle stick");

        String charNum = "The quick brown fox jumped over the candle stick";
        char searchChar = 'h';
        char searchChar1 = 'e';
        String s1 = String.valueOf(searchChar1);
        int count = 0;
        for (int i = 0; i < charNum.length(); i++) {
            if (charNum.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.println("Char " + searchChar + " appears " + count + " times.");
        System.out.println("Fragment " +  searchChar+s1 + " appears " + count + " times.");

    }


    public static int countOccurences(String text, char c) {        // ver.2
        int count = 0;
        int max = 0;
        char[] chars = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (chars[i] == c) {
                count++;
            }

            if (chars[i] != c || i == text.length() - 1) {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        return max;
    }

}
