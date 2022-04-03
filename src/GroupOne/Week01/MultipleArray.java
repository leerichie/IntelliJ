package GroupOne.Week01;

public class MultipleArray {
    public static void main(String[] args) {
        double[][] multiArray = new double[3][3];
        multiArray[0][0] = 1.0;
        multiArray[0][1] = 1.5;
        multiArray[0][2] = 2.0;
        multiArray[1][0] = 1.5;
        multiArray[1][1] = 2.0;
        multiArray[1][2] = 2.5;
        multiArray[2][0] = 2.0;
        multiArray[2][1] = 2.5;
        multiArray[2][2] = 3.0;
        System.out.println(multiArray[0][0] + multiArray[1][1] + multiArray[2][2]);


        // count fromm 0 not 1
        String[][] array1 = new String[2][];
        array1[0] = new String[]{"Sometimes", "I", "Like", "Beer"};
        array1[1] = new String[]{"I", "Like", "Beer", "Sometimes"};
        System.out.println(array1[0][0]); // 1st line 1st column - 1 word
        System.out.println(array1[0][3]); // 1st line 3rd column - not defined - 3rd word



        }
}
