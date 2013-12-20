package ru.vsu.math.java.cli;
import ru.vsu.math.java.*;

public class ConsoleController {
  private Application app;
  private ConsoleReader reader;
  private ConsoleWriter writer;

  public ConsoleController(Application app) {
    this.app = app;
    this.reader = new ConsoleReader(app);
    this.writer = new ConsoleWriter(app);
  }

  public void run() {
    rootMenu();
  }

  private void rootMenu() {
    writer.printRootMenu();
    String result = reader.readRootMenuResult();
    runMenuAction(result);
    rootMenu();
  }

  public void runMenuAction(String result) {
    switch (result.charAt(0)) {
      case '1': writer.displayStudents(); break;
      case '2': writer.displayTutors(); break;
      case '3': writer.displayGroups(); break;
    }
  }

  private void addMenu() {
  }

  private void addStudent(Student student) {
  }

  private void displayStudent() {
  }
}
