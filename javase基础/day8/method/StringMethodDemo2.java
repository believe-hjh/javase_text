package itheima.day8.method;

public class StringMethodDemo2 {
    /*
        String类用于遍历的方法:

            public char[] toCharArray() 将此字符串转换为一个新的字符数组

            public char charAt(int index) 返回指定索引处的 char 值

            public int length() 返回此字符串的长度
     */
    public static void main(String[] args) {
        String b = "itheima";
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            System.out.println(c);
        }
    }

    private static void print1() {
        String a = "itheima";
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
