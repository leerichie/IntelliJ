package GroupOne.Week01;

public class LoopBreak {
    public static void main(String[] args) {
        System.out.println("Stop at 6");
        for (int i = 10; i > 0; --i) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Task completed");
    }
}
