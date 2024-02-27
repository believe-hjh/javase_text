# 常用 API

**什么是API?**

- **API(Application Programming interface) 应用程序编程接口。**

- **简单来说：就是** **Java** **帮我们已经写好的一些类和方法，我们直接拿过来用就可以了**

## Object 类

### **Object 类介绍：**

- 所有的类，都直接或者间接的继承了 Object 类 （祖宗类）

- Object类的方法是一切子类都可以直接使用的，所以我们要学习Object类的方法。

### **Object类的常用方法：**

| 方法名                              | 说明                                                         |
| ----------------------------------- | ------------------------------------------------------------ |
| public String **toString()**        | 默认是返回当前对象在堆内存中的地址信息:类的全限名@内存地址   |
| public Boolean **equals**(Object o) | 默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false |

#### **Object的toString** **方法：**

| 方法名                   | 说明                                                         |
| ------------------------ | ------------------------------------------------------------ |
| public String toString() | 默认是返回当前对象在堆内存中的地址信息:类的全类名@十六进制哈希值 |

- 开发中直接输出对象，默认输出对象的地址其实是毫无意义的。

- 开发中输出对象变量，更多的时候是希望看到对象的内容数据而不是对象的地址信息。

```java
package day5.object.tostring;

import day5.object.Student;

import java.util.ArrayList;

public class ToStringDemo {
    /*
         public String toString() 返回该对象的字符串表示

            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }

            getClass().getName() : 类名称, 全类名(包名 + 类名)
            Integer.toHexString() : 转十六进制
            hashCode() : 返回的是对象内存地址 + 哈希算法, 算出来的整数 (哈希值)

         -------------------------------------------------------

         细节: 使用打印语句, 打印对象名的时候, println方法, 源码层面, 会自动调用该对象的toString方法.

             public static String valueOf(Object obj) {
                return (obj == null) ? "null" : obj.toString();
             }
     */
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());

        Student stu = new Student("张三",23);
        System.out.println(stu);

        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");

        System.out.println(list);

    }
}

class A {

    @Override
    public String toString() {
        return "大哥重写了toString方法";
    }
}
```



##### **toString存在的意义**

- 父类 toString() 方法存在的意义就是为了被子类重写，以便返回对象的内容信息，而不是地址信息！！

#### **Object的equals 方法：**

| 方法名                              | 说明                                         |
| ----------------------------------- | -------------------------------------------- |
| public boolean **equals**(Object o) | 默认是比较当前对象与另一个对象的地址是否相同 |

##### **equals存在的意义**

- 父类equals方法存在的意义就是为了被子类重写，以便子类自己来定制比较规则。

```java
Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三",23);
        System.out.println(stu1.equals(stu2));
```

```java
@Override
public boolean equals(Object obj) {
    if(obj instanceof Student){
        Student stu = (Student) obj;
        return (this.age ==stu.age&&this.name.equals(stu.name));
    }
    else {
        return false;
    }
}
```

#### **Objects** **概述**

**Objects类与 Object 还是继承关系，Objects类是从JDK 1.7开始之后才有的。**

##### **Objects的常见方法：**

| 方法名                                           | 说明                                                         |
| ------------------------------------------------ | ------------------------------------------------------------ |
| public static boolean equals(Object a, Object b) | 比较两个对象的，底层会先进行非空判断，从而可以避免空指针异常。再进行equals比较 |
| public static boolean isNull(Object obj)         | 判断变量是否为 null                                          |

源码分析

```java
public static boolean equals(Object a, Object b) {
   return (a == b) || (a != null && a.equals(b));
 }
```



## Math 类

- 包含执行基本数字运算的方法

| 方法名                                      | 说明                                  |
| ------------------------------------------- | ------------------------------------- |
| public static int abs(int a)                | 获取参数绝对值                        |
| public static double  ceil(double a)        | 向上取整                              |
| public static double  floor(double a)       | 向下取整                              |
| public static int round(float a)            | 四舍五入                              |
| public static int max(int a,int b)          | 获取两个int值中的较大值               |
| public static double pow(double a,double b) | 返回a的b次幂的值                      |
| public static double random()               | 返回值为double的随机值，范围[0.0,1.0) |

## System 类

- System的功能是静态的，都是直接用类名调用即可

| 方法名                                                       | 说明                                                         |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| public  static void exit(int status)                         | 终止当前运行的 Java 虚拟机，非零表示异常终止                 |
| public  static long currentTimeMillis()                      | 返回当前系统的时间毫秒值形式  - 返回1970年1月1日 0时0分0秒, 到现在所经历过的毫秒值 |
| public  static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数) | 数组拷贝                                                     |



## BigDecimal 类

- 用于解决小数运算中, 出现的不精确问题

BigDecimal创建对象 :

```txt
public BigDecimal(double val) : 不推荐, 无法保证小数运算的精确
---------------------------------------------------------------
public BigDecimal(String val)
public static BigDecimal valueOf(double val)
```



| 方法名                                                       | 说明 |
| ------------------------------------------------------------ | ---- |
| public BigDecimal add(BigDecimal b)                          | 加法 |
| public BigDecimal subtract(BigDecimal b)                     | 减法 |
| public BigDecimal multiply(BigDecimal b)                     | 乘法 |
| public BigDecimal divide(BigDecimal b)                       | 除法 |
| public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) | 除法 |



## 包装类

- 将**基本数据类型**, 包装成**类** (变成引用数据类型)

- 好处：变成类, 就可以创建对象了

  对象就可以调用方法方便的解决问题了

| 基本数据类型 | 引用数据类型 |
| ------------ | ------------ |
| byte         | Byte         |
| short        | Short        |
| int          | Integer      |
| long         | Long         |
| char         | Character    |
| float        | Float        |
| double       | Double       |
| boolean      | Boolean      |

手动装箱: 调用方法, 手动将基本数据类型, 包装成类

  1. public Integer(int value) : 通过构造方法 (不推荐)
  2. public static Integer valueOf(int i) : 通过静态方法

手动拆箱: 调用方法, 手动将包装类, 拆成(转换)基本数据类型

​        1. public int intValue() : 以 int 类型返回该 Integer 的值

##### **Integer** **常用方法**

| 方法名                                     | 说明                                |
| ------------------------------------------ | ----------------------------------- |
| public static String toBinaryString(int i) | 得到二进制                          |
| public static String toOctalString(int i)  | 得到八进制                          |
| public static String toHexString(int i)    | 得到十六进制                        |
| public static int parseInt(String s)       | 将字符串类型的整数转成int类型的整数 |