import model.MBalanceGroupVo;

/*
 * �ļ�����ReferenceTest.java
 * ��Ȩ��Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ ReferenceTest.java
 * �޸��ˣ�dade
 * �޸�ʱ�䣺2015��6��4��
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
public class ReferenceTest {
    public static void main(String[] args) {
        MBalanceGroupVo mBalanceGroupVo = new MBalanceGroupVo();
        mBalanceGroupVo.setAge("11");
        mBalanceGroupVo.setPassword("11");
        mBalanceGroupVo.setSex("11");
        mBalanceGroupVo.setUsername("11");
        want2ChangeValue(mBalanceGroupVo);
        System.out.println(mBalanceGroupVo);
    }
    public static void want2ChangeValue(MBalanceGroupVo mBalanceGroupVo) {
        mBalanceGroupVo.setAge("22");
        mBalanceGroupVo.setPassword("22");
        mBalanceGroupVo.setSex("22");
        mBalanceGroupVo.setUsername("22");
    }
}
