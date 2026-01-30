package com.st.string;

import java.util.Stack;

public class MatheExpBalancedCheck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(isBalancedWithoutStack("(({[]}))[]"));
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty())
                    return false;
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '['))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isBalancedWithoutStack(String s) {
        char[] chars = s.toCharArray();
        int top = -1; // Acts as our stack pointer

        for (char ch : chars) {
            if (ch == '(' || ch == '{' || ch == '[') {
                chars[++top] = ch; // "Push" by moving the pointer
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) return false;

                char last = chars[top--]; // "Pop"
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }

}
