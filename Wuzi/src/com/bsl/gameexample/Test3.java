package com.bsl.gameexample;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Test3 {
	
	public void paint(Graphics g){
		//双缓冲技术防止屏幕闪烁
		BufferedImage bi = new BufferedImage(500, 500, BufferedImage.TYPE_INT_BGR);
		Graphics g2 = bi.createGraphics();
		g2.setColor(Color.BLACK);
		//绘制背景
//		g2.drawImage(bgImage, 1, 20, this);   //从别处引用
		//输出标题信息
		g2.setFont(new Font("黑体", Font.BOLD, 20));
//		g2.drawString("游戏信息："+message, 130, 80);   //从别处引用
		//输出时间信息
		g2.setFont(new Font("宋体", Font.CENTER_BASELINE, 14));
//		g2.drawString("黑方时间："+blackMessage,30,470);
//		g2.drawString("黑方时间："+whiteMessage,260,470);
		//绘制棋盘
		for (int i = 0; i < 19; i++) {
			g2.drawLine(10,70+20*i,370,70+20*i);
			g2.drawLine(10+20*i,70,10+20*i,430);
		}
		//标注点位
		g2.fillOval(68,128, 4, 4);
		g2.fillOval(308,128, 4, 4);
		g2.fillOval(308,388, 4, 4);
		g2.fillOval(68,388, 4, 4);
		g2.fillOval(308,248, 4, 4);
		g2.fillOval(188,128, 4, 4);
		g2.fillOval(68,248, 4, 4);
		g2.fillOval(188,388, 4, 4);
		g2.fillOval(188,248, 4, 4);
		
		//绘制全部棋子
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
//				if (allChess[i][j]==1) {
//					//黑子
//					int tempX = i*20+10;
//					int tempY = j*20+10;
//					g2.fillOval(tempX-7,tempY-7, 14, 14);
//				}
////				if (allChess[i][j]==2) {
//					//白子
//					int tempX = i*20+10;
//					int tempY = j*20+10;
//					g2.setColor(Color.WHITE);
//					g2.fillOval(tempX-7,tempY-7, 14, 14);
//					g2.setColor(Color.BLACK);
//					g2.fillOval(tempX-7,tempY-7, 14, 14);
//				}
				
			}
		}
		
//	g.drawImage(bi, 0, 0,this);
	}
}
