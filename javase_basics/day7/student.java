package itheima.day7;

public class student {
    /*
    前提需知 : Java当中要想创建对象, 必须现有类的存在

    类 : 一组相关属性和行为的集合, 将其看做为是对象的设计图.
    对象 : 是根据设计图(类), 创建出来的实体

    类和对象的关系:

            1) 依赖关系: 需要根据类, 创建对象
            2) 数量关系: 根据一个类, 可以创建出多个对象

    类的组成:

            类的本质 : 就是对事物进行的描述

                    举例1: 我之前有一个{学生}, 叫做<张三>, 今年<23岁>了, <180的身高>, 平时就喜欢(吃饭)和(学习)...
                    举例2: 前一阵买了一台<白色>的<海尔>{洗衣机}, 花了我<1999块钱>, 老心疼了, 但是(洗衣服)和(甩干)倒是挺方便...


            属性(名词): 在代码中使用成员变量表示, 成员变量跟之前定义变量的格式一样, 只不过位置发生了改变, 类中方法外.

            行为(动词): 在代码中使用成员方法表示, 成员方法跟之前定义方法的格式一样, 只不过需要去掉 static 关键字
 */
    String name ="张静";
    int age = 22;
    public void eat(){
        System.out.println("学生吃饭");
    }
    public void shop(){
        System.out.println("学生购物");
    }
}