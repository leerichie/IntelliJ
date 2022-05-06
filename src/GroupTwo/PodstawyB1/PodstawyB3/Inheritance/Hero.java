package GroupTwo.PodstawyB1.PodstawyB3.Inheritance;

public class Hero {
    enum Race {
        HUMAN, ALIEN, PREDATOR, GHOST
    }

    private static int MAX_HEALTH;

    private String name;
    private Race race;
    private int health;
    private InventoryObject[] inventory = new InventoryObject[10];

    public Hero(String name, Race race) {
        this.name = name;
        this.race = race;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public int getHealth() {
        return health;
    }

    public void showInventory() {
        for (InventoryObject i : inventory) {
            System.out.println(i);
        }
    }

    public void addToInventory(InventoryObject o) {
        boolean isAdded = false;
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = o;
                isAdded = true;
                break;
            }
        }
        System.out.println(isAdded ? "Item added." : "No more space!");
    }

    public void takeDamage(int damagePoints) {
        health -= damagePoints;
        if (health <= 0)
            System.out.println("You're dead!");
    }

    public void eat(int slot) {
        InventoryObject obj = inventory[slot];
        if (obj != null && obj instanceof Food) {
            Food food = (Food) obj;
            if (health + food.getHealthPointsRegeneration() <= MAX_HEALTH)
                health += food.getHealthPointsRegeneration();
        } else {
            System.out.println("This is not food!");
        }
    }
}