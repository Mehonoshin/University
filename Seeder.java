/**
 * Created with IntelliJ IDEA.
 * User: k2_32
 * Date: 29.11.13
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public class Seeder {
    public static void createData(Application app){

        String array[];
        app.addStudent("Соловьев Дмитрий Николаевич",null,null);
        app.addStudent("Савенков Михаил Владиславович",null,null);
        app.addStudent("Новоселов Антон Григорьевич",null,null);
        app.addStudent("Шипилов Алексей Владимирович",null,null);
        app.addStudent("Шилин Семен Иванович",null,null);
        app.addStudent("Микляев Владислав Иванович",null,null);
        app.addStudent("Измайлова Марина Анатольевна",null,null);
        app.addStudent("Щеблыкина Ирина Владимировна",null,null);
        app.addStudent("Кольцова Карелия Бенедиктовна",null,null);
        app.addStudent("Ляхов Владислав Иванович",null,null);

        app.addTutor("Прядко Ирина Николаевна");
        app.addTutor("Бахтина Жанна Игоревна");
        app.addTutor("Зубова Светлана Петровна");

        app.addGroup(2,3,2);
    };
}
