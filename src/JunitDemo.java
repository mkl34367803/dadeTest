import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/*
 * 文件名：JunitDemo.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： JunitDemo.java
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
public class JunitDemo {
    @Test
    public void test() {
        assertTrue("这个是不对的", 1==1);
        fail("Not yet implemented");
    }
}
