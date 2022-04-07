package GroupTwo.PodstawyB1;

public class StopWatch {
    private long start;
    private long stop;
    private boolean isStarted = false;
    private boolean wasStarted = false;
    private final double[] inter = new double[100];
    private int i = 0;


    public void start() {
        this.start = System.currentTimeMillis();
        isStarted = true;
        wasStarted = true;
    }
    public void inter() {
        if (isStarted) {
            this.inter[i] = (1.0 * (System.currentTimeMillis() - start) / 1000);
            i++;
        } else {
            System.out.println("Próbujesz zastopować niewłączony stoper");
        }
    }
    public void stop() {
        if (isStarted) {
            this.stop = System.currentTimeMillis();
            isStarted = false;
        } else {
            System.out.println("Próbujesz zastopować niewłączony stoper");
        }
    }
    public void printTime() {
        if (wasStarted) {
            System.out.println("Czas okrążenia to : " + getTime() + " sek");
        } else {
            System.out.println("Stoper nie był wystartowany");
        }
    }

    public void printLapTimes() {
        if (isStarted()) {
            stop();
        }
        for (int j = 0; j < i; j++) {
            System.out.println(j + 1 + ". międzyczas to: " + inter[j] + " sek");
        }
        if (wasStarted) {
            System.out.println("Finalny czas to: " + getTime() + " sek");
        } else {
            System.out.println("Stoper nie był wystartowany");
        }
    }

    public double getTime() {
        if (wasStarted) {
            if (isStarted) {
                return (1.0 * (System.currentTimeMillis() - start) / 1000);
            } else {
                return 1.0 * (stop - start) / 1000;
            }
        } else {
            return 0; //System.out.println("Stoper nie był wystartowany");
        }

    }
    public boolean isStarted() {
        return isStarted;
    }
}