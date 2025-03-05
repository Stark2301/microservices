package com.arya.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] num = {3,3};
        int target = 6;

        if (num.length<2){
            System.out.println("Please add more than 2");
        }
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<num.length;i++){
            int m = target-num[i];
            if (map.containsKey(m)){
                System.out.println(map.get(m));
                System.out.println(i);
            }else {
                map.put(num[i],i);
            }
        }
    }
}
