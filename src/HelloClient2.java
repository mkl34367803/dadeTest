import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/*
 * 文件名：HelloClient.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： HelloClient.java
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
public class HelloClient2 {
    /**
     * TODO 添加方法注释.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        byte[] buf=new byte[]{'2', 'a', 'b', 'c'};
        Socket client=null;
        client=new Socket("localhost", 8888);
        OutputStream outputStream=client.getOutputStream();
        outputStream.write(buf);
        InputStream in=null;
        in=client.getInputStream();
        in.read(buf);
        System.out.println("服务端传过来的内容："+Arrays.toString(buf));
        client.close();
    }
}
