package _06_Stacks_and_Queues;

import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue myQueue1 = new MyQueue();
        myQueue1.push(1);
        myQueue1.push(2);

        System.out.println(myQueue1.peek());

        System.out.println(myQueue1.pop());

        System.out.println(myQueue1.empty());

        System.out.println("---------------------------------");

        MyQueue myQueue2 = new MyQueue();
        myQueue2.push(1);

        System.out.println(myQueue2.pop());

        System.out.println(myQueue2.empty());
    }
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int num) { // O(1)
        while( !stack1.isEmpty() ){
            stack2.push(stack1.pop());
        }

        stack1.push(num);

        while( !stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() { // *O(1)
        return stack1.pop();
    }

    public int peek() { // O(1)
        return stack1.peek();
    }

    public boolean empty() { // O(1)
        return stack1.isEmpty();
    }

}
