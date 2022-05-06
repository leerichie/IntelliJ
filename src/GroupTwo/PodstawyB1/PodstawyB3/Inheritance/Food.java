package GroupTwo.PodstawyB1.PodstawyB3.Inheritance;

public class Food extends InventoryObject{
    private int healthPointsRegeneration;

    public Food(String name, double weight, int healthPointsRegeneration) {
        super(name, weight);
        this.healthPointsRegeneration = healthPointsRegeneration;
    }

    public int getHealthPointsRegeneration() {
        return healthPointsRegeneration;
    }
}