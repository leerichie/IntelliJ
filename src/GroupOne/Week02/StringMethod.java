package GroupOne.Week02;

public class StringMethod {

    public void String (String nAme, String sUrname) {
        String newName = nAme+sUrname;
        String newUpper = newName.toUpperCase();
        System.out.println(newUpper);
    }
    public char returnFirstChar(String nAme){
        return nAme.charAt(0);
    }
    public String replaceAllLetters (String nAme){
        return nAme.replaceAll("A","E");

    }




}
