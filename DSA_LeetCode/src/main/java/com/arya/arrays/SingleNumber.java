package com.arya.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i< arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for (int n : map.keySet()){
            int val = map.get(n);
            if (val == 1){
                System.out.println(n);
            }
        }
    }
}
