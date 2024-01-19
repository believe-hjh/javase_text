package itheima.day5;

public class 数组遍历练习 {
    public static void main(String[] args) {
        int arrly []= {11,22,44,33,55};
        int arrly2[]={33,77,99,66,23};
        int max=arrlyText(arrly2);
        System.out.println(max);
    }
    public static int arrlyText(int arrly[]){

        int max =arrly[0];
        for (int i = 1; i < arrly.length; i++) {
            if(max<arrly[i]){
                max =arrly[i];
            }
        }
        return max;

    }

}
