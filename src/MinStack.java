/*
 Day 10

 Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

 Example1:
    Input:
        ["MinStack","push","push","push","getMin","pop","top","getMin"]
        [[],[-2],[0],[-3],[],[],[],[]]
    Output:
        [null,null,null,null,-3,null,0,-2]

    Explanation:
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
 */

public class MinStack {
    private Node head;

    public int getMin() {
        return head.getMin();
    }
    public void push(int value) {
        if (head == null) {
            head = new Node(value);
        } else {

            head = new Node(value, head, Math.min(value, head.getMin()));
        }
    }
    public int top() {
        if (head == null) {
            throw new NullPointerException();
        }

        return head.getValue();
    }
    public int pop() {
        int value = top();
        head = head.getNext();
        return value;
    }
}

class Node {
    private int value;
    private int min;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.min = value;
    }

    public Node(int value, Node node, int min) {
        this.next = node;
        this.value = value;
        this.min = min;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}