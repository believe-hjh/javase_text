package day2.polymorphism;

public class PolymorphismTest1 {
    /*
        多态的前提 :
                    有继承 / 实现关系
                    有方法重写
                    有父类引用指向子类对象

        1. 对象多态
                    Animal a1 = new Dog();
                    Animal a2 = new Cat();

                    好处: 方法的形参定义为父类类型, 这个方法就可以接收到该父类的任意子类对象了

        2. 行为多态
                    好处: 同一个方法, 具有多种不同表现形式, 或形态的能力
     */
    public static void main(String[] args) {
       useAnimal(new Cat());
    }
    public static void useAnimal(Animal a){
        a.eat();
    }

}
abstract class Animal {
    public abstract void eat();
}
class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

