package javase_progressive.day8.recursion;

public class RecursionDemo3 {
    public static void main(String[] args) {

        int result = get(20);
        System.out.println(result);

    }

    private static int get(int i) {
        if(i==1||i==2){
            return 1;
        }
        else {
            return get(i-2)+get(i-1);
        }
    }


}
