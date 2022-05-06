package GroupTwo.PodstawyB1.PodstawyB3;

public class Animal {
    public static void main(String[] args) {
        Cat c = new Cat("King", 3, 6);
    }
    enum Race {
        BRITISH, EGYYPT, SIAMESE
    }
    private String name;
    private int age;
    private int weight;
    private Race race;
    private boolean isVaccinated;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }
}
