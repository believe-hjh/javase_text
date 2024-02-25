package itheima.day4;

public class count案例 {
    public static void main(String[] args) {
        countDome();

    }
    public static void countDome(){
        for(int i=1;i<99;i++){
            if (i==3||i==5||i==9){
                continue;}
            System.out.println("第"+i+"名顾客进入餐厅");


        }
    }
}
