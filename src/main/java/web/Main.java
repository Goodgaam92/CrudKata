package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/usersdatab?serverTimezone=Europe/Minsk&useSSL=false";
       String user = "root";
       String password = "Bekhan95";
       try(Connection connection =  DriverManager.getConnection(url, user, password)) {
           System.out.println("Connection successful");
       } catch (SQLException e) {
           System.out.println("Connection failed");
           e.printStackTrace();
       }
    }
}
