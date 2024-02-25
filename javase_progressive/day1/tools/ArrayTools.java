package tools;

public  class ArrayTools {
    public static int Max(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int Min(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void printArray(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+",");

        }
        System.out.print(arr[arr.length-1]+"]");
    }
}
