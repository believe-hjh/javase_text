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
