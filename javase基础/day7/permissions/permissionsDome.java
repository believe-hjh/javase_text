package itheima.day7.permissions;

public class permissionsDome {
     /*
        权限修饰符 :

                private : 同一个类中
                (default) : 同一个类中, 同一个包中
                protected : 同一个类中, 同一个包中, 不同包的子类
                                TODO: 继承
                public : 任意位置访问
     */
     public static void main(String[] args) {
         student vc =new student();
         vc.sa(23);
         int age = vc.getAge();
         System.out.println(age);
     }
}
