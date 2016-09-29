package egger.software.calc;

import java.util.Stack;

public class StackCalculator {

    private Stack<Double> stack = new Stack<>();

    public void push(double value) {
        stack.push(value);
    }

    public void sum() {
        stack.push(stack.pop() + stack.pop());
    }

    public void sub() {
        stack.push(stack.pop() - stack.pop());
    }

    public double peek() {
        return stack.peek();
    }
}
