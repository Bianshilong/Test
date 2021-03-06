package com.bsl.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
@SuppressWarnings("all")
public class Method {

	public static final String DBRIVER="com.mysql.jdbc.Driver";
	public static final String DBURL="jdbc:mysql://localhost:3306/db_test";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";
	
	public ArrayList findAll() throws Exception {
		Class.forName(DBRIVER);
		Connection conn=null;
		Statement st = null;
		ResultSet rs = null;
		
		ArrayList list = new ArrayList();
		String sql = "select * from info";
		
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		st = conn.createStatement();
		rs=st.executeQuery(sql);
		while (rs.next()) {
			UserInfo user = new UserInfo();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setAge(rs.getString("age"));
			user.setCell(rs.getString("cell"));
			list.add(user);
		}
		rs.close();
		st.close();
		conn.close();
		return list;
		
	}
	
	public void insert(String name,String age,String cell) throws Exception{
		Class.forName(DBRIVER);
		Connection conn=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		ArrayList list = new ArrayList();
		String sql = "insert into info(name,age,cell) value (?,?,?)";
		
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		st = conn.prepareStatement(sql);
		st.setString(1, name);
		st.setString(2, age);
		st.setString(3, cell);
		st.executeUpdate();
		st.close();
		conn.close();
	} 
		
	public void remove(int id) throws Exception{
		Class.forName(DBRIVER);
		Connection conn=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		String sql = "delete from info where id =?";
		
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		st = conn.prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		st.close();
		conn.close();
		
	}
	//删除多个记录
	public void removeMore(String ids) throws Exception{
		Class.forName(DBRIVER);
		Connection conn=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
//		String sql = "delete from info where id in ("+ids+")";
		String sql =ids;
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		st = conn.prepareStatement(sql);
		st.executeUpdate();
		st.close();
		conn.close();
		
	}
	//数据更新
	public UserInfo findById(int id) throws Exception{
		
		Class.forName(DBRIVER);
		Connection conn=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		UserInfo user=null;
		String sql = "select * from info where id = ?";
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		st = conn.prepareStatement(sql);
		st.setInt(1, id);
		rs=st.executeQuery();
		while (rs.next()) {
			user = new UserInfo();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setAge(rs.getString("age"));
			user.setCell(rs.getString("cell"));
		}
		rs.close();
		st.close();
		conn.close();
		return user;
	}
	
	//更新数据
	public void update(UserInfo user) throws Exception{
		
		Class.forName(DBRIVER);
		Connection conn=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "update info set name=?,age=?,cell=? where id = ?";
		conn = DriverManager.getConnection(DBURL,DBUSER,DBPWD);
		st = conn.prepareStatement(sql);
		st.setString(1, user.getName());
		st.setString(2, user.getAge());
		st.setString(3, user.getCell());
		st.setInt(4, user.getId());
		st.executeUpdate();
		st.close();
		conn.close();
	}
	
}
