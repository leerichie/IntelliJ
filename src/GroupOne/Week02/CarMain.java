package GroupOne.Week02;

public class CarMain {
    public static void main(String[] args) {

        Car suzie = new Car();
        suzie.setModel("Vitara");
        suzie.setColour("Black");
        suzie.setYear(2012);
        System.out.println("Model: " + suzie.getModel()
                + ". " + "Colour: " + suzie.getColour()
                + ". " + "Year: " + suzie.getYear());

        Car plsChoose = new Car();
        plsChoose.setModel("JLA-21B");
        plsChoose.setColour("red & black");
        plsChoose.setYear(2016);
        System.out.println(plsChoose.getModel()
                + ", " + plsChoose.getColour() + ", "
                + plsChoose.getYear());

    }
}
