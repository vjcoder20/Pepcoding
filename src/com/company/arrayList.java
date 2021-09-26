package com.company;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al+" -> "+al.size());

        al.add(1,1000);
        System.out.println(al+" -> "+al.size());

        int val = al.get(1);
        System.out.println(val);

        al.set(1,2000);
        System.out.println(al+" -> "+al.size());

        al.remove(1);
        System.out.println(al+" -> "+al.size());

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Okay");
        list.add("Bye");

        System.out.println(list+" -> "+list.size());

        //for-each loop
        for(String parts:list) System.out.println(parts);
    }
}
