package PracticsSem2.practice01;

import java.util.ArrayList;
import java.util.function.Function;

public class Tester implements Function<String, String> {

    ArrayList<String> mas;

    Tester(ArrayList<String> mas) {
        this.mas = new ArrayList<>(mas.size());
        for (int i = 0; i < mas.size(); i++) {
            this.mas.add(apply(mas.get(i)));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> mas = new ArrayList<>(5);
        mas.add("ffvfggh");
        mas.add("ffvfggh");
        mas.add("ffvfggh");
        mas.add("ffvfggh");
        mas.add("ffvfggh");
        Tester tester = new Tester(mas);
        for (var cur : tester.getMas())
            System.out.println(cur);
    }

    @Override
    public String apply(String temp) {
        StringBuilder res1 = new StringBuilder();
        for (int i = temp.length() - 1; i >= 0; i--) {
            res1.append(temp.charAt(i));
        }
        String res = String.valueOf(res1);
        return res;
    }

    public ArrayList<String> getMas() {
        return mas;
    }

}
