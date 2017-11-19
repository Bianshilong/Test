package com.bsl.gameexample;

import java.awt.Toolkit;

import javax.swing.JFrame;
//Test JFrame类的属性和方法
public class Test {

	public static void main(String[] args) {
		//生成一个窗体
		JFrame jf = new JFrame();
		//设置窗体的显示
		jf.setVisible(true);
		//设置名称
		jf.setTitle("五子棋");
		//设置大小
		jf.setSize(200,100);
		//设置位置
//		jf.setLocation(200, 100);
		//设置页面是否可修改
		jf.setResizable(false);
		//设置关闭后退出
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//得到当前屏幕的分辨率
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		System.out.println(width);
		System.out.println(height);
		//重新设置窗体位置，位于屏幕正中央
		jf.setLocation((width-200)/2,(height-200)/2);
	}

}
