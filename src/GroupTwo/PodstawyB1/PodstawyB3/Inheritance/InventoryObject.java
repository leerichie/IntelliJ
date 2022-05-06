package GroupTwo.PodstawyB1.PodstawyB3.Inheritance;

public class InventoryObject {
    private String name;
    private double weight;
    private String food;
    private String weapon;

    public InventoryObject(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "InventoryObject{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
