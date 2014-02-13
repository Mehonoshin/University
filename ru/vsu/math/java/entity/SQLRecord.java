package ru.vsu.math.java.entity;
import java.sql.*;

public abstract class SQLRecord implements Savable {
  public static final String dbName = "university";
  protected abstract void buildObject(String[] data);

  public void loadCollection() {
  }

  public void save() {
  }
}
