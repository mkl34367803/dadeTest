import java.util.ArrayList;
import java.util.List;

import model.MBalanceGroupVo;

/*
 * 文件名：ListTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ListTest.java
 * 修改人：dade
 * 修改时间：2015年6月29日
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
