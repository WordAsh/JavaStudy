package com.hit.jdbc;

import com.hit.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoTest {
   public Connection connection;
   public Statement statement;

   @Test
    public void insertTest(){
       try {
           connection = JDBCUtils.getConnection();
           statement = connection.createStatement();
           String sql = "insert into student values(7,'Micro',26)";
           int res = statement.executeUpdate(sql);

           if(res != 0){
               System.out.println("Insert success!");
           }
       } catch (SQLException e) {
           throw new RuntimeException(e);
       }finally {
           try {
               JDBCUtils.close(connection,statement);
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
   }


    @Test
    public void updateTest(){
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "update student set age=40 where id=4";
            int res = statement.executeUpdate(sql);

            if(res != 0){
                System.out.println("Update success!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,statement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Test
    public void deleteTest(){
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "delete from student where id=4";
            int res = statement.executeUpdate(sql);

            if(res != 0){
                System.out.println("Delete success!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                JDBCUtils.close(connection,statement);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
