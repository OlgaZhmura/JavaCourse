package com.playtika.javacourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();
        //Collection<String> list = new ArrayList<>();

        list.add("hi");
        list.add("world");
        list.add("hello");
        list.add("dog");
        list.add("cup");
        list.add("all");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(4));
        System.out.println(list.toString());
        System.out.println(list.contains("all"));
        System.out.println(list.contains("Dog"));
        System.out.println(list.remove("all"));
        System.out.println(list.remove(1));
        list.add(2,"cool");
        System.out.println(list);
        System.out.println(list.indexOf("dog"));


    }
}
