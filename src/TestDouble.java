import java.math.BigDecimal;

/*
 * �ļ�����TestDouble.java
 * ��Ȩ��Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ TestDouble.java
 * �޸��ˣ�dade
 * �޸�ʱ�䣺2015��9��29��
 * �޸����ݣ�����
 */
/**
 * TODO ������һ�仰������.
 * <p>
 * TODO ��ϸ����
 * <p>
 * TODO ʾ������
 * <pre>
 * </pre>
 * 
 * @author     dade
 */
public class TestDouble {
    public static void main(String[] args) {
        Double number = 1.226;
        BigDecimal bd = new BigDecimal(number);
        BigDecimal setScale = bd.setScale(2, bd.ROUND_DOWN);
        System.out.println(setScale);
    }
}
