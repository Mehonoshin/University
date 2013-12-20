import java.io.*;
import ru.vsu.math.java.cli.*;
import ru.vsu.math.java.*;

public class Main {
  public static void main(String[] args) {
    Application app = new Application();
    Seeder.createData(app);

    ConsoleController consoleController = new ConsoleController(app);
    consoleController.run();
  }
}
