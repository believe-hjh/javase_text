package day3.lambda.test;

public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("重写后的方法");
            }
        });
        System.out.println("--------------------");
        useShowHandler(()->{
            System.out.println("lambda表达式子");
        });
    }

    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }

}

interface ShowHandler {
    void show();
}