package itheima.day6;

public class text3 {
    public static void main(String[] args) {
        int arr1[]={11,22,33};
        int arr2[]={11,22,22,};
        boolean a=arrcount(arr1,arr2);
        System.out.println(a);
    }
     /*
        需求: 定义一个方法, 比较两个数组的内容是否相同
        要求: 长度, 内容, 顺序完全相同
     */
     public static boolean arrcount(int arr1[],int arr2[]) {
         if(arr1.length!=arr2.length){
             return false;
         }
         for (int i = 0; i < arr1.length; i++) {
             if(arr1[i]!=arr2[i]){
                 return false;
             }
         }
         return true;
     }
}
