package ru.vsu.math.java;
import ru.vsu.math.java.entity.Group;

public class Seeder {
    public static void createData(Application app){
      String array[];

      Group group = app.addGroup(2, 3, 2);

      app.createStudent("Соловьев Дмитрий Николаевич", group);
      app.createStudent("Савенков Михаил Владиславович", group);
      app.createStudent("Новоселов Антон Григорьевич", group);
      app.createStudent("Шипилов Алексей Владимирович", group);
      app.createStudent("Шилин Семен Иванович", group);
      app.createStudent("Микляев Владислав Иванович", group);
      app.createStudent("Измайлова Марина Анатольевна", group);
      app.createStudent("Щеблыкина Ирина Владимировна", group);
      app.createStudent("Кольцова Карелия Бенедиктовна", group);
      app.createStudent("Ляхов Владислав Иванович", group);

      app.addTutor("Прядко Ирина Николаевна");
      app.addTutor("Бахтина Жанна Игоревна");
      app.addTutor("Зубова Светлана Петровна");

    };
}
