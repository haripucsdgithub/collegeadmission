package com.example.demo.hari;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInteratorExample {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("Hari");
        list.add("Nale");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
