# 时间API

**本博客将针对jdk8版本之前和之后的分别介绍**

## JDK8(-) 时间API

### Date类

- 代表的是日期和时间

| 构造器                 | 说明                                             |
| ---------------------- | ------------------------------------------------ |
| public Date()          | 创建一个Date对象，代表的是系统当前此刻日期时间。 |
| public Date(long time) | 把时间毫秒值转换成Date日期对象。                 |

| 常见方法                       | 说明                                              |
| ------------------------------ | ------------------------------------------------- |
| public long getTime()          | 返回从1970年1月1日   00:00:00走到此刻的总的毫秒数 |
| public void setTime(long time) | 设置日期对象的时间为当前时间毫秒值对应的时间      |

```java
public class DateDemo1 {
    /*
        Date类 : 表示时间的类

        1. 构造方法 :

            public Date() : 将当前时间, 封装为Date日期对象
            public Date(long time) : 把时间毫秒值转换成Date日期对象

        2. 常见方法 :

            public long getTime() : 返回从1970年1月1日 00:00:00走到此刻的总的毫秒数
            public void setTime(long time) : 设置日期对象的时间为当前时间毫秒值对应的时间

     */
    public static void main(String[] args) {
        // 将当前时间, 封装为Date日期对象
        Date d1 = new Date();
        System.out.println(d1);

        // 把时间毫秒值转换成Date日期对象
        Date d2 = new Date(1000L);
        System.out.println(d2);

        System.out.println(d1.getTime());
        System.out.println(d2.getTime());

        System.out.println("----------------------");

        Date d3 = new Date();
        d3.setTime(0L);
        System.out.println(d3);
    }
}

```

### SimpleDateFormat

- 用于日期格式化

| 构造器                                  | 说明                                     |
| --------------------------------------- | ---------------------------------------- |
| public  SimpleDateFormat()              | 构造一个SimpleDateFormat，使用默认格式   |
| public SimpleDateFormat(String pattern) | 构造一个SimpleDateFormat，使用指定的格式 |

| 格式化方法                                 | 说明                          |
| ------------------------------------------ | ----------------------------- |
| public final String **format(Date date)**  | 将日期格式化成日期/时间字符串 |
| public final Date **parse(String source)** | 将字符串解析为日期类型        |

```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    /*
        SimpleDateFormat类 : 用于日期格式化

        1. 构造方法 :

                public SimpleDateFormat() : 创建一个日期格式化对象, 使用 [默认模式]
                public SimpleDateFormat(String pattern) : 创建一个日期格式化对象, [手动指定模式]

        2. 常用方法 :

                public final String format(Date date) : 将日期对象, 转换为字符串
                public public final Date parse(String source) : 将日期字符串, 解析为日期对象

     */
    public static void main(String[] args) throws ParseException {

        String today = "2023年2月4日";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = simpleDateFormat.parse(today);

        System.out.println(date);

    }

    private static void method() {
        // 创建一个日期格式化对象, 使用 [默认模式]
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        // 创建一个日期格式化对象, [手动指定模式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        // 创建Date对象, 封装此刻的时间
        Date date = new Date();

        // 将日期对象, 转换为字符串
        String result = simpleDateFormat.format(date);

        System.out.println(result);
    }
}

```

- 针对上面两个时间api，通过下面案例进行巩固

```java
public class DateTest1 {
    /*
        需求: 计算你来到了这个世界多少天

        分析:
                1. 键盘录入用户的生日 (日期字符串)
                2. 创建SimpleDateFormat对象, 指定模式, 用于将日期字符串解析为Date日期对象 (birthdayDate)
                3. 创建Date日期对象, 封装此刻的时间 (todayDate)
                4. long time = todayDate.getTime() - birthdayDate.getTime();
                5. 将毫秒值, 转换为天的单位

                        time / 1000 / 60 / 60 / 24;
     */
    public static void main(String[] args) throws ParseException {
       //1. 键盘录入用户的生日 (日期字符串)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日");
        String birthday = sc.nextLine();
        //2. 创建SimpleDateFormat对象, 指定模式, 用于将日期字符串解析为Date日期对象 (birthdayDate)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthdayDate = simpleDateFormat.parse(birthday);
        //3. 创建Date日期对象, 封装此刻的时间 (todayDate)
        Date today = new Date();
        //4.计算时间差
        long time = today.getTime()-birthdayDate.getTime();
        //5. 将毫秒值, 转换为天的单位
        System.out.println(time/1000/60/60/24);
    }
}
```

### Calendar

- 代表的是系统此刻时间对应的日历，通过它可以单独获取、修改时间中的年、月、日、时、分、秒等。

#### **Calendar** **类使用**

- 创建对象 : Calendar是一个抽象类，不能直接创建对象

| 方法名                                | 说明                   |
| ------------------------------------- | ---------------------- |
| public  static Calendar getInstance() | 获取当前时间的日历对象 |

| 方法名                                | 说明                        |
| ------------------------------------- | --------------------------- |
| public int get(int field)             | 取日历中的某个字段信息      |
| public void set(int field,int value)  | 修改日历的某个字段信息      |
| public void add(int field,int amount) | 为某个字段增加/减少指定的值 |

示例代码如下：

```java
package javase_progressive.day7.jdk7.calendar;

import java.util.Calendar;

public class CalendarDemo {
    /*
        Calendar : 代表的是系统此刻时间对应的日历，通过它可以单独获取、修改时间中的年、月、日、时、分、秒等。

        1. 创建对象 :
                public static Calendar getInstance() : 获取当前时间的日历对象
        2. 常用方法 :
                public int get(int field) : 取日历中的某个字段信息

                               get方法的参数 : Calendar类中的静态常量

                                    Calendar.YEAR : 获取年份信息
                                    Calendar.MONTH : 月份是0~11, 记得做+1操作
                                    Calendar.DAY_OF_MONTH : 获取日
                                    Calendar.DAY_OF_WEEK : 获取星期, 获取星期的时候, 需要提前设计一个数组
                                    Calendar.DAY_OF_YEAR : 获取一年中的第几天


                public void set(int field,int value) : 修改日历的某个字段信息
                public void add(int field,int amount) : 为某个字段增加/减少指定的值
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, -1);

        System.out.println(c.get(Calendar.YEAR));

    }

    private static void setMethod() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 2022);
        c.set(2008,8,8);

        System.out.println(c.get(Calendar.YEAR));
    }

    private static void getMethod() {
        // Calendar c : 抽象类
        // Calendar.getInstance() : 获取的是子类对象
        // 1. 获取当前时间的日历对象
        Calendar c = Calendar.getInstance();

        // 2. 调用get方法, 获取指定字段的信息
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 注意Calendar类的月份是 0~11, 想要获取常规的月份, 需要对结果 + 1操作
        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);

        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);


        char[] weeks = {' ', '日', '一', '二', '三', '四', '五', '六'};
        //  0     1     2    3     4     5    6    7

        int weekIndex = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(weeks[weekIndex]);

        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
    }
}
```

增对calendar方法，可以通过以下两个案例进行练习：

案例1：

```java
public class CalendarTest1 {
    /*
        需求 : 使用程序判断出 2050年3月1日 是否是疯狂星期四
     */
    public static void main(String[] args) {

        // 1. 获取日期对象 (此刻的时间)
        Calendar c = Calendar.getInstance();

        // 2. 调用set方法, 将时间设置为 2050年3月1日
        c.set(2050, 2, 1);

        public class CalendarTest1 {
    /*
        需求 : 使用程序判断出 2050年3月1日 是否是疯狂星期四
     */
    public static void main(String[] args) {

        // 1. 获取日期对象 (此刻的时间)
        Calendar c = Calendar.getInstance();

        // 2. 调用set方法, 将时间设置为 2050年3月1日
        c.set(2050, 2, 1);

        char[] weeks = {' ', '日', '一', '二', '三', '四', '五', '六'};

        // 3. 获取星期
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);

        if(weeks[weekIndex] == '四'){
            System.out.println("今天是疯狂星期四, 我要奢侈一把~");
        } else {
            System.out.println("今天不是疯狂星期四, 吃不起KFC");
        }

    }
}


        // 3. 获取星期
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);

        if(weeks[weekIndex] == '四'){
            System.out.println("今天是疯狂星期四, 我要奢侈一把~");
        } else {
            System.out.println("今天不是疯狂星期四, 吃不起KFC");
        }

    }
}

```

案例二：

```java
public class CalendarTest2 {
    /*
        需求 : 键盘录入一个日期字符串,  程序输出这个日期是一年中的第多少天

                1. 使用SimpleDateFormat,  将日期字符串转换为日期对象
                2. 将日期对象, 转换为Calendar对象
                3. 调用get方法, 获取一年中的第几天
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String dateContent = sc.nextLine();

        // 1. 使用SimpleDateFormat,  将日期字符串转换为日期对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = dateFormat.parse(dateContent);

        // 2. 将日期对象, 转换为Calendar对象
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        // 3. 调用get方法, 获取一年中的第几天
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);

        System.out.println("是这一年中的第:" + dayOfYear + "天");

    }
}
```

### JDk8之前和JDK8之后的时间API对比

| JDK8之前传统的时间API                           | **JDK8开始之后**新增的时间API                                |
| ----------------------------------------------- | ------------------------------------------------------------ |
| 1、设计欠妥，使用不方便，很多都被淘汰了。       | 1、设计更合理，功能丰富，使用更方便。                        |
| 2、都是可变对象，修改后会丢失最开始的时间信息。 | 2、都是不可变对象，修改后会返回新的时间对象，不会丢失最开始的时间。 |
| 3、线程不安全。                                 | 3、线程安全。                                                |
| 4、只能精确到毫秒。                             | 4、能精确到毫秒、纳秒。                                      |





## JDK8(+) 时间API

- 日历类

**LocalDate：代表本地日期(年、月、日、星期)**

**LocalTime：代表本地时间(时、分、秒、纳秒)**

**LocalDateTime：代表本地日期、时间(年、月、日、星期、时、分、秒、纳秒)**

获取对象：

| 方法名                                                  | 示例                                                         |
| ------------------------------------------------------- | ------------------------------------------------------------ |
| public  static Xxxx now(): 获取系统当前时间对应的该对象 | LocaDate ld = LocalDate.now();     LocalTime lt = LocalTime.now();     LocalDateTime ldt = LocalDateTime.now(); |
| public static Xxxx of(…)：获取指定时间的对象            | LocalDate localDate1 = LocalDate.of(2099 , 11,11);<br/> LocalTime localTime1 = LocalTime.of(9, 8, 59);<br/> LocalDateTime localDateTime1 = LocalDateTime.of(2025, 11, 16, 14, 30, 01); |

**获取年月日时分秒相关的方法**

| 方法名                   | 功能                             |
| ------------------------ | -------------------------------- |
| int getYear()            | 获取年份字段                     |
| Month getMonth()         | 使用 Month 枚举获取年份字段      |
| int getMonthValue()      | 获取1到12之间的月份字段          |
| int getDayOfMonth()      | 获取日期字段                     |
| DayOfWeek getDayOfWeek() | 获取星期几字段，即枚举 DayOfWeek |
| int getHour()            | 获取当日时间字段                 |
| int getMinute()          | 获取分钟字段                     |
| int getSecond()          | 获取第二分钟字段                 |

**修改年月日时分秒相关的方法**

- LocalDateTime 、LocalDate 、LocalTime 都是不可变的, 下列方法返回的是一个新的对象

| **方法名**                                         | **说明**                                |
| -------------------------------------------------- | --------------------------------------- |
| withHour、withMinute、withSecond、withNano         | 修改时间，返回新时间对象                |
| plusHours、plusMinutes、plusSeconds、plusNanos     | 把某个信息加多少，返回新时间对象        |
| minusHours、minusMinutes、minusSeconds、minusNanos | 把某个信息减多少，返回新时间对象        |
| equals isBefore isAfter                            | 判断2个时间对象，是否相等，在前还是在后 |

**LocalDateTime转LocalDate和Local Time**

| 方法名                         | 说明                    |
| ------------------------------ | ----------------------- |
| public LocalDate toLocalDate() | 转换成一个LocalDate对象 |
| public LocalTime toLocalTime() | 转换成一个LocalTime对象 |

- 日期格式化类

DateTimeFormatter ：

用于时间的格式化和解析

**DateTimeFormatter 类**：

- 用于时间的格式化和解析

| 方法名                                       | 说明               |
| -------------------------------------------- | ------------------ |
| static DateTimeFormatter **ofPattern**(格式) | 获取格式对象       |
| String **format**(时间对象)                  | 按照指定方式格式化 |

- 时间类

Instant ：时间戳/时间线

ZoneId : 时区

ZonedDateTime : 带时区的时间

**Instant时间戳**

- 用于表示时间的对象,  类似之前所学习的 Date

```java
Instant instant = Instant.now();
System.out.println("当前时间戳是：" + instant);

```

**ZoneId类：**

| 方法名                                   | 说明                     |
| ---------------------------------------- | ------------------------ |
| static Set<String> getAvailableZoneIds() | 获取Java中支持的所有时区 |
| static ZoneId systemDefault()            | 获取系统默认时区         |
| static ZoneId of(String zoneId)          | 获取一个指定时区         |

**Instant时间戳：**

- 用于表示时间的对象,  类似之前所学习的 Date

| 方法名                                      | 说明                                  |
| ------------------------------------------- | ------------------------------------- |
| static Instant **now**()                    | 获取当前时间的Instant对象（标准时间） |
| static Instant **ofXxxx**(long epochMilli)  | 根据（秒/毫秒/纳秒）获取Instant对象   |
| ZonedDateTime **atZone**(ZoneId  zone)      | 指定时区                              |
| boolean **isXxx**(Instant otherInstant)     | 判断系列的方法                        |
| Instant **minusXxx**(long millisToSubtract) | 减少时间系列的方法                    |
| Instant **plusXxx**(long millisToSubtract)  | 增加时间系列的方法                    |

**ZoneDataTime带时区的时间对象：**

| 方法名                               | 说明                            |
| ------------------------------------ | ------------------------------- |
| static ZonedDateTime **now**()       | 获取当前时间的ZonedDateTime对象 |
| static ZonedDateTime **ofXxxx**(...) | 获取指定时间的ZonedDateTime对象 |
| ZonedDateTime **withXxx**(时间)      | 修改时间系列的方法              |
| ZonedDateTime **minusXxx**(时间)     | 减少时间系列的方法              |
| ZonedDateTime **plusXxx**(时间)      | 增加时间系列的方法              |



- 工具类

Period :用于计算两个“时间”间隔（秒，纳秒） 

Duration : 用于计算两个“日期”间隔（年、月、日）

ChronoUnit : 用于计算两个“日期”间隔

