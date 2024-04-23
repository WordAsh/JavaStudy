package com.hit.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    //静态代码，做预处理
    static{
        try{
            //JDBCUtils.class.getClassLoader()
            //读取配置文件
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("db.properties");
            //加载对象
            Properties properties = new Properties();
            properties.load(inputStream);

            //读取配置项
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //测试是否加载成功
    public static void init(){
        System.out.println("加载成功");
    }
    //创建单例，获取配置项
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
    //释放，关闭结果，关闭仓库，关闭数据库连接
    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if(resultSet != null){
            resultSet.close();
        }
        if(statement != null){
            statement.close();
        }
        if(connection != null){
            connection.close();
        }
    }
    public static void close(Connection connection,Statement statement) throws SQLException {
        if(statement != null){
            statement.close();
        }
        if(connection != null){
            connection.close();
        }
    }
}
