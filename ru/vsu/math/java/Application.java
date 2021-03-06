package ru.vsu.math.java;
import ru.vsu.math.java.entity.*;
import java.util.*;
import java.io.*;

public class Application {
  private List<Student> students = new ArrayList<Student>();
  private List<Group> groups = new ArrayList<Group>();
  private List<Tutor> tutors = new ArrayList<Tutor>();

  private static Application instance = null;
  public static Application getInstance() {
    if (instance == null) {
      instance = new Application();
      instance.loadCollections();
    }
    return instance;
  }

  protected Application() {
  }

  public void createStudent(String fullName, Group group) {
    addStudent(fullName, group).save();
  }

  public Student addStudent(String fullName, Group group) {
    Student student = new Student(fullName, group);
    students.add(student);
    return student;
  }

  public void addTutor(String fullName) {
    tutors.add(new Tutor(fullName));
  }

  public Group addGroup(Integer courseNumber, Integer groupNumber, Integer subGroupNumber) {
    Group group = new Group(courseNumber, groupNumber, subGroupNumber);
    groups.add(group);
    return group;
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
    // Грязный трюк, так делать не надо
    // напомнить объяснить почему
    Student studentLoader = new Student(null, null);
    studentLoader.loadCollection();
  }
}
