package com.example.demo.satishCode.Map1;

import java.util.HashMap;
import java.util.Map;

public class IsEmptyMap {
    public static void main(String[] args) {

            Map<Integer, Float> empInfo = new HashMap<>();
            empInfo.put(1,100000f);
            empInfo.put(2,100000f);
            empInfo.put(3,100000f);
            empInfo.put(4,100000f);
        System.out.println(empInfo.isEmpty());


        }
}
