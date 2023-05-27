package PracticsSem2.practice02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Individual {
    Stream<Human> humanStream;
    Individual(ArrayList<Human> list){
        humanStream = list.stream();
    }

    public void reverseSortWeight(){
        humanStream
                .sorted(Comparator.comparingInt(Human::getWeight).reversed())
                .forEach((a) -> { System.out.println(a.toString());});
    }

    public void lastNameFilter(){
        humanStream
                .filter(human -> { return human.getLastName() == "Ivanov" ? false : true; })
                .forEach((a) -> { System.out.println(a.toString()); });
    }

    public void sortAge(){
        humanStream
                .sorted(Comparator.comparingInt(Human::getAge))
                .forEach((a) -> { System.out.println(a.toString()); });
    }

    public long multiplyAllAges(){
        return humanStream.map(x -> x.getAge()).reduce(1, (x, y) -> x*y);
    }
}

//          3) Сортировка по весу в обратном порядке, фильтрация по фамилии не
//            Иванов, сортировка по возрасту, произведение всех возрастов.
//              задания следует использовать отдельный класс с методом main.
