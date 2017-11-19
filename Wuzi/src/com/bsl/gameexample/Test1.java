package com.bsl.gameexample;

import javax.swing.JOptionPane;

import com.bsl.game.frame.FiveChessFrame;

//测试与对话框相关的类——JoptionPane
public class Test1 {

	public static void main(String[] args) {

		FiveChessFrame ff = new FiveChessFrame();
		JOptionPane.showMessageDialog(ff, "我的信息");
		int result = JOptionPane.showConfirmDialog(ff, "我的确认信息：现在要开始游戏吗？");
//		switch (result) {
//		case 0:
//			JOptionPane.showMessageDialog(ff, "游戏开始");
//			break;
//		case 1:
//			JOptionPane.showMessageDialog(ff, "游戏结束");
//			break;
//		case 2:
//			JOptionPane.showMessageDialog(ff, "请重新选择");
//			break;
//		}
		if (result==0) {
			JOptionPane.showMessageDialog(ff, "游戏开始");
		}
		if (result==1) {
			JOptionPane.showMessageDialog(ff, "游戏结束");
		}
		if (result==2) {
			JOptionPane.showMessageDialog(ff, "请重新选择");
		}
		String username = JOptionPane.showInputDialog("请输入您的姓名");
		if (username!=null) {
			System.out.println(username);
			JOptionPane.showMessageDialog(ff, "输入的姓名为："+username);
		}else {
			JOptionPane.showMessageDialog(ff, "请重新输入你的姓名");
		}
	}
}
