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
        if(list.contains("Hari")) {
            System.out.println("Present");
        } else {
            System.out.println("abset");
        }
    }

    public static void main1(String[] args) {
        String[] arr = new String[2];
        arr[1]="Hari";
        arr[0]="Nale";

        boolean found = false;
        for(int i=0;i<arr.length;i++) {
            if("Hari1".equals(arr[i])) {
                found = true;
            }
        }

        if(found) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }


    }
}
