package itheima.day8.StringBuilder;

public class StringDome3 {
      /*
        StringBuilder常用成员方法 :

            1. public StringBuilder append(任意类型) : 添加数据, 并返回对象自己

            2. public StringBuilder reverse() : 将缓冲区中的内容, 进行反转

            3. public int length() : 返回长度

            4. public String toString() : 将缓冲区的内容, 以String字符串类型返回
     */
      public static void main(String[] args) {
          StringBuilder sb = new StringBuilder();
          sb.append("vim");
          System.out.println(sb);
          sb.reverse();
          System.out.println(sb);
          sb.length();
          System.out.println(sb);
          sb.toString();
          System.out.println(sb);
      }
}
