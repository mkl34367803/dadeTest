import java.net.InetAddress;
import java.util.Arrays;

/*
 * 文件名：InetAddressDemo.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： InetAddressDemo.java
 * 修改人：dade
 * 修改时间：2015年11月23日
 * 修改内容：新增
 */
/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * <pre>
 * </pre>
 * 
 * @author     dade
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress locAdd=null;
        InetAddress remAdd=null;
        remAdd=InetAddress.getByName("www.baidu.com");
        System.out.println(remAdd.getCanonicalHostName());
        System.out.println(remAdd.getHostAddress());
        System.out.println(remAdd.getHostName());
        System.out.println(Arrays.toString(remAdd.getAddress()));
        System.out.println(remAdd.getLocalHost());
        System.out.println(InetAddress.getLocalHost());
        System.out.println(remAdd.getLoopbackAddress());
    }
}
