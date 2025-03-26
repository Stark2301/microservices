package com.arya.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Object[] arr = new Object[3];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        Integer pop = stack.pop();
        System.out.println(pop);
        Integer peek = stack.peek();
        System.out.println(peek);

        boolean empty = stack1.empty();
        System.out.println(empty);

        int search = stack.search(1);
        System.out.println(search);

        stack.copyInto(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
    }
        System.out.println(stack.capacity());
    }
}
