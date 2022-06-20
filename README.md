<p align="center">
 <h1>Simple Database Connector</h1>
 👾 A lightweight and simple SQL Connector
</p>

<h2>Quick example</h2>
<h3>Installing with Maven</h3>

```xml
<dependency>
    <groupId>com.github.ViiictorXD</groupId>
    <artifactId>simple-database-connector</artifactId>
    <version>development</version>
</dependency>
```
<h3>Installing with Gradle</h3>

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.ViiictorXD:simple-database-connector:development'
}
```

<h2>Samples</h2>
You can connect with local (SQLite) or Remote (MySQL) connection easily.

<h3>MySQL Sample</h3>

```java
ConnectionProvider connectionProvider = new MysqlConnectionProvider(ConnectionProperties.builder()
  .host("host")
  .database("minecraft")
  .user("root")
  .password("")
  .build());
```

<h4>SQLite Sample</h4>

```java
File file = new File("D:/Development");

ConnectionProvider connectionProvider = new SqliteConnectionProvider(file, "file_name");
```

<h2>Useful methods</h2>

```java
// Connecting to the database host
connectionProvider.connect();
        
// Disconnecting
connectionProvider.disconnect();
        
// Getting the Connection object
Connection connection = connectionProvider.getConnection();
```

<h4>Issues</h4>
Please make sure to read the Issue Reporting Checklist before opening an issue. Issues not conforming to the guidelines may be closed immediately.

<h2>Contributors</h2>
<table>
  <tr>
    <td align="center"><a href="https://github.com/ViiictorXD">
<img src="https://avatars3.githubusercontent.com/u/38568440?v=4" width="100px;" alt=""/><br /><sub><b>ViiictorXD</b></sub></a><br /><a href="https://github.com/ViiictorXD/simple-database-connector/commits?author=ViiictorXD" title="Code">💻</a></td>
  </tr>
</table>
