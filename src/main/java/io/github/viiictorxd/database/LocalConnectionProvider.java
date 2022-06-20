package io.github.viiictorxd.database;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.File;

@Getter
@AllArgsConstructor
public abstract class LocalConnectionProvider extends AbstractConnectionProvider {

    protected File file;
    protected String name;
}
