public class JoinTest {

    public static void main(String[] args) throws InterruptedException {

        ThreadTest t1=new ThreadTest("A");
        ThreadTest t2=new ThreadTest("B");
        t1.start();
        //t1.join();
        t2.start();
        t2.join();
    }


}

class ThreadTest extends Thread {
    private String name;
    public ThreadTest(String name){
        this.name=name;
    }
    public void run(){
        int a = 0;
        for (long i = 0; i < 10; i++) {
            System.out.println(name + i);
        }
    }
}