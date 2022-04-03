package MyTests;

public class VarArgs {
    private static int sum(int i, int... others) {
        int sum = i;

        if (others != null)
            for (int other : others) {
                sum += other;
            }
        System.out.println("sum:" + sum);
        return sum;
    }

}
