package io.github.viiictorxd.database.impl;

import io.github.viiictorxd.database.ConnectionProperties;
import io.github.viiictorxd.database.RemoteConnectionProvider;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnectionProvider extends RemoteConnectionProvider {
    
    public MysqlConnectionProvider(ConnectionProperties properties) {
        super(properties);
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
            Class.forName("com.mysql.jdbc.Driver");
            
            connection = DriverManager.getConnection(String.format(
              "jdbc:mysql://%s/%s", properties.getHost(), properties.getDatabase()
            ), properties.getUser(), properties.getPassword());
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
