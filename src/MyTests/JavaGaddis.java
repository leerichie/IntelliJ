package MyTests;

public class JavaGaddis {
    public static void main(String[] args) {

        String city = "London";
        int stringLength = city.length();
        char oneChar = city.charAt(4);
        String upperCity = city.toUpperCase();
        String lowerCity = city.toLowerCase();

        System.out.println("City: " + city);
        System.out.println("Length: " + city.length());
        System.out.println("4th character: " + city.charAt(4));
        System.out.println("Uppercase: " + city.toUpperCase());
        System.out.println("Lowercase: " + city.toLowerCase());
    }

}
