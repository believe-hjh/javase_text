# 常用API和基础算法

## Arrays 工具类

### Arrays 工具类介绍：

- 数组操作工具类，专门用于操作数组元素

| 方法名                                                       | 说明                                |
| ------------------------------------------------------------ | ----------------------------------- |
| public static [String](mk:@MSITStore:C:\course\API文档\jdk-9_google.CHM::/java/lang/String.html) toString(类型[] a) | 将数组元素拼接为带有格式的字符串    |
| public  static boolean equals(类型[] a,  类型[] b)           | 比较两个数组内容是否相同            |
| public  static int binarySearch(int[] a,  int key)           | 查找元素在数组中的索引 (二分查找法) |
| public  static void sort(类型[] a)                           | 对数组进行默认升序排序              |

```java
public class ArraysDemo {
    /*
        Arrays类常用方法 :
        -------------------------------------------------------------------------------------------
        public static String toString (类型[] a) : 将数组元素拼接为带有格式的字符串
        public static boolean equals (类型[] a, 类型[] b) : 比较两个数组内容是否相同
        public static int binarySearch (int[] a, int key) : 查找元素在数组中的索引 (二分查找法: 保证数组的元素是排好序的)
                                                                - 如果查找的元素, 在数组中不存在: 返回 (-(插入点) - 1)
        public static void sort (类型[] a) : 对数组进行默认升序排序
                    TODO: 后面学完了红黑树, 回头对这个方法做补充
        -------------------------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 66};

        // 将数组元素拼接为带有格式的字符串
        System.out.println(Arrays.toString(arr1));
        // 比较两个数组内容是否相同
        System.out.println(Arrays.equals(arr1, arr2));

        // 查找元素在数组中的索引
        System.out.println(Arrays.binarySearch(arr1, 33));
        System.out.println(Arrays.binarySearch(arr1, 66));

        int[] nums = {22, 11, 55, 44, 33};
        System.out.println(Arrays.binarySearch(nums, 11));      // 1

        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, 11));      // 0

        // 对数组进行默认升序排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
```

## 冒泡排序

### 冒泡排序介绍：

- 相邻的两个数进行比较,  如果第一个比第二个大, 就交换他们两个

```java
public class BubbleSort {
    /*
        冒泡排序: 相邻的两个数进行比较,  如果第一个比第二个大, 就交换他们两个

        第一轮 : arr[0]-arr[1]  arr[1]-arr[2] arr[2]-arr[3]  arr[3]-arr[4]  比较4次
        第二轮 : arr[0]-arr[1]  arr[1]-arr[2] arr[2]-arr[3]  比较3次
        第三轮 : arr[0]-arr[1]  arr[1]-arr[2] 比较2次
        第四轮 : arr[0]-arr[1]  比较1次
     */
    public static void main(String[] args) {
        int[] arr = {22, 55, 44, 33, 11};

        // 外循环: 比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环: 比较的次数
            // -1: 避免索引越界
            // -i: 提升效率
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
```

## 选择排序

- 从 0 索引开始，拿着每一个索引上的元素跟后面的元素依次比较

```java
public class SelectSort {
    /*
        选择排序: 从 0 索引开始，拿着每一个索引上的元素跟后面的元素依次比较

        第一轮 : arr[0]-arr[1]  arr[0]-arr[2] arr[0]-arr[3] arr[0]-arr[4]
        第二轮 : arr[1]-arr[2]  arr[1]-arr[3] arr[1]-arr[4]
        第三轮 : arr[2]-arr[3]  arr[2]-arr[4]
        第四轮 : arr[3]-arr[4]
     */
    public static void main(String[] args) {
        int[] arr = {22, 11, 44, 33, 55};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
```

## 二分查找 

```java
public class BinarySearch {
    /*
        二分查找 (折半查找) :

            前提: 数组元素必须是排好序的

            思路:
                    1. 定义两个变量记录最小索引, 和最大索引
                    2. 折半的动作不止一次, 应该使用循环
                            条件 while(min <= max)
                    3. 循环中计算出中间索引
                    4. 加入判断
                        元素如果大于中间元素 : min = mid + 1;
                        元素如果小于中间元素 : max = mid – 1;
                        元素如果等于中间元素 : 将索引返回 (mid)

     */
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        int index = binarySearch(arr, 100);

        System.out.println(index);

    }

    private static int binarySearch(int[] arr, int num) {
        // 1. 定义两个变量记录最小索引, 和最大索引
        int min = 0;
        int max = arr.length - 1;
        int mid;

        // 2. 折半的动作不止一次, 应该使用循环
        while (min <= max) {
            // 3. 计算中间索引
            mid = (min + max) / 2;
            // 4. 比对
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        // 5. 没找到, 返回-1
        return -1;
    }

}
```

## 正则表达式

### 正则表达式介绍：

本质来说就是一个字符串, 可以指定一些规则, 来校验其他字符串.

### **字符类(默认匹配一个字符)**

- [abc]     只能是a, b, 或c

- [^abc]     除了a, b, c之外的任何字符

- [a-zA-Z]        a到z A到Z，包括（范围）

- [a-d[m-p]]     a到d，或m通过p：（[a-dm-p]联合）

- [a-z&&[def]]     d, e, 或f(交集)

- [a-z&&[^bc]]     a到z，除了b和c：（[ad-z]减法）

- [a-z&&[^m-p]]   a到z，除了m到p：（[a-lq-z]减法）

### **预定义的字符类(默认匹配一个字符)**

- . 任何字符

- \d 一个数字： [0-9]

- \D 非数字： [^0-9]

- \s 一个空白字符： [ \t\n\x0B\f\r]

- \S 非空白字符： [^\s]

- \w [a-zA-Z_0-9] 英文、数字、下划线

- \W  [^\w] 一个非单词字符

### **贪婪的量词（配合匹配多个字符）**

- X? X , 一次或根本不

- X* X，零次或多次 (任意次数)

- X+ X , 一次或多次

- X {n} X，正好n次

- X {n, } X，至少n次

- X {n,m} X，至少n但不超过m次

### 编写规则

**String telRegex = "编写规则";**

**"需要做校验的字符串".matches(telRegex))**

```java
public class RegexTest {
    /*
        1. QQ号正则
                不能以0开头
                全部都是数字
                5~12位
        2. 手机号正则
                必须是1开头
                第二位:  3 4 5 6 7 8 9
                全都是数字, 必须是11位
        3. 邮箱正则
                zhangSan@itcast.cn
                zhangsan@163.com
                123456@qq.com
                zhangsan@sina.com
                zhangsan@itcast.qq.com
                zhangsan@xxx.edu
                zhangsan@xxx.org
     */
    public static void main(String[] args) {

        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("01256".matches(qqRegex));

        String telRegex = "[1][3-9]\\d{9}";
        System.out.println("15611111111".matches(telRegex));

        System.out.println("-----------------");

        String emailRegex = "\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("zhangSan@itcast.cn".matches(emailRegex));
        System.out.println("zhangsan@itcast.qq.com".matches(emailRegex));
        System.out.println("zhangSanitcast.cn".matches(emailRegex));
        System.out.println("zhangSan@itcast".matches(emailRegex));

    }
}
```

### **String** **类中与正则有关的常见方法**

| 方法名                                               | 说明                                                       |
| ---------------------------------------------------- | ---------------------------------------------------------- |
| public String replaceAll(String regex,String newStr) | 按照正则表达式匹配的内容进行替换                           |
| public String[] split(String regex)                  | 按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组 |

案例：

```java
public class PatternTest {
    /*
        需求：请把下面文本中的电话，邮箱，座机号码，热线都爬取出来。
     */
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，" +
                "电话：18666668888，18699997777或者联系" +
                "邮箱：boniu@itcast.cn 邮箱：bozai@itcast.cn 邮箱2：dlei0009@163.com" +
                "座机电话：01036517895，010-98951256 " +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        String regex = "[1][3-9]\\d{9}|\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+|[0]\\d{2,3}-?\\d{7,8}|400-?\\d{3}-?\\d{4}";

        // 1. 将正则表达式封装为 Pattern 对象
        Pattern pattern = Pattern.compile(regex);

        // 2. 获取匹配器对象
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


    }
}
```

