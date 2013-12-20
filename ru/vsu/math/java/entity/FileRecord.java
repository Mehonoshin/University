package ru.vsu.math.java.entity;
import java.io.*;

public abstract class FileRecord implements Savable {
  protected abstract String filename();
  protected abstract String dataToSave();

  public void save() {
    File file = new File(filename());

    try {
      RandomAccessFile stream = new RandomAccessFile(file, "rw");

      long lastPosition = stream.length();
      stream.seek(lastPosition);

      stream.writeUTF(dataToSave());
      stream.close();
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  public void delete() {
  }
}
