package practicsSem1.Practice21.task3;

public class task3 {
    public static <E> void sid(String s, E[] arr) {
        E[] a = arr;
        AnyTypeArr<E> sid = new AnyTypeArr<>();
        sid.setArr(a);

        System.out.println(s + " ");

        for (int i = 0; i < sid.getLen(); i++) {
            System.out.println(sid.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String[] s = {"Hello", "Pavel"};
        sid("String", s);

        Integer[] i = {1, 2, 3, 4};
        sid("Int", i);

        Double[] d = {1.3, 351.551, 125123.14132};
        sid("Double", d);
    }
}
