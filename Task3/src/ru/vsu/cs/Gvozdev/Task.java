package ru.vsu.cs.Gvozdev;

import java.util.*;

public class Task {

    public static int reverseStack(int x) {
        Stack<Integer> stack = new Stack<>();
        stack.push(x);
        int i = 1;
        int y = x%10;
        if (x >= 10) {
            i *= 10;
            y = x % 10;
            stack.push(x / 10);
        }
        while (x / i != 0) {
            y = y * 10 + (stack.peek() % 10);
            i *= 10;
            stack.push(x / i);
        }
        return y;

    }
    public static int reverseMyStack(int x) throws Exception {
        ListStack<Integer> stack = new ListStack<Integer>();


        stack.push(x);
        int i = 1;
        int y = x%10;
        if (x >= 10) {
            i *= 10;
            y = x % 10;
            stack.push(x / 10);
        }
        while (x / i != 0) {
            y = y * 10 + (stack.peek() % 10);
            i *= 10;
            stack.push(x / i);
        }
        return y;
    }

    
}
