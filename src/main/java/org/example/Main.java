package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Child child = new Child("subham singh", "E1343");
        //Child child1 = new Child();

        System.out.println(child.getName());
        child.show();
        child.show1();


        Imple imple = new Imple();

        imple.sum();
        imple.sum1();


        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3,2,10,2,301,30));
        Collections.sort(arrayList);
        System.out.println(arrayList);


        Collection<String> collection = new AbstractList<String>() {
            @Override
            public String get(int i) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };


    }
}