package com.arya.arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s ="abcd";
        int k=2,i=0;

        char [] ch = s.trim().toCharArray();

        while(i<k){
            char temp = ch[k-1];
            ch[k-1]=ch[i];
            ch[i]=temp;
            i++;
            k--;
        }

        System.out.println();
    }
}
