/**
 * Created by Дмитрий on 05.12.13.
 */
public class ConsoleController {

    private ConsoleReader reader;
    private ConsoleWriter writer;
    private Application app;

    public ConsoleController(Application app){
        this.app = app;
        this.reader = new ConsoleReader(app);
        this.writer = new ConsoleWriter(app);
    }
    //Запускает бесконечный event-loop
    public void run(){
      rootMenu();
    }

    private void rootMenu(){
      writer.printRootMenu(); //меню
      String result = reader.readRootMenuResult(); //  чтение строки
      runMenuAction(result);
      rootMenu();

    }

    public void runMenuAction(String result){
        switch (result.charAt(0)){
            case '1': writer.displayStudents(); break;
            case '2': writer.displayTutors(); break;
            case '3': writer.displayGroups(); break;
        }
    }

    private void addMenu(){}


    private void addStudent(Student student){
       // student = reader.readStudent();
        //writer.displayStudents();
    }

    private void displayStudent(){}


}
