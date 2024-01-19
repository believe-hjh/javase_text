package itheima.day5;

public class 数组内存图_1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);        // 100
        int newText =change(number);
        System.out.println("调用change方法后:" + newText);        // 100
    }

    public static int change(int number) {
        number = 200;
        return number;
    }
}
