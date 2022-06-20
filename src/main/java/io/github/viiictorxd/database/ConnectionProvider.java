package io.github.viiictorxd.database;

import lombok.SneakyThrows;

import java.sql.Connection;

public interface ConnectionProvider {

    Connection getConnection();

    void connect();

    @SneakyThrows
    default void disconnect() {
        Connection connection = getConnection();

        if (connection == null || connection.isClosed()) {
            return;
        }

        connection.close();
    }
}
