package GroupTwo.PodstawyB1;

import java.util.Scanner;
public class StopwatchMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Stoper WF-isty - parametry:");
        System.out.println("1 - start");
        System.out.println("2 - międzyczas (stoper obsługuje do 100 międzyczasów)");
        System.out.println("3 - stop");
        System.out.println("4 - wyświetl czas");
        System.out.println("5 - zatrzymaj stoper i wyświetl międzyczasy");
        System.out.println("0 - zamknięcie stopera");
        Scanner scanner = new Scanner(System.in);


        StopWatch sw = new StopWatch();
        boolean isRunning = true;
        do {
            int i = scanner.nextInt();
            switch (i) {
                case 1: sw.start(); break;
                case 2: sw.inter(); break;
                case 3: sw.stop(); break;
                case 4: sw.printTime(); break;
                case 5: sw.printLapTimes(); break;
                case 0: isRunning = false; break;
                default: {
                    System.out.println("Niewłaściwy wybór!");
                    }
                }
            } while (isRunning);
        }
    }