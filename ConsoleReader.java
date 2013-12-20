import java.io.*;

/**
 * Created by Дмитрий on 05.12.13.
 */
public class ConsoleReader {

    private BufferedReader stdIn;
    private Application app;
    public ConsoleReader(Application app){
        this.app = app;
        this.stdIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readRootMenuResult(){
        return readResult();

    }

    public String readResult(){
        String result = "";
        try{
            result = stdIn.readLine();
        } catch(Exception IO){};

        return  result;
    }

    public void readStudent(){
     //Читаем из stdIn ФИО студента,номер группы,номер студента
     //app.addStudent()
    }
}
