package itheima.day6;



import java.util.Random;


public class text7 {
    /*
        需求: 请从26个英文字母（大小写都包含），以及数字0-9中，随机产生一个5位的字符串验证码并打印在控制台
        效果: uYq8I，3r4Zj

        注意事项: 打印字符类型数组名, 不会看到地址值, 而是元素的内容
     */
    public static void main(String[] args) {
        char[] chs = getChars();

        String indexDome = getString(chs);
        System.out.println("产生的验证码为"+indexDome);
        }

    private static String getString(char[] chs) {
        Random r = new Random();
        String indexDome = "";
        for (int i = 0; i < 5; i++) {
            int getindex = r.nextInt(chs.length);
            indexDome += chs[getindex];

        }
        return indexDome;
    }

    private static char[] getChars() {
        char[] chs = new char[26 + 26 + 10];
        int indxt = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            chs[indxt] = c;
            indxt++;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            chs[indxt] = c;
            indxt++;
        }
        for (char c = '0'; c <= '9'; c++) {
            chs[indxt] = c;
            indxt++;}
        return chs;
    }

}