import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 文件名：ArrayListDemo01.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： ArrayListDemo01.java
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
public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<String> allList=new ArrayList<String>();
        Collection<String> allCollection=new ArrayList<String>();
//        allList.add("hello");
//        allList.add(0,"WORLD");
//        System.out.println(allList);
//        System.out.println(allList.get(1));
//        for(int i=0;i<allList.size();i++){
//            System.out.println(allList.get(i));
//        }
        allCollection.add("hello");
        allCollection.add("beautiful");

        allCollection.add("world");
        System.out.println(allCollection);
        System.out.println(allCollection.toArray());
    }
}
