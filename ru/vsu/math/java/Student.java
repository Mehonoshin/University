package ru.vsu.math.java;

public class Student extends FileRecord {
  private String fullName;
  private Integer studentId;
  private Integer groupId;

  public Student(String fullName, Integer studentId, Integer groupId) {
    this.fullName = fullName;
    this.studentId = studentId;
    this.groupId = groupId;
  };

  @Override
  protected String dataToSave() {
    return this.fullName + "|" + this.groupId + "|" + this.studentId;
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

  public Integer getGroupId() {
    return this.studentId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }
}
