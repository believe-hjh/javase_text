package itheima.day6;

public class 逢七必过 {
    public static void main(String[] args) {
        int [] arr =  {68,27,95,88,171,996,51,210};
        int a=d2(arr);
        System.out.println(a);

    }
    public static void d1(){
        for(int i=1;i<=100;i++){
            int ge =i/10%10;
            int shi =i%10;
            if (ge==70||shi==7||i%7==0){
                System.out.println("过");
            }
            else{
                System.out.println(i);
            }
        }
    }
    /*
        需求 :
                有这样的一个数组，元素是 {68,27,95,88,171,996,51,210}
                求出该数组中满足要求的元素和
                要求是：求和的元素个位和十位都不能是7，并且只能是偶数
     */
    public static int d2(int arr[]){
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            int ge =arr[i]%10;
            int shi =arr[i]/10%10;
            if(ge!=7&&shi!=7&&arr[i]%2==0){
                sum+=arr[i];
            }
        }
      return sum;
    }
}
