/**
 * Created with IntelliJ IDEA.
 * User: k2_32
 * Date: 13.12.13
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;

public abstract class FileRecord implements Savable {
    public void save(){
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
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public void delete(){
      //удаление записи из файла
    }

    protected abstract String filename();

    // Данные для записи(значения полей)
    protected abstract String dataToSave();
}
