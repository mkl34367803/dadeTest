import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * 文件名：ProxyTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ProxyTest.java
 * 修改人：dade
 * 修改时间：2015年5月6日
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
public class ProxyTest implements InvocationHandler{

    private Object proxied;

    public ProxyTest(Object proxied) {
        this.proxied = proxied;
    }

    /** 
     * {@inheritDoc}.
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }

}
