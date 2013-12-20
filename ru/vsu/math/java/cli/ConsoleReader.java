package ru.vsu.math.java.cli;
import ru.vsu.math.java.*;
import java.io.*;

public class ConsoleReader {
    private Application app;
    private BufferedReader stdIn;

    public ConsoleReader(Application app) {
      this.app = app;
      this.stdIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readRootMenuResult() {
      return readResult();
    }

    public String readResult() {
      String result = "";
      try {
        result = stdIn.readLine();
      } catch(Exception IO) {
      };
      return result;
    }

    public void readStudent() {
    }
}
