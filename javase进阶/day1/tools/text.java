package tools;

public class text {
    public static void main(String[] args) {
        int []arr = {11,22,33};
        ArrayTools s1 = new ArrayTools();
        System.out.println(ArrayTools.Max(arr));
        System.out.println(ArrayTools.Min(arr));
        ArrayTools.printArray(arr);
        System.exit(0);
    }
}
