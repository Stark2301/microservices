package com.arya.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {1,0,0};

        int i=0,j=nums.length-1,l=nums.length/2;

        while (i<j){
            if (nums[i]!=0 && nums[j]!=0){
                i++;
            } else if (nums[i]==0 && nums[j]!=0) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }else{
                i++;
                j--;
            }
        }



        for (int iq=0;iq< nums.length;iq++){
            System.out.println(nums[iq]);
        }
    }
}
