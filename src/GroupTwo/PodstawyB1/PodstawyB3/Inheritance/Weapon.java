package GroupTwo.PodstawyB1.PodstawyB3.Inheritance;

public class Weapon extends InventoryObject{
    private int damagePoints;

    public Weapon(String name, double weight, int damagePoints) {
        super(name, weight);
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
