package GroupOne.Week03;

public class Car {
    private int fuel;
    private Engine engine;

    public Car() {
        this.engine = new Engine("Ferrari");
    }

    class Engine {
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void refuel() {
            System.out.println(fuel += 10);
        }


    }

}
