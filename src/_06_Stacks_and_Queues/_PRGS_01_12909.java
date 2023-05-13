package _06_Stacks_and_Queues;

import java.util.Stack;

public class _PRGS_01_12909 { // 올바른 괄호
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') { // if c is an opening bracket
                stack.push(')');
            } else if (c == ')' && !stack.empty()) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}
