import java.util.Date;

/*
 * �ļ�����StringBufferTest.java
 * ��Ȩ��Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ StringBufferTest.java
 * �޸��ˣ�dade
 * �޸�ʱ�䣺2015��7��21��
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
public class StringBufferTest {
    public static void main(String[] args) {
        Date date=new Date();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("this is a test,");
        stringBuffer.append(date);
        System.out.println(stringBuffer);
    }
}
