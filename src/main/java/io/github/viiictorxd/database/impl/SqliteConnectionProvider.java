package io.github.viiictorxd.database.impl;

import io.github.viiictorxd.database.LocalConnectionProvider;
import lombok.SneakyThrows;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnectionProvider extends LocalConnectionProvider {
    
    public SqliteConnectionProvider(File file, String name) {
        super(file, name);
    }
    
    @SneakyThrows
    @Override
    public Connection getConnection() {
        if (connection == null || connection.isClosed()) {
            connect();
        }
    
        return connection;
    }
    
    @Override
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
    
            connection = DriverManager.getConnection(String.format(
              "jdbc:sqlite:%s/%s.db", file, name
            ));
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
