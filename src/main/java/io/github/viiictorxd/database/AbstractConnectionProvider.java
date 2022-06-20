package io.github.viiictorxd.database;

import java.sql.Connection;

public abstract class AbstractConnectionProvider implements ConnectionProvider {

    protected Connection connection;
}
