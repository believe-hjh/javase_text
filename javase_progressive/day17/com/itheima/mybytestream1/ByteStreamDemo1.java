package day17.com.itheima.mybytestream1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    /*
     * 演示：字节输出流FileOutputStream
     * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
     *
     * 实现步骤：
     *       创建对象
     *       写出数据
     *       释放资源
     * */
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileOutputStream f1 = new FileOutputStream("a.txt");
        //2.写出数据
        f1.write(97);
        //3.释放资源
        f1.close();
    }
}
