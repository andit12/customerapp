package id.co.bankmandiri.customerapp.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class DbUtillTest {


    @Test
    void getProperty() {
        String url = DbUtill.getProperty("url");
        Assertions.assertEquals("jdbc:mysql://localhost:3306/create database1", url);
    }

    @Test
    void getConnection() {
        Connection connection = DbUtill.getConnection();
        Assertions.assertNotNull(connection, "connection should be successfull");
    }
}