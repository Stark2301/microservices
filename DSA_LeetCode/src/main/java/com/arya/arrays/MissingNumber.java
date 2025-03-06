package com.arya.arrays;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            map.put(nums[i],1);
        }
        int q=0;
        for (int  i =1;i<= nums.length;i++){
            if (!map.containsKey(i)){
                q=i;
            }
        }
        System.out.println(q);
    }
}
