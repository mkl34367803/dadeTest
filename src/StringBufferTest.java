import java.util.Date;

/*
 * 文件名：StringBufferTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： StringBufferTest.java
 * 修改人：dade
 * 修改时间：2015年7月21日
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
public class StringBufferTest {
    public static void main(String[] args) {
        Date date=new Date();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("this is a test,");
        stringBuffer.append(date);
        System.out.println(stringBuffer);
    }
}
