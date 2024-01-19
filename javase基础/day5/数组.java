package itheima.day5;

public class 数组 {
    /*
      数组介绍 : 一种容器, 可以存储同种数据类型的多个值

      数组的使用场景 : 发现手里的数据有多个, 并且这多个数据还属于同一组数据, 就可以考虑使用数组容器进行维护.

      初始化 : 在内存中, 为数组容器开辟空间, 并将数据存入容器的过程.

      数组的定义格式 :

              1. 数据类型[] 数组名;

              2. 数据类型 数组名[];

              注意 : 这种定义格式, 定义出来的, 只是数组类型的变量而已, 内存中还没有创建出数组容器.
   */
    public static void main(String[] args) {
                arrly();
    }
    /*
        数组的静态初始化格式 :

                1. 完整格式 :
                                数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3...};

                2. 简化格式 :
                                数据类型[] 数组名 = {元素1, 元素2, 元素3...};

        打印数组名 :

                [I@776ec8df

                @ : 分割符
                [ : 当前空间, 是数组类型的
                I : 当前数组类型, 是int类型
                776ec8df : 数组的十六进制内存地址
     */
    public static void arrly() {
        int arrly [] = {11,22,33,44};
        double arrly2[]={11,2,33,44,55,66,66};
        System.out.println(arrly);
        System.out.println(arrly2);
    }
}
