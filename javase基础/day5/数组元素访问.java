package itheima.day5;

public class 数组元素访问 {
    public static void main(String[] args) {
        arrText();
        System.out.println("----------------------------------------");
        arrText2();
    }
    public static void arrText(){
        int arrly[] ={11,22,33,44,55,77,8,8,89};
        for (int i = 0; i < arrly.length; i++) {
            System.out.println(arrly[i]);
        }
    }
    public static void arrText2(){
        int arrly[]={11,22,33,44,55,77,8,8,89};
        int sum = 0;
        for (int i = 0; i < arrly.length; i++) {
            if(arrly[i]%2==0){
                sum +=arrly[i];
            }
        }
        System.out.println("偶数和为"+sum);
    }
}
