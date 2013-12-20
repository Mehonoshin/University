package ru.vsu.math.java;
import java.io.*;

public abstract class FileRecord implements Savable {
  protected abstract String filename();
  protected abstract String dataToSave();

  public void save() {
    String data =  dataToSave();
    File file = new File(filename());
  }

  public void delete() {
  }
}
