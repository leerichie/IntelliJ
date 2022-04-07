package GroupTwo.PodstawyB1;

public class Glass {

    private final int ml;

    public int filled;

    public Glass(int ml){
        this.ml = ml;
        if (ml<=0)
            System.out.println("invalid");

    }
    public void fill(int ml) {
        filled += ml;
    }
    public void pour(int ml) {
        filled -= ml;
    }

    public int getFilled() {
        return filled;
    }

    public int getMl() {
        return ml;
    }
}
