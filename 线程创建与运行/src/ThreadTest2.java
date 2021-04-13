/*
Runnable接口的run方法
 */

public class ThreadTest2 {

    public static class RunableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("线程 done 2");
        }
    }

    public static void main(String[] args) {

        RunableTask task = new RunableTask();
        new Thread(task).start();
    }

}
