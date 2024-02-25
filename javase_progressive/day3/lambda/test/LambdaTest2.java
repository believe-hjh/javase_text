package day3.lambda.test;

public class LambdaTest2 {
    public static void main(String[] args) {
    useStringHandler(new StringHandler() {
        @Override
        public void printMessage(String msg) {
            System.out.println("省略式写法");
        }
    });
        System.out.println("---------------------");
        useStringHandler((msg)->{System.out.println("lambda表达式写法");
        });
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("itheima");
    }
}

interface StringHandler {
    void printMessage(String msg);
}
