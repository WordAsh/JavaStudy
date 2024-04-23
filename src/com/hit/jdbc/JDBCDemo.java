package com.hit.jdbc;

import java.sql.*;

public class JDBCDemo {
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/archi_faculty";
    public static final String USER = "root";
    public static final String PASSWORD = "Long5230413";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    public static void main(String[] args){
        try{
            //1.加载驱动程序 -> 给布料厂打电话，我是mysql公司的
            Class.forName(DRIVER);
            //2.获得数据库的连接 -> 告诉物流具体走什么路线
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            //3. 获取数据库操作对象 -> 货送到了，然后卸货到仓库
            statement = connection.createStatement();
            //4. 从仓库中选出要用的货，查询sql语句
            resultSet = statement.executeQuery("select * from student");
            while(resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                System.out.println("[" + id + "," + name + "," + age +"]");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                //5.完成所有操作，关闭仓库，再关闭数据库连接
                resultSet.close();
                statement.close();
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
