package com.hit.service;

import com.hit.model.Student;
import com.hit.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService {
    public static Connection connection;
    public static PreparedStatement preparedStatement;

    public static ArrayList<Student> selectAll(){
        ArrayList<Student> arrayList = new ArrayList<>();
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from student";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                arrayList.add(new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,preparedStatement);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static Student selectById(int id){
        Student student = new Student();
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from student where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setAge(resultSet.getInt(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return student;
    }

    public static boolean delete(int id){
        try {
            connection = JDBCUtils.getConnection();
            String sql = "delete from student where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int res = preparedStatement.executeUpdate();
            if(res > 0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public static boolean update(int id,String name,int age){
        try {
            connection = JDBCUtils.getConnection();
            String sql = "update student set name=?,age=? where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setInt(3,id);

            int res = preparedStatement.executeUpdate();
            if(res > 0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }

    public static boolean updateName(int id,String name){
        try {
            connection = JDBCUtils.getConnection();
            String sql = "update student set name=? where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);

            int res = preparedStatement.executeUpdate();
            if(res > 0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,preparedStatement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }
}
