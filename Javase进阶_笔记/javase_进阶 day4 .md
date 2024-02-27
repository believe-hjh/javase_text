# 面向对象高级案例_石头迷阵

## 本次将通过石头迷阵的案例将昨日学习的知识进行总结

### 步骤：

#### 1.构建出游戏窗体：

设置好窗体的大小，关闭模式，名字等

```java
JFrame jFrame = new JFrame();
//设置窗体大小
jFrame.setSize(514,595);
//设置窗体关闭模式
jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//设置窗体名字
jFrame.setTitle("石头迷阵1.0版本");
//设置窗体总是显示在上层
jFrame.setAlwaysOnTop(true);
//设置窗体居中
jFrame.setLocationRelativeTo(null);
//设置窗体显示
jFrame.setVisible(true);
```

#### 2.绘制界面：

首先取消窗口的默认模式，然后添加背景图片和相应的数字图片，因为JFrame的特性，所以先添加数字图片后添加背景图片

```java
//取消窗体默认布局
        jFrame.setLayout(null);

        JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\1.png"));
        jb1.setBounds(50,90,100,100);
        jFrame.getContentPane().add(jb1);

        JLabel jb2 = new JLabel(new ImageIcon("D:\\image\\2.png"));
        jb2.setBounds(150,90,100,100);
        jFrame.getContentPane().add(jb2);

        JLabel jb3 = new JLabel(new ImageIcon("D:\\image\\3.png"));
        jb3.setBounds(250,90,100,100);
        jFrame.getContentPane().add(jb3);

        JLabel jb4 = new JLabel(new ImageIcon("D:\\image\\4.png"));
        jb4.setBounds(350,90,100,100);
        jFrame.getContentPane().add(jb4);

        JLabel jb5 = new JLabel(new ImageIcon("D:\\image\\5.png"));
        jb5.setBounds(50,190,100,100);
        jFrame.getContentPane().add(jb5);

        JLabel jl6 = new JLabel(new ImageIcon("D:\\image\\6.png"));
        jl6.setBounds(150,190,100,100);
        jFrame.getContentPane().add(jl6);

        JLabel jl7 = new JLabel(new ImageIcon("D:\\image\\7.png"));
        jl7.setBounds(250,190,100,100);
        jFrame.getContentPane().add(jl7);

        JLabel jl8 = new JLabel(new ImageIcon("D:\\image\\8.png"));
        jl8.setBounds(350,190,100,100);
        jFrame.getContentPane().add(jl8);

        JLabel jl9 = new JLabel(new ImageIcon("D:\\image\\9.png"));
        jl9.setBounds(50,290,100,100);
        jFrame.getContentPane().add(jl9);

        JLabel jl10 = new JLabel(new ImageIcon("D:\\image\\10.png"));
        jl10.setBounds(150,290,100,100);
        jFrame.getContentPane().add(jl10);

        JLabel jl11 = new JLabel(new ImageIcon("D:\\image\\11.png"));
        jl11.setBounds(250,290,100,100);
        jFrame.getContentPane().add(jl11);

        JLabel jl12 = new JLabel(new ImageIcon("D:\\image\\12.png"));
        jl12.setBounds(350,290,100,100);
        jFrame.getContentPane().add(jl12);

        JLabel jl13 = new JLabel(new ImageIcon("D:\\image\\13.png"));
        jl13.setBounds(50,390,100,100);
        jFrame.getContentPane().add(jl13);

        JLabel jl14 = new JLabel(new ImageIcon("D:\\image\\14.png"));
        jl14.setBounds(150,390,100,100);
        jFrame.getContentPane().add(jl14);

        JLabel jl15 = new JLabel(new ImageIcon("D:\\image\\15.png"));
        jl15.setBounds(250,390,100,100);
        jFrame.getContentPane().add(jl15);

        JLabel jl16 = new JLabel(new ImageIcon("D:\\image\\16.png"));
        jl16.setBounds(350,390,100,100);
        jFrame.getContentPane().add(jl16);

        JLabel background = new JLabel(new ImageIcon("D:\\image\\background.png"));
		background.setBounds(20,30,450,484);
        jFrame.getContentPane().add(background);
```

#### 3.优化绘制界面的代码：

在上面的代码界面中，可以发现代码重复内容过多，可以进行优化

首先，将可以发现每行4个数字图片除了X坐标外，其他的不变，并且X坐标的位置是每个图片增加100个像素，因此

可以通过for循环将这些代码优化

```java
		for(int j=0;j<4;j++){
            JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\1.png"));
            jb1.setBounds(50+100*j,90,100,100);
            jFrame.getContentPane().add(jb1);
        }
        for(int j=0;j<4;j++){
            JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\1.png"));
            jb1.setBounds(50+100*j,190,100,100);
            jFrame.getContentPane().add(jb1);
        }
        for(int j=0;j<4;j++){
            JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\1.png"));
            jb1.setBounds(50+100*j,290,100,100);
            jFrame.getContentPane().add(jb1);
        }
        for(int j=0;j<4;j++){
            JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\1.png"));
            jb1.setBounds(50+100*j,390,100,100);
            jFrame.getContentPane().add(jb1);
        }
```

然后发现，这四个循环中，除了Y坐标变化，其余的都不变，并且Y坐标的位置是每个图片增加100个像素，因此，可以再次添加一个for循环对代码进行优化

```java
for (int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\1.png"));
                jb1.setBounds(50+100*j,90+100*i,100,100);
                jFrame.getContentPane().add(jb1);
            }
        }
```

但是，此时可以发现，循环出来的图片都是一样的，不符合案例需求，因此，可以先创建个二维数组，通过遍历数组解决图片重复的问题

先创建二位数组

```java
int[][]ints = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
```

然后修改循环体

```java
for (int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\"+ints[i][j]+".png"));
                jb1.setBounds(50+100*j,90+100*i,100,100);
                jFrame.getContentPane().add(jb1);
            }
        }
```

#### 4.通过继承重构代码

通过上面几步，已经实现了背景图片和数字图片的显示，但是因JFrame是java写好的代码，我们后续想添加新的功能的时候会无法添加，因此通过继承重构代码，具体步骤如下

1.定义 MainFrame 类继承 JFrame

2.将代码抽取到一个单独的方法 initFrame()

3.将绘制界面的代码, 抽取为一个单独的方法 paintView()

4.将二维数组提取到成员变量的位置

5.对 JFrame 类中方法的调用方式, 更换为super. 或直接省略

6.在构造方法中, 调用 initFrame() 和 paintView()

7.在构造方法的最后调用 setVisible(true);

代码如下：

```java
public class MainFrame extends JFrame {

    int[][]ints = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    public MainFrame(){
        //绘制初始界面
        initJFrame();
        //绘制游戏界面
        paintView();
        //设置窗体显示
        setVisible(true);
    }
    //此方法用于绘制初始界面
    public void initJFrame(){

        //设置窗体大小
        setSize(514,595);
        //设置窗体关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体名字
        setTitle("石头迷阵1.0版本");
        //设置窗体总是显示在上层
        setAlwaysOnTop(true);
        //设置窗体居中
        setLocationRelativeTo(null);
        //取消窗体默认布局
        setLayout(null);

    }
    //此方法用于绘制游戏界面
    public void paintView(){

        for (int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\"+ints[i][j]+".png"));
                jb1.setBounds(50+100*j,90+100*i,100,100);
                getContentPane().add(jb1);
            }
        }
        JLabel background = new JLabel(new ImageIcon("D:\\image\\background.png"));
        background.setBounds(20,30,450,484);
        getContentPane().add(background);
        //设置窗体显示
        setVisible(true);
    }
}

```



#### 5.打乱石头方块

核心思路：遍历二维数组获取每一个元素，和其他元素随机交换

1.遍历二维数组, 获取到每一个元素   

2.在遍历的过程中, 产生两个随机的索引

3.让当前元素, 和随机索引所指向的元素进行交换

代码如下

```java
 public void initData(){
        Random r = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                int RandomX =r.nextInt(4);
                int RandomY= r.nextInt(4);
                int temp = ints[i][j];
                ints[i][j]=ints[RandomX][RandomY];
                ints[RandomX][RandomY]= temp;
            }
        }
    }
```

#### 6.移动业务准备-注册键盘监听

准备动作：

为窗体注册键盘监听，并区分出上下左右，谁被按下了

需要让MainFrame通过implements 实现KeyListener这个接口，所以重写keyPressed方法，在键盘按下式触发，其余两个方法不变

同时将移动的代码抽取为move方法方便后期使用

代码如下：

```java
@Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        extracted(keyCode);
    }

    private void extracted(int keyCode) {
        move(keyCode);
    }

    private void move(int keyCode) {
        if(keyCode ==37){
            System.out.println("左按键");
        }
        else if(keyCode ==38){
            System.out.println("上按键");
        }
        else if(keyCode ==39){
            System.out.println("右按键");
        }
        else if(keyCode ==40){
            System.out.println("右按键");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
```

#### 7.移动业务准备-确认0号元素所在位置

在游戏运行的过程中，使用的是键盘将方块移动到空处，而所谓的空处，就是数组中0号元素的位置，因此只要找到0号元素的位置，就是找到空处了

首先定义两个值准备用来记录0号索引的位置（定义在最前面，为全局变量）

```java
int row;
int column;
```

然后在数组被打乱后，遍历数组通过if语句找到0号元素即可

```java
for (int i = 0; i < ints.length; i++) {
    for (int j = 0; j < ints.length; j++) {
        if(ints[i][j]==0){
            row=i;
            column=j;
        }
    }
}
```

#### 8.移动业务准备-基本实现

实现方块的移动，其实就是方块和空处交换位置，也就是数组数据的移动

因此，通过对之前写的move类进行修改，就可以实现功能，同时添加个作弊器

```java
private void move(int keyCode) {
    if(keyCode ==37){
        int temp=ints[row][column];
        ints[row][column]=ints[row][column+1];
        ints[row][column+1]=temp;
        column++;
    }
    else if(keyCode ==38){
        int temp = ints[row][column];
        ints[row][column] = ints[row+1][column];
        ints[row+1][column]=temp;
        row++;
    }
    else if(keyCode ==39){
        int temp=ints[row][column];
        ints[row][column]= ints[row][column-1];
        ints[row][column-1]=temp;
        column--;
    }
    else if(keyCode ==40){
        int temp = ints[row][column];
        ints[row][column]=ints[row-1][column];
        ints[row-1][column]=temp;
        row--;
    }
    else if(keyCode==90){
            //作弊按键，按键为z
            ints=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
}
```

同时在该方法完成后，还要修改后的界面重新加载，还需要在添加paintView(); 方法

```java
private void extracted(int keyCode) {
        move(keyCode);
        //每一次移动之后，重新加载界面
        paintView();
    }
```

但是因为JFrame的运行机制，后面加载的图片会被放在原先的图层下面因此还需要用到super.getContentPane().removeAll();方法删除

前面的图层，同时使用super.getContentPane().repaint();刷新界面，修改后的代码如下：

```java
public void paintView(){
super.getContentPane().removeAll();

    for (int i = 0;i<4;i++){
        for(int j=0;j<4;j++){
            JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\"+ints[i][j]+".png"));
            jb1.setBounds(50+100*j,90+100*i,100,100);
            getContentPane().add(jb1);
        }
    }
    JLabel background = new JLabel(new ImageIcon("D:\\image\\background.png"));
    background.setBounds(20,30,450,484);
    getContentPane().add(background);
    //设置窗体显示
    setVisible(true);
    super.getContentPane().repaint();
}
```

#### 9.移动业务准备-错误解决

在空位置移动到最边上时候，若再往该方向移动，会出现索引越界的异常，通过分析可知：

- column == 3 不允许左移动

- row == 3 不允许上移动

- column == 0 不允许右移动

- row == 0 不允许下移动

因此可修改按键代码为：

```java
private void move(int keyCode) {
    if(keyCode ==37){
        if(column==3){
            return;
        }
        int temp=ints[row][column];
        ints[row][column]=ints[row][column+1];
        ints[row][column+1]=temp;
        column++;
    }
    else if(keyCode ==38){
        if (row==3){
            return;
        }
        int temp = ints[row][column];
        ints[row][column] = ints[row+1][column];
        ints[row+1][column]=temp;
        row++;
    }
    else if(keyCode ==39){
        if(column==0){
            return;
        }
        int temp=ints[row][column];
        ints[row][column]= ints[row][column-1];
        ints[row][column-1]=temp;
        column--;
    }
    else if(keyCode ==40){
        if(row==0){
            return;
        }
        int temp = ints[row][column];
        ints[row][column]=ints[row-1][column];
        ints[row-1][column]=temp;
        row--;
    }
    else if(keyCode==90){
        //作弊按键，按键为z
        ints=new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
    }
}
```

#### 10判断游戏是否胜利

**1.** **定义新的二维数组，存储游戏胜利的数据**



```java
int [][] win ={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0}
};
```

**2.** **使用现有数组中的元素****,** **和胜利数组中元素逐个进行比对**

​     **全部相同显示胜利图片**

​     **建议定义为一个方法 ,例如 victory**

**3.** **因为每一次移动后,都需要调用绘制界面的方法** 

​     **所以,应该在该方法中判断是否胜利**

```java
//胜利
public boolean victory(){

    for (int i = 0; i < ints.length; i++) {
        for (int j = 0; j < ints.length; j++) {
            if(win[i][j]!=ints[i][j]){
                return false;
            }
        }
    }
    return true;
}
```

然后在paintView();添加以下代码完成显示胜利图标的效果

```java
if(victory()){
    //加载胜利图片，添加到窗体
    JLabel winlable = new JLabel(new ImageIcon("D:\\image\\win.png"));
    winlable.setBounds(124,230,266,88);
    getContentPane().add(winlable);
}
```

**注意：胜利界面出现后，游戏将进入不可移动的状态**

**在移动的方法中，再次调用 victory方法，如果为胜利状态**

**通过return结束方法**

#### 11统计步数，重新游戏

统计步数的方法较为简单，只需要创建一个全局变量，没记性一次操作，便开始count++即可

然后将其添加到面板即可

然后就是重新开始游戏，步骤大概为以下几部

- 创建 JButton 按钮

- setBounds(350, 20, 100, 20);

- 绑定动作监听 ActionListenter 

1. 步数归零

2. 重新调用initData()方法

3. 重新调用paintView()方法

至此，所有案例完成，完整代码如下：

```java
package day4.stonepuzzle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {

    int[][]ints = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int [][] win ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    int row;//零号元素的列坐标
    int column;//零号元素的行坐标
    int count; //计步器
    public MainFrame(){
        //绘制初始界面
        initJFrame();
        //打乱石块位置
        initData();
        //确认键盘动作
        this.addKeyListener(this);
        //绘制游戏界面
        paintView();
        //设置窗体显示
        setVisible(true);
    }
    //此方法用于打乱石块位置
    public void initData(){
        Random r = new Random();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                int RandomX =r.nextInt(4);
                int RandomY= r.nextInt(4);
                int temp = ints[i][j];
                ints[i][j]=ints[RandomX][RandomY];
                ints[RandomX][RandomY]= temp;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if(ints[i][j]==0){
                    row=i;
                    column=j;
                }
            }
        }

    }
    //此方法用于绘制初始界面
    public void initJFrame(){

        //设置窗体大小
        setSize(514,595);
        //设置窗体关闭模式
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置窗体名字
        setTitle("石头迷阵1.0版本");
        //设置窗体总是显示在上层
        setAlwaysOnTop(true);
        //设置窗体居中
        setLocationRelativeTo(null);
        //取消窗体默认布局
        setLayout(null);

    }
    //此方法用于绘制游戏界面
    public void paintView(){
    getContentPane().removeAll();
    if(victory()){
        //加载胜利图片，添加到窗体
        JLabel winlable = new JLabel(new ImageIcon("D:\\image\\win.png"));
        winlable.setBounds(124,230,266,88);
        getContentPane().add(winlable);
    }
    JButton jbt = new JButton("重新游戏");
    jbt.setBounds(350,20,100,20);
    getContentPane().add(jbt);
    jbt.setFocusable(false);
    jbt.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count = 0;
            initData();
            paintView();
        }
    });

    JLabel scoreLable = new JLabel("步数为"+count);
    scoreLable.setBounds(50, 20, 100, 20);
    getContentPane().add(scoreLable);


        for (int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                JLabel jb1 = new JLabel(new ImageIcon("D:\\image\\"+ints[i][j]+".png"));
                jb1.setBounds(50+100*j,90+100*i,100,100);
                getContentPane().add(jb1);
            }
        }
        JLabel background = new JLabel(new ImageIcon("D:\\image\\background.png"));
        background.setBounds(20,30,450,484);
        getContentPane().add(background);
        //设置窗体显示
        setVisible(true);
        super.getContentPane().repaint();
    }
    //胜利
    public boolean victory(){

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if(win[i][j]!=ints[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        extracted(keyCode);
    }

    private void extracted(int keyCode) {
        move(keyCode);
        //每一次移动之后，重新加载界面
        paintView();
    }

    private void move(int keyCode) {
        if(victory()){
            return;
        }
        if(keyCode ==37){
            if(column==3){
                return;
            }
            int temp=ints[row][column];
            ints[row][column]=ints[row][column+1];
            ints[row][column+1]=temp;
            column++;
            count++;
        }
        else if(keyCode ==38){
            if (row==3){
                return;
            }
            int temp = ints[row][column];
            ints[row][column] = ints[row+1][column];
            ints[row+1][column]=temp;
            row++;
            count++;
        }
        else if(keyCode ==39){
            if(column==0){
                return;
            }
            int temp=ints[row][column];
            ints[row][column]= ints[row][column-1];
            ints[row][column-1]=temp;
            column--;
            count++;
        }
        else if(keyCode ==40){
            if(row==0){
                return;
            }
            int temp = ints[row][column];
            ints[row][column]=ints[row-1][column];
            ints[row-1][column]=temp;
            row--;
            count++;
        }
        else if(keyCode==90){
            //作弊按键，按键为z
            ints=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
}
```

测试类

```java
package day4.stonepuzzle;

public class Test {
    public static void main(String[] args) {
        new MainFrame();
    }
}
```