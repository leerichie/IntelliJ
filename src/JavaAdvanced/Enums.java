package JavaAdvanced;

import java.util.Map;

enum Level {
    EASY, MEDIUM, HARD;
}

enum Colour {
    RED("ff0000"),
    GREEN("ff0500"),
    BLUE("ff0407");
    final String code;

    Colour(String code){
        System.out.println("Constructor of COLOURS, code: " + code);
        this.code = code;

    }
    public String getCode(){
        return code;
    }
}

public class Enums {
//    private static final int easy = 1;
//    private static final int medium = 2;
//    private static final int hard = 3;

    Map<Colour, String> rgb = Map.of(Colour.RED, "ff0000", Colour.GREEN, "ff0500");

    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        Colour colour = Colour.BLUE;

        if (level == Level.HARD) {
            System.out.println();
        }
        if (colour == Colour.BLUE) {
        }
    }
}
