package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    static Connection connect = null;
    static Connection getConnection(){
        if(connect != null)
        {
            return connect;
        }
        String user = "root";
        String pwd = "12345";
        String db = "Searchengine";
        return getConnection(user, pwd,db);
    }
    static Connection getConnection(String user, String pwd, String db)
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connect;
    }


}

