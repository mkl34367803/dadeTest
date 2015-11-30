import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 文件名：Fruit.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Fruit.java
 * 修改人：dade
 * 修改时间：2015年11月24日
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
interface Fruit{
    public void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit{

    /** 
     * {@inheritDoc}.
     */
    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}
class Factory{
    public static Fruit getInstance(String className){
        Fruit fruit=null;
        try{
            fruit=(Fruit) Class.forName(className).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}
class Init{
    @Deprecated
    @SuppressWarnings(value = {""})
    public static Properties getPro(){
        Properties pro=new Properties();
        File f=new File("d:\\fruit.properties");
        try{
            if(f.exists()){
                pro.load(new FileInputStream(f));
            }else{
                pro.setProperty("apple", "Apple");
                pro.setProperty("orange", "Orange");
                pro.store(new FileOutputStream(f), "Fruit class");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pro;
    }
}
public class FactoryDemo2 {
    public static void main(String[] args) {
        Properties pro=Init.getPro();
        Fruit f=Factory.getInstance(pro.getProperty("apple"));
        if(f!=null){
            f.eat();
        }
    }
}
