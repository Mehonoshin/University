/**
 * Created with IntelliJ IDEA.
 * User: k2_32
 * Date: 15.11.13
 * Time: 10:22
 * To change this template use File | Settings | File Templates.
 * класс студентов
 */
public class Student extends FileRecord{
    private String fullName;
    private Integer studentId;
    private Integer groupId;
    public void group(){};

    //Конструктор
    public Student(String fullName, Integer studentId, Integer groupId){
          this.fullName=fullName;
          this.studentId=studentId;
          this.groupId=groupId;
    };

    // Данные для записи(значения полей), Override - нотация, служебная информация
    @Override
    protected String dataToSave(){
        return this.fullName + "|" + this.groupId + "|" + this.studentId;
    }

    protected String filename(){
        return "students.txt";
    }

    //Считывание  приватного поля
    public String getFullName(){
        return this.fullName;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setFullName(String fullName){
        this.fullName=fullName;
    }

    //Считывание  приватного поля
    public Integer getStudentId(){
        return this.studentId;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setStudentId(Integer  studentId){
        this.studentId = studentId;
    }

    //Считывание  приватного поля
    public Integer getGroupId(){
        return this.studentId;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setGroupId(Integer groupId){
        this.groupId = groupId;
    }
}
