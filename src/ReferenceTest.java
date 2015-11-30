import model.MBalanceGroupVo;

/*
 * 文件名：ReferenceTest.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ReferenceTest.java
 * 修改人：dade
 * 修改时间：2015年6月4日
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
