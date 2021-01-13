public class CreateThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t = new Thread();
        t.start();


        //合并的代码
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();


    }
}
