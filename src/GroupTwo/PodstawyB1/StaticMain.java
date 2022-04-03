package GroupTwo.PodstawyB1;

import static java.lang.Math.PI;

public class StaticMain {
    public static void main(String[] args) {

        Person1 lee = new Person1();
        Person1 ania = new Person1();
        lee.setFirstName("Richie");
        lee.setHeight(180);
        lee.setFemale(false);

        ania.setFirstName("Ania");
        ania.setHeight(175);
        ania.setFemale(true);

        boolean isShorter = ania.shorterThan(170);
        String nationality = Person1.getNationality(); // to save time can make separate class .nationality

        System.out.println(PI);
    }
}
