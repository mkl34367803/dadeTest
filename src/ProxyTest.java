import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * �ļ�����ProxyTest.java
 * ��Ȩ��Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ ProxyTest.java
 * �޸��ˣ�dade
 * �޸�ʱ�䣺2015��5��6��
 * �޸����ݣ�����
 */

/**
 * TODO ������һ�仰������.
 * <p>
 * TODO ��ϸ����
 * <p>
 * TODO ʾ������
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
