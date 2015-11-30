import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 文件名：HelloServer.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： HelloServer.java
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
 * 
 * <pre>
 * </pre>
 * 
 * @author dade
 */
public class HelloServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket client = null;
        PrintStream out = null;
        server = new ServerSocket(8888);
        while (true) {
            System.out.println("服务器运行，等待客户端连接");
            client = server.accept();
            String str = "hello world!";
            out = new PrintStream(client.getOutputStream());
            byte[] in = new byte[256];
            client.getInputStream().read(in);
            out.write(in);
        }
    }
}
