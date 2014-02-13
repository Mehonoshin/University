package ru.vsu.math.java.entity;
import java.sql.*;

public abstract class SQLRecord implements Savable {
  public static final String dbName = "university";
  protected abstract String columnNames();
  protected abstract String values();
  protected abstract String tableName();
  protected abstract void buildObject(ResultSet row);

  public void loadCollection() {
    try {
      Class.forName("org.h2.Driver");
      Connection conn = DriverManager.
        getConnection("jdbc:h2:~/" + SQLRecord.dbName, "sa", "");

      String query = "SELECT * FROM students";

      Statement stmt = null;

      stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(query);

      while(rs.next()) {
        buildObject(rs);
      }
    } catch(Exception e) {
      e.printStackTrace();
    }

  }

  public void save() {
    try {
      Class.forName("org.h2.Driver");
      Connection conn = DriverManager.
        getConnection("jdbc:h2:~/" + SQLRecord.dbName, "sa", "");

      String query =
        "INSERT INTO " + tableName()
        + " " + columnNames() + " VALUES "
        + values();

      Statement stmt = null;

      stmt = conn.createStatement();
      stmt.executeUpdate(query);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
