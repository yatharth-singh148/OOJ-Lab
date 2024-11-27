//q3 lab9
import java.util.Scanner;
public interface Stack 
{
    void push(int value);
    int pop();
    boolean isEmpty();
    boolean isFull();
    int peek();
}

public class FixedStack implements Stack 
{
    private int[] stack;
    private int top;
    private int maxSize;
    public FixedStack(int size) {
        maxSize = size;
        stack = new int[size];
        top = -1;
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stack[++top] = value;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public int display() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        } else {
            return stack[top];
        }
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose stack type (1 for FixedStack, 2 for DynamicStack): ");
        int choice = scanner.nextInt();

        Stack stack = null;
        if (choice == 1) {
            System.out.print("Enter the fixed stack size: ");
            int size = scanner.nextInt();
            stack = new FixedStack(size);
        } else if (choice == 2) {
            stack = new DynamicStack();
        } else {
            System.out.println("Invalid choice, defaulting to FixedStack with size 3.");
            stack = new FixedStack(3);
        }
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full (only for FixedStack)");
            System.out.println("6. Exit");
            System.out.print("Choose an operation: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter value to push onto the stack: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1) {
                        System.out.println("Popped: " + poppedValue);
                    }
                    break;

                case 3:
                    int topValue = stack.display();
                    if (topValue != -1) {
                        System.out.println("Top element: " + topValue);
                    }
                    break;

                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }
                    break;

                case 5:
                    if (stack instanceof FixedStack) {
                        if (stack.isFull()) {
                            System.out.println("The stack is full.");
                        } else {
                            System.out.println("The stack is not full.");
                        }
                    } else {
                        System.out.println("This operation is not available for DynamicStack.");
                    }
                    break;

                case 6:
                    System.out.println("closing...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
        }
    }
}

/* dynamic stack (do again)
public class DynamicStack implements Stack {
    private ArrayList<Integer> stack;
    public DynamicStack() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(int value) {
        stack.add(value);
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    @Override
    public boolean isFull() {
        return false;
    }
    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }
} */
