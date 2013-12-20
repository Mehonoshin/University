import java.io.*;

public abstract class FileRecord implements Savable {
  protected abstract String filename();
  protected abstract String dataToSave();

  public void save() {
    String data =  dataToSave();
    File file = new File(filename());
    try {
      RandomAccessFile fleS = new RandomAccessFile (file,"rw");
      System.out.println("printing " + dataToSave());
      try {
        fleS.writeUTF(dataToSave());
        fleS.writeUTF("Test");
        fleS.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
  }

  public void delete() {
  }
}
