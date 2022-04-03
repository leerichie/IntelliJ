package GroupTwo.PodstawyB1;

public class GlassEntry {
    public static void main(String[] args) {

        Glass kufel = new Glass(500);
        Glass ikea = new Glass(300);

        kufel.fill(450);
        kufel.pour(250);

        System.out.println(kufel.filled);

    }
}
