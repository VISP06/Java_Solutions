import java.util.Stack;

public class MinStack {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    public static void main(String[] args) {
        System.out.println("Pushing -10");
        push(-10);
        System.out.println("Pushing 0");
        push(0);
        System.out.println("Pushing -15");
        push(-15);

        System.out.println("Current min: " + getMin());   // Expected output: -15

        System.out.println("Popping element...");
        pop();

        System.out.println("Current min: " + getMin());   // Expected output: -10

        System.out.println("Pushing -10");
        push(-10);

        System.out.println("Current min: " + getMin());   // Expected output: -10

        System.out.println("Popping element...");
        pop();
    }

        static public void push(int val) {
            stack.push(val);
            //if the minStack is empty then need to add an element anyways so that
            //we can use it for futher comparisons
            //we also check if val to be input is less than the curr min
            //if yes, we push it onto the stack making it the new min otherwise we don't execute that block
            if(minStack.isEmpty() || val <= minStack.peek()){
                minStack.push(val);
            }
        }

        static public void pop() {
            int popped = stack.pop();
            if(popped == minStack.peek()){
                minStack.pop();
            }
        }

        static public int top() {
            return stack.peek();
        }

        static public int getMin() {
            return minStack.peek();
        }
}
/*In this problem we just have to design a stack but with an additional feature of retrieving
  the minimum element. Which can be done with the help of another stack (minStack) whose job
  is to contain the smallest element*/