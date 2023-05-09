package DataStructures;

public class StackClass {
    private int arr[];
    private int top;
    private int capacity;

    // Create a stack
    StackClass(int size) {
        arr = new int[size];
        capacity = size; // 5
        top = -1;
    }

    // Add the value to stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is overflown , programming is terminated");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty , programming is terminated");
            System.exit(1);
        }
        return arr[top--];
    }

    // utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // check stack is empty or not
    public Boolean isEmpty() {
        return top == -1; // true or false
    }

    // check stack is full or not
    public Boolean isFull() {
        return top == capacity - 1; // true or false
    }

    // Read entire stack
    public void printStack() {
        for(int i = 0; i<= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackClass myStack = new StackClass(5);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.pop();

        myStack.printStack();

    }
}

