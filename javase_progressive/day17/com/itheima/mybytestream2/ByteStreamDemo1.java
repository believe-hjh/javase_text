package day17.com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileInputStream fls = new FileInputStream("D:\\JAVA_TEXT\\javase_study\\src\\javase_progressive\\day17\\com\\itheima\\mybytestream2\\a.txt");
        //操作文件
        int b1 = fls.read();
        System.out.println((char)b1);
        int b2 = fls.read();
        System.out.println((char)b2);
        int b3 = fls.read();
        System.out.println((char)b3);
        int b4 = fls.read();
        System.out.println((char)b4);
        int b5 = fls.read();
        System.out.println((char)b5);
        //释放内存
        fls.close();
    }
}