package ru.vsu.math.java.entity;
import ru.vsu.math.java.entity.Group;
import ru.vsu.math.java.*;
import java.sql.*;

public class Student extends SQLRecord {
  private String fullName;
  private Integer studentId;
  private Group group;

  public Student(String fullName, Group group) {
    this.fullName = fullName;
    this.studentId = 1;
    this.group = group;
  };

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Integer getStudentId() {
    return this.studentId;
  }

  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  @Override
  protected String tableName() {
    return "students";
  }

  @Override
  protected String columnNames() {
    return "(fullname, group_id)";
  }

  @Override
  protected String values() {
    return "('" + fullName + "', 1)";
  }

  @Override
  protected void buildObject(ResultSet row) {
    try {
      Application.getInstance().addStudent(row.getString("fullname"), null);
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
}
