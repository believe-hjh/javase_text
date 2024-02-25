package itheima.day7;

public class phoneText {
    public static void main(String[] args) {
        phone p1 =new phone();
        p1.brand ="小米";
        p1.color = "白色";
        p1.prine =4999;
        p1.call("张三");
        p1.sendMessage();
        phone p2 =new phone();
        p2.brand = "华为";
        p2.color = "黑色";
        p2.prine =6999;
        p2.call("李四");
        p2.sendMessage();
    }
}
