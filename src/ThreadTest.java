public class ThreadTest {
    private  static boolean bChanged=false;
    public static void main(String[] args) throws Exception {
        new Thread() {
            @Override
            public void run() {
                bChanged=true;
                System.out.println("先执行！");
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("here is runned");
                System.out.println(bChanged);
            }
        }.start();
        System.out.println("main thread!");
        new Thread() {
            @Override
            public void run() {
                System.out.println(2);
                System.out.println(bChanged);
                bChanged=false;
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println(3);
                System.out.println(Thread.currentThread().getName()+bChanged);
                bChanged=false;
            }
        }.start();
    }
}
