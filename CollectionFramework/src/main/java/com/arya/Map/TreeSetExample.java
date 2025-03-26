package com.arya.Map;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {

       // Comparator<Person> personComparator = Comparator.comparingInt(Person::getSalary).reversed();
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person(1,"Arya",12,2000));
        personTreeSet.add(new Person(2,"Kunal",23,2100));
        personTreeSet.add(new Person(3,"Chandan",12,1900));

        System.out.println(personTreeSet);
    }
}
