package itheima.day6;

public class text4_2 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50, 19, 19};
        int[] target = {19}; // 修改为需要查找的目标元素数组
        int[] a = getArr(19, arr);
        if (a.length == 0) {
            System.out.println("对不起，你查找的索引不存在");
        } else {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }

    /**
     * 设计一个方法，查找元素在数组中的索引位置（考虑重复元素问题）
     * @param sum 需要查找的目标元素
     * @param arr 目标元素所在的数组
     * @return 返回目标元素在数组中的索引位置数组
     */
    public static int[] getArr(int sum, int[] arr) {
        int countOfSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                countOfSum++;
            }
        }
        int[] indicesOfSum = new int[countOfSum];
        int currentIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                indicesOfSum[currentIndex++] = i;
            }
        }
        return indicesOfSum;
    }
}
