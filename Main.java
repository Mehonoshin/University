import java.io.*;

public class Main {

    public static void main(String[] args) {
        //Application app = new Application();
        //Seeder.createData(app); //заполнение данными
        //ConsoleController consoleController = new ConsoleController(app);
       // consoleController.run(); //запуск бесконечного эвента
       String file ="test.dat";
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        int i;
        for(i = 0; i < 7; i++){
            try {
                System.out.println("Значение " + i + " " + rf.readDouble());
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            try {
                System.out.println(rf.readUTF());
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        try {
            rf.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
