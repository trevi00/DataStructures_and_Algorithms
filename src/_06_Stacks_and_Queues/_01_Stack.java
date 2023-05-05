package _06_Stacks_and_Queues;

import java.util.Stack;

public class _01_Stack {
    //LIFO
    //last in, first out
    //일반적으로 스택에 삽입하는 것을 푸시 라고 하고
    // 스택에서 제거하는 것을 팝핑 이라고 합니다 .

    // 스택은 일반적으로 스택의 맨 위에 있는 요소를 보는 것을
    // 의미하는 peek 와 같은 작업과 함께 제공됩니다 .

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(5);

        if (stack.empty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(String.format("Stack is not empty, top is: %d", stack.peek()));
        }
    }
}
