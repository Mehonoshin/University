import java.util.*;

//Класс приложения
public class Application {
    private List<Student> students = new ArrayList<Student>();
    private List<Group> groups = new ArrayList<Group>();
    private List<Tutor> tutors = new ArrayList<Tutor>();

    public void addStudent(String fullName, Integer studentId, Integer groupId){
        Student student = new Student(fullName, studentId, groupId);
        students.add(student);
        student.save();
    }

    public void addTutor(String fullName){
        tutors.add(new Tutor(fullName));
    }

    public void addGroup(Integer courseNumber, Integer groupNumber, Integer subGroupNumber){
        groups.add(new Group(courseNumber, groupNumber, subGroupNumber));
    }



    //геттер для списка студентов
    public List getStudents(){
          return this.students;
    }
    //геттер для списка преподавателей
    public List getTutors() {return this.tutors;}
    //геттер для списка групп
    public List getGroups() {return this.groups;}

    public Application(){
        loadCollections();
    }

    private void loadCollections(){
        loadStudents();
    }

    private void loadStudents() {
        // Читаем из файла все записи
        // Для каждой создаем студента
    }

}
