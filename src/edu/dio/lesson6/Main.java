package edu.dio.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Person[] persons1=new Person[] {
            new Person.Builder()
                .setFirstName("Vladimir")
                .setLastName("Kravchenko")
                .setAge(32)
                .setMail("vovchik33@gmail.com")
                .build(),
            new Person.Builder()
                .setFirstName("Vlad")
                .setLastName("Kravchenko")
                .setAge(32)
                .setMail("vovchik33@gmail.com")
                .build(),
            new Person.Builder()
                .setFirstName("Sergey")
                .setLastName("Kravchenko")
                .setAge(32)
                .setMail("vovchik33@gmail.com")
                .build()
        };
        Person[] persons2=new Person[] {
            new Person.Builder()
                .setFirstName("Vladimir")
                .setLastName("Kravchenko")
                .setAge(32)
                .setMail("vovchik33@gmail.com")
                .build(),
            new Person.Builder()
                .setFirstName("Alexey")
                .setLastName("Kravchenko")
                .setAge(32)
                .setMail("vovchik33@gmail.com")
                .build()
        };

        Person[] resultMerge = ArrayWrapper.merge(persons1, persons2);
        System.out.println(Arrays.toString((resultMerge)));

        Person[] resultJoin = ArrayWrapper.merge(persons1, persons2);
        System.out.println(Arrays.toString((resultJoin)));
    }
}
