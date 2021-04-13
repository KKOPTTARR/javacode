/*
方法一：继承Thread类并重写run方法
 */


public class ThreadTest {

    //继承Thread类并重写run方法
    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("线程 done");
        }
    }

    public static void main(String[] args) {

        //创建线程
        MyThread thread = new MyThread();

        //启动线程
        thread.start();
    }
}
