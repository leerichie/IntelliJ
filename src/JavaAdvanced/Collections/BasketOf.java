package JavaAdvanced.Collections;

import java.util.ArrayList;
import java.util.List;

class BasketOfApplesIsNotBasketOfFruit {

    private static class Fruit {
    }

    private static class Apple extends Fruit {
    }

    static List<Apple> generateApples() {
        return new ArrayList<>(List.of(new Apple()));
    }

    static void processFruit(List<Fruit> fruit) {
        System.out.println(fruit.get(0));
        fruit.add(new Fruit());
    }

    public static void main(String[] args) {

//        List<Apple> apples = generateApples();
//        processFruit(apples);

        List l = new ArrayList();
        l.add("asdf");
        l.add("bsdf");
        l.add("csdf");
        l.add("dsdf");

        for (Object s : l) {
            System.out.println(((String) s).charAt(3));
        }

    }
}