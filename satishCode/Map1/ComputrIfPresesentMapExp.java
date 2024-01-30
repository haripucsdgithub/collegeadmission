package com.example.demo.satishCode.Map1;

import java.util.HashMap;
import java.util.Map;

public class ComputrIfPresesentMapExp {
    public static void main(String[] args) {
        Map<Integer, Float> empInfo = new HashMap<>();
        empInfo.put(1,100000f);
        empInfo.put(2,100000f);
        empInfo.put(3,100000f);
        empInfo.put(4,100000f);
        System.out.println("emp info before compute = "+empInfo);
        empInfo.computeIfPresent(2,(key,value)->value+100);
        empInfo.computeIfPresent(5,(key,value)->value+100);
        System.out.println("emp info afte compute = "+empInfo);





    }
}
