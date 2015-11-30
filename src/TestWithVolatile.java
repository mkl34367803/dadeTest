/**
 * @author dade
 *
 */
public class TestWithVolatile {
    /**
     * 添加字段注释.
     */
    private static  boolean bChanged=false;
    /**
     * TODO 添加方法注释.
     * 
     * @param args args
     * @throws InterruptedException yichang
     */
    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                for (;;) {
                                        System.out.println(1);
                    if (bChanged == !bChanged) {
                        System.out.println("!=");
                        System.exit(0);
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (;;) {
                    System.out.println(2);
                    bChanged = !bChanged;
                    //                    try {
                    //                        sleep(500);
                    //                    } catch (InterruptedException e) {
                    //                        // TODO Auto-generated catch block
                    //                        e.printStackTrace();
                    //                    }
                }
            }
        }.start();
        for(;;){
            System.out.println(bChanged);
        }
    }
}
