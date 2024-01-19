package itheima.day8.method;

public class StringMethodDome3 {
    /*
       String类的截取方法 :

           public String substring(int beginIndex) :  根据传入的索引开始做截取, 截取到字符串的末尾
           public String substring(int beginIndex, int endIndex) :  根据传入的开始和结束索引, 对字符串做截取
                                                                       - 包含头, 不包含尾

           注意: 截取出来的内容, 是作为新的字符串返回, 别忘记找变量接收
    */
    public static void main(String[] args) {
    String S = "itheima";
        String substring = S.substring(2);
        String substring1 = S.substring(0, 1);
        System.out.println(substring);
        System.out.println(substring1);
    }
}
