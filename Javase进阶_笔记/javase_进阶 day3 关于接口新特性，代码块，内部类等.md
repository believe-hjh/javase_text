# javase_进阶 day3

## 接口新特性：

**JDK8**的新特性：接口中可以定义有方法体的方法。（默认、静态）

**JDK9**的新特性：接口中可以定义私有方法

## **JDK8** **接口特性**：

   1. 允许定义非抽象方法, 需要加入default关键字

            - 作用: 解决接口的升级问题
            - 注意事项:
                        1. public可以省略, 但是default不能省略
                        2. 默认方法, 实现类是允许重写的, 但是需要去掉default关键字
                        3. 如果实现了多个接口, 多个接口中存在相同的默认方法, 实现类必须重写默认方法

 2. 允许定义静态方法

             - 理解: 既然接口已经允许方法带有方法体了, 干脆也放开静态方法, 可以类名调用

             - 注意事项 :
                            1. public可以省略, 但是static不能省略
                            2. 接口中的静态方法, 只允许接口名进行调用, 不允许实现类通过对象调用

### 接口中默认方法的定义格式：

```java
public default 返回值类型 方法名(参数列表) {}

public default void show() {}
```

## 代码块：

**在Java类下，使用 { } 括起来的代码被称为代码块**

### 分类：

- 局部代码块

​						位置：方法中的一堆大括号

​						作用: 限定变量的生命周期, 提早的释放内存	

- 构造代码块

 					   位置: 类中方法外的一对大括号
 	                    特点: 在创建对象, 执行构造方法的时候, 就会执行构造代码块 (优先于构造方法执行)
 	                    作用: 将多个构造方法中, 重复的代码, 抽取到构造代码块中, 从而提升代码的复用性

- 静态代码块

​						位置: 类中方法外的一对大括号, 需要加入static关键字
​						特点: 随着类的加载而执行, 因为类只加载一次, 所以也就只执行一次
​						作用: 对数据进行初始化

- 同步代码块

## 内部类
### 成员内部类
- 内部类就是定义在一个类里面的类

- 创建对象的格式

  格式：**外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();**
  范例：**Outer.Inner in = new Outer().new Inner();**

成员访问细节 

1. 内部类中, 访问外部类成员 : 直接访问, 包括私有
2.  外部类中, 访问内部类成员 : 需要创建对象访问
### 静态内部类

- 有 static 修饰的成员内部类

```java
class Outer {
    static class Inner { }
}
```

- **静态内部类创建对象的格式：**  

```java
格式：外部类名.内部类名 对象名 = new 外部类名.内部类对象();
范例：Outer.Inner in = new Outer.Inner();

```

###  局部内部类 （鸡肋语法，了解即可）

- 局部内部类放在方法、代码块、构造器等执行体中。

###  匿名内部类

- 概述：匿名内部类本质上是一个特殊的局部内部类（定义在方法内部）

- 前提：需要存在一个接口或类

- 格式：

```java
new 类名 / 接口 () {

 }
```

- new 类名(){}  : 代表继承这个类
- new 接口名(){} : 代表实现这个接口

## Lambda表达式

### **Lambda** 概述

- Lambda表达式是 JDK8 开始后的一种新语法形式。

- **作用：简化匿名内部类的代码写法。**

### Lambda表达式的简化格式

- () -> {}

- (匿名内部类被重写方法的形参列表) -> {
    被重写方法的方法体代码。
   }

  注：-> 是语法形式，无实际含义

- **注意：Lambda** **表达式只能简化函数式接口的匿名内部类的写法形式**

### 什么是函数式接口？

- 首先必须是接口、其次接口中有且仅有一个抽象方法的形式

- 通常我们会在接口上加上一个@FunctionalInterface注解，标记该接口必须是满足函数式接口。

**Lambda表达式的省略写法**

- 参数类型可以省略不写。

- 如果只有一个参数，参数类型可以省略，同时 () 也可以省略。

- 如果Lambda表达式的方法体代码只有一行代码

​		可以省略大括号不写,同时要省略分号

​		此时，如果这行代码是return语句，必须省略return不写，同时也必须省略 ";" 不写

以下为4个lambda的案例练习：

根据**Lambda表达式的省略写法**将**匿名内部类**修改为lambda表达式:

```java
    public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
        @Override
        public void show() {
            System.out.println("我是匿名内部类, 重写后的show方法...");
        }
    });

    System.out.println("-----------------------");

    useShowHandler(() -> System.out.println("Lambda表达式, 重写后的show方法..."));

}

public static void useShowHandler(ShowHandler showHandler) {
    showHandler.show();
}
}

interface ShowHandler {
    void show();
}
```

```java
public class LambdaTest2 {
    public static void main(String[] args) {

        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类打印:" + msg);
            }
        });
        System.out.println("---------------------");

        useStringHandler(msg -> System.out.println("Lambda打印:" + msg));

    }

    public static void useStringHandler(StringHandler stringHandler) {

        stringHandler.printMessage("itheima");
    }
}

interface StringHandler {
    void printMessage(String msg);
}
```

```java
import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {

        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                return new Random().nextInt(100) + 1;
            }
        });

        System.out.println("-----------------------");

        useRandomNumHandler(() -> new Random().nextInt(100) + 1);

    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        // RandomNumHandler randomNumHandler = new RandomNumHandler() {
        //            @Override
        //            public int getNumber() {
        //                Random r = new Random();
        //                int num = r.nextInt(100) + 1;
        //                return num;
        //            }
        //        }
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }
}

interface RandomNumHandler {
    int getNumber();
}
```

```java
public class LambdaTest4 {
    public static void main(String[] args) {

        useCalculator((a, b) -> a + b);

        System.out.println("---------------------------");

        useCalculator((a, b) -> a - b);

    }

    public static void useCalculator(Calculator calculator) {
        // Calculator calculator = new Calculator() {
        //            @Override
        //            public int calc(int a, int b) {
        //                return a + b;
        //            }
        //        }
        int result = calculator.calc(10, 20);
        System.out.println(result);
    }

}

interface Calculator {
    int calc(int a, int b);
}

```

### Lambda表达式和匿名内部类的区别

使用限制不同

- 匿名内部类 : 可以操作类, 接口

- Lambda表达式 : 只能操作函数式接口

实现原理不同

- 匿名内部类：编译之后，产生一个单独的.class字节码文件

- Lambda表达式：编译之后，没有一个单独的.class字节码文件

## u窗体、组件、事件

### **窗体对象** **JFrame**

**JFrame基本结构**：

```java
package com.itheima.frame;

import javax.swing.*;


public class JFrameTest {
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame frame = new JFrame();
        // 设置窗体大小
        frame.setSize(500, 800);
        // 修改窗体的关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置窗体标题
        frame.setTitle("这是大哥的第一个窗体!");
        // 设置窗体可见
        frame.setVisible(true);
    }
}
```

**组件**：

按钮组件：

- Button ( )

​		创建一个没有设置文本或图标的按钮。

- Button ( String next)

  创建一个带文本的按钮。 

获取方法：

- 窗体对象.getContentPane().add(组件);

##### 案例演示: 窗体中添加按钮组件

注意: 如果取消了窗体的默认布局, 就需要手动指定组件的摆放位置了

 

```java
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消窗体默认布局
        frame.setLayout(null);
    	// 1. 创建按钮对象
    	JButton btn = new JButton("点我啊~");
    	btn.setBounds(50,50, 100,100);
    	// 2. 将按钮添加到窗体的 [面板对象] 中
    	frame.getContentPane().add(btn);

    	frame.setVisible(true);
}
}
```
按钮组件总结：

1.窗体对象.setLayout(null); 取消默认布局

2.创建组件对象

3.组件对象.setBounds(x,y,width,height); 设置摆放位置

4.窗体对象.getContentPane().add(组件对象);

#### JLabel展示图片和文字

```java
package day3.frame.label;

import javax.swing.*;

public class JLabelTest {
    /*
        案例: 使用JLabel展示文本和图片

        JLabel构造方法 :
            JLabel(String text) 使用指定的文本创建一个 JLabel 对象
            JLabel(Icon image) 创建一个具有指定图像的 JLabel 对象
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // JLabel展示文本
        JLabel jl1 = new JLabel("听君一席话");
        jl1.setBounds(50,50,100,100);
        frame.getContentPane().add(jl1);

        JLabel jl2 = new JLabel("如听一席话");
        jl2.setBounds(150, 50, 100,100);
        frame.getContentPane().add(jl2);

        // JLabel展示图片
        JLabel imgLabel_3png = new JLabel(new ImageIcon("D:\\image\\3.png"));
        imgLabel_3png.setBounds(50, 150, 100,100);
        frame.getContentPane().add(imgLabel_3png);

        JLabel imgLabel_2png = new JLabel(new ImageIcon("D:\\image\\2.png"));
        imgLabel_2png.setBounds(150, 150, 100, 100);
        frame.getContentPane().add(imgLabel_2png);

        JLabel img = new JLabel(new ImageIcon("D:\\image\\win.png"));
        img.setBounds(50, 250, 266, 88);
        frame.getContentPane().add(img);


        frame.setVisible(true);
    }
}

```

#### 动作事件 : ActionListener

可以检测的动作：

1. 鼠标点击 
1.  空格按键

代码示例：

```java
事件源对象.addActionListener(new ActionListener() {
	@Override    
    public void actionPerformed(ActionEvent e) {    
	System.out.println("我被点了!!!");
}});

```



```java
package day3.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest {
    /*
        动作事件 : ActionListener

                1. 鼠标点击  2. 空格按键
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn = new JButton("按钮");
        btn.setBounds(0,0,100,100);
        frame.getContentPane().add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了!!!");
            }
        });


        frame.setVisible(true);
    }
}

```

#### KeyListener : 键盘监听器 

```java
package day3.listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerTest {
    /*
        键盘事件 : KeyListener
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // fn ctrl esc 上下左右
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if(keyCode == 37) {
                    System.out.println("左移动业务代码");
                }else if(keyCode == 38){
                    System.out.println("上移动业务代码");
                }else if(keyCode == 39){
                    System.out.println("右移动业务代码");
                }else if(keyCode == 40){
                    System.out.println("下移动业务代码");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.setVisible(true);
    }
}

```

#### 焦点: 程序的注意力集中在了某一个组件上

注意: 按钮组件比较特殊, 在创建好之后, 程序的焦点, 默认就停留在按钮组件上面
        - 但按钮组件, 其实不需要占用程序的焦点
                - 可以通过 setFocusable(false); 取消焦点

```java
package day3.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tips {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn = new JButton("按钮");
        btn.setBounds(0, 0, 100, 100);
        frame.getContentPane().add(btn);

        // ------------------------------------------------------

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被点了!!!");
            }
        });

        btn.setFocusable(false);

        // ------------------------------------------------------

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("键盘按下了");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        // ------------------------------------------------------

        frame.setVisible(true);
    }
}

```

### 适配器设计模式

- 设计模式（Design pattern）是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。

​     使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性、程序的重用性。

- 适配器设计模式：解决接口与接口实现类之间的矛盾问题

- 实现步骤：

  1.编写一个 xxxAdapter 类, 实现对应接口

  2.重写内部所有抽象方法, 但方法都是空实现

  3.让自己的类去继承适配器类, 重写自己需要的方法即可

  4.为了避免其他类创建适配器类的对象, 使用 abstract 进行修饰

```java
package day3.design.adapter;

public class AdapterTest2 {
    /*
        适配器设计模式: 解决接口与接口实现类之间的矛盾问题
     */
    public static void main(String[] args) {

    }
}

interface 和尚 {
    void 打坐();
    void 念经();
    void 撞钟();
    void 习武();
}

abstract class 和尚Adapter implements 和尚 {

    @Override
    public void 打坐() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {

    }
}

class 鲁智深 extends 和尚Adapter {
    @Override
    public void 习武() {
        System.out.println("拳打镇关西");
        System.out.println("大闹野猪林");
        System.out.println("倒拔垂杨柳");
        System.out.println("黑马学Java");
    }
}

class 唐僧 extends 和尚Adapter {

    @Override
    public void 打坐() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 撞钟() {

    }

}
```

### 模板设计模式

- 模板设计模式：把抽象类整体就可以看做成一个模板，模板中不能决定的东西定义成抽象方法

​		让使用模板的类（继承抽象类的类）去重写抽象方法实现需求 

- 小结：模板设计模式的优势，模板已经定义了通用结构，使用者只需要关心自己需要实现的功能即可

代码示例：

```java
public abstract class CompositionTemplate {

    public final void write() {
        System.out.println("我的爸爸");

        body();

        System.out.println("啊~  这就是我的爸爸~");
    }

    public abstract void body();
}
```

上文代码以作文模版举例，将开头和结尾模版作为模版，中间的body方法为用户自行发挥

下文为示例：

```java
public class Tom extends CompositionTemplate {
    @Override
    public void body() {
        System.out.println("我的爸爸是一个争强好色的人, 每天晚上都忙到很晚, 才陆陆续续的回家...");
    }
}
```

```java
public class Tony extends CompositionTemplate {

    @Override
    public void body() {

    }
}

```

```java
public class Test {
    public static void main(String[] args) {
        Tom t = new Tom();
        t.write();
    }
}
```

