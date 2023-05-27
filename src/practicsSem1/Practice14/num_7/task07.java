package practicsSem1.Practice14.num_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task07 {
    public static void main(String[] args) {
        String pass = "F032_Password";
        String pass2 = "smart_pass";

        String regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])).{8,}";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher1 = pattern.matcher(pass);
        Matcher matcher2 = pattern.matcher(pass2);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}