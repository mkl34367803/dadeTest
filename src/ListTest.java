import java.util.ArrayList;
import java.util.List;

import model.MBalanceGroupVo;

/*
 * �ļ�����ListTest.java
 * ��Ȩ��Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ ListTest.java
 * �޸��ˣ�dade
 * �޸�ʱ�䣺2015��6��29��
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
public class ListTest {
    public static void main(String[] args) {
        List<MBalanceGroupVo> vos = new ArrayList<MBalanceGroupVo>();
        MBalanceGroupVo mBalanceGroupVo = new MBalanceGroupVo();
        mBalanceGroupVo.setAge("1");
        mBalanceGroupVo.setPassword("2");
        mBalanceGroupVo.setSex("3");
        mBalanceGroupVo.setUsername("4");
        vos.add(mBalanceGroupVo);
        mBalanceGroupVo.setAge("dade");
    }
}
