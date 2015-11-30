import java.math.BigDecimal;

/*
 * 文件名：TestDouble.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TestDouble.java
 * 修改人：dade
 * 修改时间：2015年9月29日
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
public class TestDouble {
    public static void main(String[] args) {
        Double number = 1.226;
        BigDecimal bd = new BigDecimal(number);
        BigDecimal setScale = bd.setScale(2, bd.ROUND_DOWN);
        System.out.println(setScale);
    }
}
