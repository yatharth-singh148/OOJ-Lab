class PrintBMS implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
                System.out.println("BMS College of Engineering");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintCSE implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("CSE");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CollegeThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintBMS());
        Thread thread2 = new Thread(new PrintCSE());
        thread1.start();
        thread2.start();
    }
}
