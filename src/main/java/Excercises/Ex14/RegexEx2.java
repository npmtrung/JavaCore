package Excercises.Ex14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {
    public static void main(String[] args) {
        String text2 = "npmtrung@gmail.com";
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        Matcher matcher = pattern.matcher(text2);

        System.out.println("Email trong chuỗi: " + text2);
        while (matcher.find()) {
            System.out.println(text2.substring(matcher.start(), matcher.end()));
        }
    }
}
