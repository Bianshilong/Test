package com.bsl.test;
//UserInfo类存储数据库的字段信息
import lombok.Getter;
import lombok.Setter;
@SuppressWarnings("all")
@Getter@Setter
public class UserInfo {
	private int id;
	private String name;
	private String age;
	private String cell;
}
