
/*
 * 文件名：VolatileTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： VolatileTest.java
 * 修改人：dade
 * 修改时间：2015年11月16日
 * 修改内容：新增
 */
/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * <pre>
 * </pre>
 * 
 * @author dade
 */
public class VolatileTest {
    public static volatile  int count = 0;
    public static void inc() {
        //这里延迟1毫秒，使得结果明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        count++;
    }
    public static void main(String[] args) {
        System.out.println("woca");
        //同时启动1000个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    VolatileTest.inc();
                    System.out.println("运行结果:Counter.count=" + VolatileTest.count);
                }
            }).start();
        }
        //这里每次运行的值都有可能不同,可能为1000
    }
}
