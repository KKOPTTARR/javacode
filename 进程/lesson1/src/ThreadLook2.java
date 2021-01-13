public class ThreadLook2 {

    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override
            public void run(){
                while(true){

                }
            }
        };

        t.start();
    }
}
