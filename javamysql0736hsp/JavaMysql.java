package com.hsp.javamysql0736hsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * java程序操作Mysql
 */
@SuppressWarnings({ "all" })
public class JavaMysql {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// 加载类，得到mysql连接
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp_db02", "root", "hsp");

		// 创建一个商品hsp_goods表, 选用适当的数据类型 删除表goods

		// String sql = "create table hsp_goods ( id int, name varchar(32), price
		// double, introduce text)" ;
		// String sql = "insert into hsp_goods values(1, '华为手机', 2000, '这是不错的一款手机')" ;
		String sql = "drop table hsp_goods";

		Statement statement = connection.createStatement();
		statement.executeUpdate(sql);// 得到statement对象，把sql 语法发送给mysql执行

		statement.close();
		connection.close(); // 关闭连接
		System.out.println("成功");

	}
}
