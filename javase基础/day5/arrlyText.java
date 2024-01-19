package itheima.day5;

public class arrlyText {
    public static void main(String[] args) {
        int[] arr = {100,50,20,90,90};
        int max = getMax(arr);
        System.out.println("这个班级的最大值为"+max);
        int min= getMin(arr);
        System.out.println("这个班级的最小值为"+min);
        int sum =getSum(arr);
        System.out.println("这个班级的总成绩为"+sum);
        double count = getCount(arr);
        System.out.println("这个班级的平均成绩为"+count);
        int piint = getPrint(arr);
        System.out.println("这个班级低于平均数的个数为"+piint);

    } /*
        需求:
           已知班级学生成绩为
           int[] arr = {100,50,20,90,90};
           1. 找出数组最大值, 并打印在控制台
           2. 找出数组最小值, 并打印在控制台
           3. 求总成绩, 并打印在控制台
           4. 计算出平均值, 并打印在控制台
           5. 统计出低于平均值元素的个数
     */
    //最大值
    public static int getMax(int arr[]){
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max>arr[i]){
                max =arr[i];
            }
        }return max;
    }
    //最小值
    public static int getMin(int arr[]){
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min<arr[i]){
                min =arr[i];
            }
        }
        return min;
    }
    //总和
    public static int getSum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

        }
        return sum;
    }
    //平均值
    public static double getCount(int arr[]){
        int sum =getSum(arr);
        double count = (sum*1.0)/arr.length;
        return count;
    }
    //低于平均值的个数
    public static int getPrint(int arr[]){
        double piint = getCount(arr);
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(piint>arr[i]){
                sum++;
            }
        }
        return sum;

    }
}

