package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DvideClass {
    public static void main(String[] args) {

        Pattern patern  = Pattern.compile("^(\\d+) divide by (\\d+)$");
        Matcher matcher = patern.matcher("10 divide by 5");

        if(matcher.find()){
            String simplifiedMessage = "result = "+matcher.replaceFirst("$1/$2");
            System.out.println(simplifiedMessage);
            System.out.println(matcher.group(1));
            int res = Integer.valueOf(matcher.group(1)) / Integer.valueOf(matcher.group(2));
            //int res = Integer.parseInt("$1") / Integer.parseInt("$2");
            System.out.println("Final Results: " + res);
        }
    }
}
