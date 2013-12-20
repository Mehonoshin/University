package ru.vsu.math.java;
import ru.vsu.math.java.entity.*;
import java.util.*;
import java.io.*;

public class Application {
  private List<Student> students = new ArrayList<Student>();
  private List<Group> groups = new ArrayList<Group>();
  private List<Tutor> tutors = new ArrayList<Tutor>();

  public Application() {
    loadCollections();
  }

  public void addStudent(String fullName, Integer studentId, Integer groupId) {
    Student student = new Student(fullName, studentId, groupId);
    students.add(student);
    //student.save();
  }

  public void addTutor(String fullName) {
    tutors.add(new Tutor(fullName));
  }

  public void addGroup(Integer courseNumber, Integer groupNumber, Integer subGroupNumber) {
    groups.add(new Group(courseNumber, groupNumber, subGroupNumber));
  }

  public List getStudents() {
    return this.students;
  }

  public List getTutors() {
    return this.tutors;
  }

  public List getGroups() {
    return this.groups;
  }

  private void loadCollections() {
    loadStudents();
  }

  private void loadStudents() {
    try {
      RandomAccessFile file = new RandomAccessFile("students.txt", "rw");
      long pointer = 0;
      file.seek(pointer);
      while (pointer < file.length()) {
        System.out.println(file.readUTF());
      }
    } catch(EOFException e) {
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
