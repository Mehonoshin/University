package ru.vsu.math.java.entity;
import ru.vsu.math.java.entity.Group;
import ru.vsu.math.java.*;

public class Student extends FileRecord {
  public static int nextStudentId = 1;
  private String fullName;
  private Integer studentId;
  private Group group;

  public static int getNewStudentId() {
    int id = Student.nextStudentId;
    Student.nextStudentId++;
    return id;
  }

  public Student(String fullName, Group group) {
    this.fullName = fullName;
    this.studentId = Student.getNewStudentId();
    this.group = group;
  };

  @Override
  protected String dataToSave() {
    return this.fullName + "|" + this.group.toString() + "|" + this.studentId + "\n";
  }

  @Override
  protected void buildObject(String[] data) {
    Application.getInstance().addStudent(data[0], null);
  }

  protected String filename() {
    return "students.txt";
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Integer getStudentId() {
    return this.studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
  }

  public Group getGroup() {
    return this.group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }
}
