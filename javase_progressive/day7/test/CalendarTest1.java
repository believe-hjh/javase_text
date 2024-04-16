package javase_progressive.day7.test;

import java.util.Calendar;

public class CalendarTest1 {
    /*
        需求 : 使用程序判断出 2050年3月1日 是否是疯狂星期四
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2050,3,1);
        char[] weeks = {' ', '日', '一', '二', '三', '四', '五', '六'};
        int i = c.get(Calendar.DAY_OF_WEEK);
        if(weeks[i]=='四'){
            System.out.println("今天是疯狂星期四");
        }
        else {
            System.out.println("今天不是疯狂星期四");
        }
    }

}
