package com.example.demo.satishCode.List1;

import java.util.ArrayList;
import java.util.List;

public class ListEqualsEmp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("satish");
        list.add("mayuri");
        list.add("rushi");
        list.add("vaibhav");

        List<String> list1 = new ArrayList<>();
        list1.add("pratik");
        list1.add("hari");
        if (list==list1){
            System.out.println("list are equals");

        }
    else
        {
            System.out.println("list are not equals");
        }
    }
}