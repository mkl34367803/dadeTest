import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/*
 * 文件名：URLDemo.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： URLDemo.java
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
public class URLDemo {
    public static void main(String[] args) throws Exception {
        URL url=new URL("http","www.517na.com",80,"");
        
        InputStream input=url.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(input, "gb2312"));
        Scanner scan=new Scanner(br);
        scan.useDelimiter("\n");
        while (scan.hasNext()) {
           System.out.println(scan.next());
        }
    }
}
