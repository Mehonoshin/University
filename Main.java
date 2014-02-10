import java.io.*;
import ru.vsu.math.java.cli.*;
import ru.vsu.math.java.*;

public class Main {
  public static void main(String[] args) {
    Application app = Application.getInstance();
    Seeder.createData(app);

    ConsoleController consoleController = new ConsoleController(app);
    consoleController.run();
  }
}
