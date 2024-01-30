package com.example.demo.satishCode.List1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortEmp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(4);
        list.add(30);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);//sort lisy
        System.out.println("sorted list "+list);

    }
}
