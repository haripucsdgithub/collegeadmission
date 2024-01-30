package com.example.demo.satishCode.Map1;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyMap {
    public static void main(String[] args) {
        Map<Integer,String> studentList=new HashMap<>();
        studentList.put(1,"satish");
        studentList.put(2,"vaibhav");
        studentList.put(3,"mayuri");
        studentList.put(4,"rushi");
        System.out.println(studentList);
        System.out.println(studentList.containsKey(4));
        System.out.println(studentList.containsKey(5));
    }
}
