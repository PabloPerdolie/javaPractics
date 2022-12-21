package Practice14.num_2;


public class task02 {
    public static void main(String[] args) {
        String str = new String("abcdefghijklmnopqrstuv18340");
        System.out.println(str.matches("abcdefghijklmnopqrstuv18340"));
        System.out.println(str.matches("abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}