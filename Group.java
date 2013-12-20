/**
 * Created with IntelliJ IDEA.
 * User: k2_32
 * Date: 15.11.13
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 * класс группы
 */
public class Group {
    private Integer courseNumber;
    private Integer groupNumber;
    private Integer subGroupNumber;
    //private List students;
    //public String toString(){};

    public Group(Integer courseNumber, Integer groupNumber, Integer subGroupNumber){
           this.courseNumber=courseNumber;
           this.groupNumber=groupNumber;
           this.subGroupNumber=subGroupNumber;
    };

    //Считывание  приватного поля
    public Integer getCourseNumber(){
        return this.courseNumber;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setCourseNumber(Integer courseNumber){
        this.courseNumber = courseNumber;
    }

    //Считывание  приватного поля
    public Integer getGroupNumber(){
        return this.groupNumber;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setGroupNumber(Integer groupNumber){
        this.groupNumber = groupNumber;
    }

    //Считывание  приватного поля
    public Integer getSubGroupNumber(){
        return this.subGroupNumber;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setSubGroupNumber(Integer subGroupNumber){
        this.courseNumber = subGroupNumber;
    }
}
