package com.assignment.Task5;
import java.util.Stack;

public class Task5Eight {

    public static boolean balParanthesis(String s) {
        Stack<Character> stack  = new Stack<Character>();

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c == '[' || c == '(' || c == '{' ) { stack.push(c); }
            else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') { return false; }
            }
            else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') { return false; }
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') { return false; }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        String s1 = "({{)}[}]()";
        String s2 = "[})(";
        boolean b1 = balParanthesis(s1);
        boolean b2 = balParanthesis(s2);
        System.out.println(b1);
        System.out.println(b2);
    }
}
