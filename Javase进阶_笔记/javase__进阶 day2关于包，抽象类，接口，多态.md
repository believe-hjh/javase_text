# javase__进阶 day2  面向对象高级 

## 包

### 什么是包

- 包本质来说就是文件夹, 用来管理类文件的
- 建包的语法格式：package 公司域名倒写.技术名称。报名建议全部英文小写，且具备意义

### 导包

- l相同包下的类可以直接访问，不同包下的类必须导包,才可以使用！导包格式：**import** **包名.类名**;
- 假如一个类中需要用到不同类，而这个两个类的名称是一样的，那么默认只能导入一个类，另一个类要带包名访问。

## 抽象类和抽象方法

### 抽象类是一种特殊的父类，内部可以编写抽象方法

- 问题: 特殊在哪里呢?
  回答: 内部允许编写抽象方法

- 问题: 什么是抽象方法?
  回答: 当我们将共性的方法, 抽取到父类之后, 发现这个方法在父类中无法给出具体明确(描述不清了)
          而且这个方法, 还是子类必须要有的方法, 就可以设计为抽象方法

### 格式

- 抽象方法的定义格式：

​		public **abstract** 返回值类型 方法名(参数列表);

- 抽象类的定义格式：

  public **abstract** class 类名{}

### 注意事项

1. 抽象类不能实例化
	- 如果抽象类允许创建对象, 就可以调用内部没有方法体的, 抽象方法了
2. 抽象类存在构造方法
	- 交给子类, 通过super进行访问
3. 抽象类中可以存在普通方法
	- 可以让子类继承到继续使用
4. 抽象类的子类
	1). 要么重写抽象类中的所有抽象方法
	2). 要么是抽象类

### abstract 关键字的冲突

- final：被 abstract 修饰的方法，强制要求子类重写，被 final 修饰的方法子类不能重写

- private：被 abstract 修饰的方法，强制要求子类重写，被 private 修饰的方法子类不能重写

- static：被 static 修饰的方法可以类名调用，类名调用抽象方法没有意义

## 接口

### 接口规则介绍：体现的思想是对规则的声明

- Java中的接口更多体现的是对行为的抽象。

- 接口: 体现的思想就是声明 [规则]

- 思路: 如果发现一个类, 所有的组成, 都是抽象方法
     - 没有成员变量
- 这种类, 我们通常会设计为Java中的接口, 因为现在这个类存在的唯一价值, 就只是声明规则了
###  接口的定义格式:**interface 接口名 {}**

注意: 接口不允许实例化

例：

```java
interface inter{
    public abstract void show();
    public abstract void methed();
}
```

接口和类之间是实现关系, 通过implements关键字来完成

class 类名 implements 接口名 {}

实现类(接口的子类):

1. 重写所有抽象方法

例：

```java
class inter1 implements inter{

    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void methed() {
        System.out.println("method...");
    }
}
```

2.将实现类变成抽象类

```java
abstract class inter2 implements inter{
    
}
```

### 接口的成员特点 :

1. 成员变量 : 只能定义常量, 因为系统会默认加入三个关键字
                 public static final
             
                这三个关键字没有顺序关系
             
2. 成员方法 : 只能是抽象方法, 因为系统会默认加入两个关键字
          public abstract

3. 构造方法 : 没有

### 接口和类之间的各种关系 :

1. 类和类之间 : 继承关系, 只支持单继承, 不支持多继承, 但是可以多层继承
2. 类和接口之间 : 实现关系, 可以单实现, 也可以多实现, 甚至可以在继承一个类的同时, 实现多个接口
3. 接口和接口之间 : 继承关系, 可以单继承, 也可以多继承

### 抽象类和接口的对比

- 成员变量 :

​		抽象类 : 可以定义变量, 也可以定义常量

​		接口 : 只能定义常量 

- 成员方法

​		抽象类 : 可以是定义具体方法, 也可以定义抽象方法

​		接口 : 只能定义抽象方法

- 构造方法

​	抽象类 : 有

​	接口 : 没有

#### 抽象类 : 对事物做抽象 (描述事物)

#### 接口 : 对行为抽象 (制定规则)

## 多态

## 多态介绍：
同一个行为具有多个不同表现形式或形态的能力

##### 多态前提：

- 有继承 / 实现关系
- 有方法重写
- 有父类引用指向子类对象

##### 1. 对象多态

​                 好处: 方法的形参定义为父类类型, 这个方法就可以接收到该父类的任意子类对象了

##### 2. 行为多态
​                好处: 同一个方法, 具有多种不同表现形式, 或形态的能力

- 多态的成员访问特点:

 1. 成员变量 : 编译看左边(父类), 运行看左边(父类)
 2. 成员方法 : 编译看左边(父类), 运行看右边(子类)

- 在编译的时候, 会检查父类中有没有这个方法
          没有 : 编译出错
          有 : 编译通过, 但是运行的时候, 一定会执行子类的方法逻辑

- 原因: 担心你调用的方法, 在父类中是一个抽象方法

 多态创建对象, 调用静态成员 :

 静态的成员, 推荐类名进行调用
                    细节: 静态的成员, 可以使用对象名调用, 但这是一种假象

​					生成字节码文件后, 会自动将对象名调用, 改成类名调用

#### 多态的好处和弊端

多态的好处 ：提高了程序的扩展性

对象多态 : 将方法的形参定义为父类类型, 这个方法可以接收该父类的任意子类对象 

行为多态 : 同一个行为, 具有多个不同表现形式或形态的能力

```java
public static void main(String[] args) {
   *useAnimal*(new Dog());
   *useAnimal*(new Cat());

 }

 public static void useAnimal(Animal a) {    // Animal a = new Dog();
    a.eat();                				 // Animal a = new Cat();
 }
```

- 多态的好处：提高了程序的扩展性

- 多态的弊端：不能使用子类的特有成员

#### 多态中的转型

- 向上转型

 	   从子到父（父类引用指向子类对象）

- 向下转型

  	  从父到子（将父类引用所指向的对象, 转交给子类类型）

#### 多态中的转型问题

- 概述：如果被转的引用类型变量，对应的实际类型和目标类型不是同一种类型，那么在转换的时候就会出现ClassCastException 

- 关键字 instanceof

- 使用格式：

​		对象名 instanceof 类型

​		判断一个对象是否是一个类的实例

​		通俗的理解：判断关键字左边的对象，是否是右边的类型，返回boolean类型结果