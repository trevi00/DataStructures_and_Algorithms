package _06_Stacks_and_Queues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _02_String_problems { //후입선출(LIFO)
     public boolean isValid(String s) {
         Map<Character, Character> matching = new HashMap();
         matching.put('(', ')');
         matching.put('[', ']');
         matching.put('{', '}');

         Stack<Character> stack = new Stack<>();
         for (char c : s.toCharArray()) {
             if (matching.containsKey(c)) { // if c is an opening bracket
                 stack.push(c);
             } else {
                 if (stack.empty()) {
                     return false;
                 }

                 char previousOpening = stack.pop();
                 if (matching.get(previousOpening) != c) {
                     return false;
                 }
             }
         }

         return stack.empty();
     }
}
