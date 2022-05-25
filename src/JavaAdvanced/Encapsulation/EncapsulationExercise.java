package JavaAdvanced.Encapsulation;

class CoffeeMaker {
    private double waterLevel;
    private double coffeeLevel;

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getCoffeeLevel() {
        return coffeeLevel;
    }

    public void setCoffeeLevel(double coffeeLevel) {
        this.coffeeLevel = coffeeLevel;
    }
}

public class EncapsulationExercise {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.setWaterLevel(1);
        coffeeMaker.setCoffeeLevel(0.1);

        double waterToCoffeeRatio = 15; // moc kawy
        double waterUsed = coffeeMaker.getCoffeeLevel() * waterToCoffeeRatio;
        coffeeMaker.setWaterLevel(coffeeMaker.getWaterLevel() - waterUsed);
        coffeeMaker.setCoffeeLevel(0);
    }
}