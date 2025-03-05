package com.arya.arrays;

import java.util.*;

public class DistinctAverage {
    public static void main(String[] args) {
        int [] nums = {1,100};
        float avg = 0;

        Arrays.sort(nums);

        List<Float> list = new ArrayList<>();

        int i=0,j= nums.length-1;

        while (i<j){
            avg = (float) (nums[i] + nums[j]) /2;
            list.add(avg);
            i++;
            j--;
        }


        Set<Float> set = new HashSet<>();
        for (int k=0;k<list.size();k++){
            set.add(list.get(k));
        }

        System.out.println(set.size());
    }
}