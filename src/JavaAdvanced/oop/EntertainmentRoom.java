package JavaAdvanced.oop;

class EntertainmentRoom {
    private final SmartTV stv = new SmartTV();
    private final Playstation ps = new Playstation();

    void play(){
        ps.play();
    }
    void watchTV(){
        stv.watchYT();
    }
}

class SmartTV {
    void watchYT() {
        System.out.println("Watching youtube");
    }
}

class Playstation {
    void play() {
        System.out.println("Playing on PlayStation");
    }
}

class Main {
    public static void main(String[] args) {
        EntertainmentRoom er = new EntertainmentRoom();
        er.play();
        er.watchTV();
    }
}
