package practicsSem1.Practice21.task3;

public class AnyTypeArr<E> {
    private E[] arr;

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLen() {
        return arr.length;
    }

    public E get(int i) {
        return arr[i];
    }

}