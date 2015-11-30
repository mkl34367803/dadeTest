import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * �ļ���Test16.java
 * ��Ȩ��Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * ������ Test16.java
 * �޸��ˣ�dade
 * �޸�ʱ�䣺2015��5��7��
 * �޸����ݣ�����
 */

/**
 * TODO ������һ�仰������.
 * <p>
 * TODO ��ϸ����
 * <p>
 * TODO ʾ�����
 * <pre>
 * </pre>
 * 
 * @author     dade
 */
public class Test16 {
    public static void main(String[] args) {
        System.out.println("WOSHIDADE".substring(2));
        System.out.println("WOSHIDADE".lastIndexOf('D'));
        Scanner scanner=new Scanner(System.in);
        long var=scanner.nextLong();
        scanner.close();
        long b1=System.nanoTime();
        exeComputer(String.valueOf(var));
        System.out.println("second:"+(System.nanoTime()-b1));
        long a1=System.nanoTime();
        int[] arr=new int[10];
        for(long i=0;i<16;i++){
            int temp=0;
            temp=(int) (var%10);
            var/=10;
            arr[temp]++;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        System.out.println("��һ�ַ�ʽ��"+(System.nanoTime()-a1));
    }
    
    private static int rexStr (String pStr, String pRexIndex) {  
        
        int rexCount = 0;  
          
           Matcher m = Pattern.compile(pRexIndex).matcher(pStr);     
             
           while (m.find()) {     
              
            rexCount++;  
           }   
          
          
           return rexCount;  
    }  
    
    private static void exeComputer (String pStr) {  
        
        for (int i = 0; i < 10; i++) {  
              
            System.out.println("����" + i + "��������" + String.valueOf(rexStr(pStr, String.valueOf(i))));  
              
        }  
          
    }  
}
