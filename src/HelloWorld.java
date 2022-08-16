import java.util.regex.Pattern;

public class HelloWorld {
    public static void main(String[] args) {
        String rc = "123456/7890";
        System.out.println(rc.matches("[0-9]{6}/[0-9]{3,4}"));

        String date = "12.19.2022";
        System.out.println(date.matches("[1-3]?[0-9][.]1?[0-9][.]20[0-9]{2}"));

        String email = "Frantisek.Lazor@telekom.com";
        System.out.println(email.matches("[A-Z]?[a-z]{1,}[.][A-Z]?[a-z]{1,}@telekom.com"));

        var pattern = Pattern.compile("([0-9]{6})/([0-9]{3,4})");
        var matcher = pattern.matcher(rc);
        if(matcher.matches()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}
