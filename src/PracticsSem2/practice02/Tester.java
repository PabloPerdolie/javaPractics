package PracticsSem2.practice02;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>(6);
        humans.add(new Human(13, "Ivan", "Ivanov", LocalDate.of(2011, 1, 1), 3));
        humans.add(new Human(26, "Ivan", "Dfvnfvj", LocalDate.of(2000, 5, 13), 7));
        humans.add(new Human(49, "Van", "Uufufruh", LocalDate.of(2010, 3, 4), 5));
        humans.add(new Human(20, "Ivan", "Infvhnvf", LocalDate.of(1991, 1, 1), 9));
        humans.add(new Human(60, "Ivan", "Yyfbfvfb", LocalDate.of(2002, 1, 1), 15));
        humans.add(new Human(100, "Ivan", "Errremkcmd", LocalDate.of(1987, 1, 1), 10));
        Individual individual = new Individual(humans);
        individual.lastNameFilter();
        System.out.println();
        Individual individual1 = new Individual(humans);
        System.out.println(individual1.multiplyAllAges());
        System.out.println();
        Individual individual2 = new Individual(humans);
        individual2.reverseSortWeight();
        System.out.println();
        Individual individual3 = new Individual(humans);
        individual3.sortAge();

    }
}
