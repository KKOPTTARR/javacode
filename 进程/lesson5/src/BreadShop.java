public class BreadShop {

    private static int count;

    public static class Consumer implements Runnable{

        private String name;
        public Consumer(String name){
            this.name = name;
        }

        @Override
        public void run() {
            try{
                while(true){
                    synchronized (BreadShop.class) {
                        if (count == 0) {
                            BreadShop.class.wait();
                        } else {
                            System.out.printf("消费者 d% 消费了1个面包\n",name);
                            count--;
                            BreadShop.class.notifyAll();
                            Thread.sleep(500);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Producer implements Runnable{

        private String name;
        public Producer(String name){
            this.name = name;
        }


        @Override
        public void run() {
            try{
                while(true){
                    synchronized (BreadShop.class) {
                        if (count + 3 > 100) {
                            BreadShop.class.wait();
                        } else {
                            System.out.printf("生产者 d% 生产了3个面包\n",name);
                            count+=3;
                            BreadShop.class.notifyAll();
                            Thread.sleep(500);
                        }
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Object object=new Object();
        Thread[] consumers = new Thread[20];

        for(int i=0;i<10;i++){
            consumers[i] = new Thread(new Consumer(String.valueOf(i)));
        }

        for(int i =0;i<20;i++){
            consumers[i].start();
        }

        Thread[] producers = new Thread[20];

        for(int i =0;i<20;i++){
            producers[i] = new Thread(new Producer(String.valueOf(i)));
        }

        for(int i =0;i<20;i++){
            producers[i].start();
        }

    }
}
