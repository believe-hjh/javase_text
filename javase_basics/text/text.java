package text;

import text.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----欢迎使用学生管理系统----------");
        ArrayList<Student> list = new ArrayList<>();
        Student sut1  = new Student("11",12,"张三","2002-02-12");
        list.add(sut1);
        while (true) {
            System.out.println("请选择你要进行的操作");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            int chine = sc.nextInt();
            switch (chine){
                case 1:
                    addStudent(list);
                    break;
                case 2:
                    deleteStudent(list);
                    break;
                case 3:
                   updata(list);
                    break;
                case 4:
                    queryStudentInfos(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;

            }
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        String id = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学生的id");
        while (true){ id =sc.next();
        int index = getIndex(id,list);
        if(index==-1){
            break;
        }else{
            System.out.println("该学号已经存在，请重新输入");
        }}
        System.out.println("请输入要添加学生的姓名");
        String name = sc.next();
        System.out.println("请输入要添加学生的年龄");
        int age = sc.nextInt();
        System.out.println("请输入要添加学生的生日");
        String data = sc.next();
        Student stu = new Student(id,age,name,data);
        list.add(stu);

    }

    //此方法用于修改学生
    private static void updata(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学号");
        String index = sc.nextLine();
        int index1 = getIndex(index, list);
        if(index1==-1){
            System.out.println("查无此人");
        }else {
            System.out.println("请输入您的年龄");
            int age = sc.nextInt();
            System.out.println("请输入新的姓名");
            String name = sc.next();
            System.out.println("请输入新的生日");
            String data = sc.next();
            Student stu = new Student(index,age,name,data);
            list.set(index1,stu);
            System.out.println("修改成功");

        }
    }
    //此方法用于删除学生
    private static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除学生的学号");
        String id = sc.nextLine();
        int index = getIndex(id, list);
        if (index==-1){
            System.out.println("您要找的学生信息不存在，请重新输入");
        }
        else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    //此方法用于添加学生
    private static void queryStudentInfos(ArrayList<Student> list) {
        if(list.size()==0){
            System.out.println("没有学生信息，请先添加学生信息");
        }else{
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId()+"---"+stu.getName()+"---"+stu.getAge()+"---"+stu.getBirthday());


            }
        }
    }
    //此方法根据学生学号，去集合中找到对应学生索引
    private static int getIndex(String id, ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if(student.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
