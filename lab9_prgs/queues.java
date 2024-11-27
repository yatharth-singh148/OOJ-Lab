//q4 lab9
import java.util.Scanner;
public interface Queue {
    void enqueue(int value);
    int dequeue();
    boolean isEmpty();
    boolean isFull();
    int display();
}
public class FixedQueue implements Queue {
    private int[] queue;
    private int front, rear, size, maxSize;
    public FixedQueue(int size) {
        maxSize = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        this.size = 0;
    }

    @Override
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
            size++;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % maxSize;
            size--;
            return value;
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxSize;
    }

    @Override
    public int display() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        } else {
            return queue[front];
        }
    }
}
public class QueueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--: FIXED QUEUE :--");
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if queue is empty");
            System.out.println("5. Check if queue is full (only for FixedQueue)");
            System.out.println("6. Exit");
            System.out.print("Choose an operation: ");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued: " + dequeuedValue);
                    }
                    break;

                case 3:
                    int frontValue = queue.Display();
                    if (frontValue != -1) {
                        System.out.println("Front element: " + frontValue);
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("The queue is not empty.");
                    }
                    break;

                case 5:
                    if (queue instanceof FixedQueue) {
                        if (queue.isFull()) {
                            System.out.println("The queue is full.");
                        } else {
                            System.out.println("The queue is not full.");
                        }
                    } else {
                        System.out.println("This operation is not available for DynamicQueue.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
        }
    }
}
