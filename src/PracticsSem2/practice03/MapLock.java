package PracticsSem2.practice03;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MapLock {
    private static final Lock lock = new ReentrantLock();
    private List<Map> list;

    public MapLock() {
        list = new LinkedList<>();
    }

    public String getList(int i) {
        return list.get(i).MapReturn();
    }

    public int getCount() {
        return list.size();
    }

    public void addEntry(Map entry) {
        list.add(entry);
    }

    public void removeEntry(Map entry) {
        lock.lock();
        list.remove(entry);
        lock.unlock();
    }

    public void ToString() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i).MapReturn() + " ";
        }

        System.out.println(str);
    }
}
