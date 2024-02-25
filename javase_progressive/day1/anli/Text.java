package anli;

public class Text {
    public static void main(String[] args) {
        Coder c = new Coder("张三",23,16000);
        c.work();
        Manager m= new Manager("李四",24,16000,23333);
        m.work();
    }
}
