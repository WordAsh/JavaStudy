package com.hit.jdbc;

import com.hit.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo2 {
    public static Connection connection;
    public static PreparedStatement preparedStatement;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            connection = JDBCUtils.getConnection();
            String sql = "insert into student values(?,?,?)";
            System.out.println("Please input id,name and age, separate by enter:");
            int id = scanner.nextInt();
            String name = scanner.nextLine();
            int age = scanner.nextInt();

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,age);

            int res = preparedStatement.executeUpdate();

            if(res != 0){
                System.out.println("Update success!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                scanner.close();
                JDBCUtils.close(connection,preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
