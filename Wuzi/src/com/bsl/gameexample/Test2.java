package com.bsl.gameexample;

import java.awt.Toolkit;


import com.bsl.game.frame.FiveChessFrame;

//测试与鼠标监听相关的类——MouseListener
public class Test2 {

	int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	//保存棋子的坐标
	int x=0;
	int y=0;
	//保存之前下过的全部棋子的坐标
	//其中数据内容为0：表示这个点并没有棋子，1：表示这个点是黑子；2表示这个点是白字；
	int[][] allChess = new int[19][19];
	//标识当前应该黑棋还是白棋下下一步
	boolean isBlack = true;
	//标识当前游戏是否可以继续
	boolean canPlay = true;
	//保存显示的提示信息
	String message = "黑方先行！";
	//保存最多拥有多长时间（秒）
	int blackTime = 0;
	int WhiteTime = 0;
	//保存双方剩余时间的显示信息
	String blackMessage = "无限制";
	String whitekMessage = "无限制";
		
	

}
