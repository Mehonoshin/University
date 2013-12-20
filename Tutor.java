/**
 * Created with IntelliJ IDEA.
 * User: k2_32
 * Date: 15.11.13
 * Time: 10:23
 * To change this template use File | Settings | File Templates.
 * класс преподавателя
 */
public class Tutor {
    private String fullName;
    //private List doubleClasses;

    public Tutor(String fullName){
        this.fullName=fullName;

    };

    //Считывание  приватного поля
    public String getFullName(){
        return this.fullName;
    }

    //Передача параметра и присваивание значение приватному полю
    public void setFullName(String fullName){
        this.fullName=fullName;
    }

}
