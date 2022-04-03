package GroupOne.Week01;

public class Conditional_If_Switch {
    public static void main(String[] args) {

        /* working class */

        String name = "Lee";
        if (name == "Ania") {
            System.out.println("yes that's you");
        }
        else {
            System.out.println("Not that name");
        }

        int no = 5;
        if (no >= 4) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Incorrect");
        }

        System.out.println("");

        int Love = 0;
        switch (Love) {
            case 1:
                System.out.println("loads");
                break;
            case 2:
                System.out.println("much");
                break;
            case 3:
                System.out.println("a little");
                break;
            case 4:
                System.out.println("barely");
                break;
            default:
                    System.out.println("Couldn't find the right answer");



            System.out.println("");





        }
    }
}
