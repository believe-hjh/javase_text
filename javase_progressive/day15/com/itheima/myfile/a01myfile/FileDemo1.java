package day15.com.itheima.myfile.a01myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象

        C:\Users\alienware\Desktop

        \:转移字符
    */
        //1.根据文件路径创建文件对象
        String str = "C:\\Users\\13350\\Desktop\\a.txt";
        File f1 = new File(str);
        System.out.println(f1);//C:\Users\13350\Desktop\a.txt
        //2.根据父路径名字符串和子路径名字符串创建文件对象
        String parent = "C:\\Users\\13350\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);//C:\Users\13350\Desktop\a.txt
        File f3 = new File(parent+"\\"+child);
        System.out.println(f3);


        //3.根据父路径对应文件对象和子路径名字符串创建文件对象
        File f4 = new File("C:\\Users\\13350\\Desktop");
        String child2 = "a.txt";
        File f5 = new File(f4,child2);
        System.out.println(f5);
    }
}
