package io.github.viiictorxd.database;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class RemoteConnectionProvider extends AbstractConnectionProvider {

    protected ConnectionProperties properties;
}
