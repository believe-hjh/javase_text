package day3.frame;

import javax.swing.*;


public class JFrameTest {
    public static void main(String[] args) {
        // 创建窗体对象
        JFrame jFrame = new JFrame();
        // 设置窗体大小
        jFrame.setSize(800,500);
        // 修改窗体的关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置窗体标题
        jFrame.setTitle("这是第一个代码");
        // 设置窗体可见
        jFrame.setVisible(true);
    }
}
