/**
 * Created with IntelliJ IDEA.
 * User: k2_32
 * Date: 15.11.13
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 * //класс пары
 */
public class DoubleClass {
    private Integer groupId;
    private Integer weekday;
    private Integer doubleClassNumber;
    private Integer tutorId;

    public DoubleClass(Integer groupId, Integer weekday, Integer doubleClassNumber, Integer tutorId){
        this.groupId=groupId;
        this.weekday=weekday;
        this.doubleClassNumber=doubleClassNumber;
        this.tutorId=tutorId;                        x
    };

    //Считывание  приватного поля
    public Integer getGroupId(){
        return this.groupId;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setGroupId(Integer groupId){
        this.groupId = groupId;
    }

    //Считывание  приватного поля
    public Integer getWeekday(){
        return this.weekday;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setWeekday(Integer weekday){
        this.weekday = weekday;
    }

    //Считывание  приватного поля
    public Integer getDoubleClassNumber(){
        return this.doubleClassNumber;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setDoubleClassNumber(Integer doubleClassNumber){
        this.doubleClassNumber = doubleClassNumber;
    }

    //Считывание  приватного поля
    public Integer getTutorId(){
        return this.groupId;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setTutorId(Integer tutorId){
        this.tutorId = tutorId;
    }

}
