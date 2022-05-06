package GroupTwo.PodstawyB1.PodstawyB3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    static String text = "<div><p> This is number +48 243 543 646. </div>\n" +
            "<div> <h1>Lalala</h1> abcdef 234-56-45.</div> <div>Michael's email: m.smith@gmail.com. <br> " +
            "Clarice - mail clarice@o2.pl </div> Contact: 32 456 23 43.";
    static Pattern pEmail = Pattern.compile("[a-z][a-z0-9.]+@[a-z0-9]+\\.[a-z]+");
    static Pattern pPhone = Pattern.compile("\\+?([0-9]{2} )?[0-9]{3}( |-)[0-9]{2,3}( |-)[0-9]{2,3}");
    static Pattern pHtml = Pattern.compile("</?([a-z0-9]+)>");

    public static void main(String[] args) {
        findEmail();
        findPhone();
        findHtml();

    }
    public static void findEmail() {

        Matcher mEmail = pEmail.matcher(text);

        while (mEmail.find()) {
            System.out.println(mEmail.group(0));
        }
    }
    public static void findPhone(){

        Matcher mPhone = pPhone.matcher(text);

        while (mPhone.find()){
            System.out.println(mPhone.group(0));
        }
    }
    public static void findHtml(){

        Matcher mHtml = pHtml.matcher(text);

        while (mHtml.find()){
            System.out.println(mHtml.group(1));
        }
    }
}
