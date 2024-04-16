package javase_progressive.day8.domain;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        student.setName(name);
        System.out.println("请输入年龄");
        int i = 0;

        while (true){
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请输入整数年龄");
            }
        }
        student.setAge(i);
        System.out.println(student);
    }
}
