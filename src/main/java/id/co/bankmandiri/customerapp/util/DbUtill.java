package id.co.bankmandiri.customerapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtill {
    private final String dburl = "jdbc:mysql://localhost:3306/create database1";
    private final String username = "root";
    private final String password = "";
    private static Connection connection;
    private static Properties properties;

    public static String getProperty(String key){
        if(properties != null){
            return properties.getProperty(key);
        } else {
            properties = new Properties();
            InputStream is = DbUtill.class.getClassLoader()
                    .getResourceAsStream("database.properties");
            try{
                properties.load(is);
                return properties.getProperty(key);
            } catch (IOException ioe){
                ioe.printStackTrace();
                return null;
            }
        }
    }
    public static Connection getConnection(){
        if (connection != null){
            return connection;
        } else {
            try{
                connection = DriverManager.getConnection(
                        getProperty("url"),
                        getProperty("username"),
                        getProperty("password")
                );
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return connection;
    }
}
