package com.example.demo.satishCode.List1;

import java.util.ArrayList;
import java.util.List;

public class ListSubclassExm {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        System.out.println(list);
        System.out.println(list.subList(0,2));// used to access by indext in given rahge consider first value but not last
    }
}
