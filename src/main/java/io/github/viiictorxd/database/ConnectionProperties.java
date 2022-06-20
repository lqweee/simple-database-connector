package io.github.viiictorxd.database;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ConnectionProperties {

    private String host;
    private String database;
    private String user;
    private String password;
}
