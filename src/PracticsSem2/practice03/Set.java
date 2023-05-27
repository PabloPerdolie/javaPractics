package PracticsSem2.practice03;

import java.util.ArrayList;

public class Set {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    synchronized boolean add(int num)
    {
        if(arrayList.contains(num)) return false;
        else arrayList.add(num);
        return true;
    }

    synchronized boolean remove(int num)
    {
        if(arrayList.contains(num)) return false;
        arrayList.remove(num);
        return true;
    }

    synchronized String ToString()
    {
        String str = "";
        for (int i = 0; i < arrayList.size(); i++)
        {
            str += arrayList.get(i) + " ";
        }
        return str;
    }

}
