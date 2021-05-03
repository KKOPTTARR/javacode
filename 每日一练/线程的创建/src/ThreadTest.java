
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run()方法执行中...");
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName() +"main()执行完成...");
    }
}
