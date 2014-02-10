package ru.vsu.math.java;
import ru.vsu.math.java.entity.Group;

public class Seeder {
    public static void createData(Application app){
      String[] studentNames = {
        "Соловьев Дмитрий Николаевич",
        "Савенков Михаил Владиславович",
        "Новоселов Антон Григорьевич",
        "Шипилов Алексей Владимирович",
        "Шилин Семен Иванович",
        "Микляев Владислав Иванович",
        "Измайлова Марина Анатольевна",
        "Щеблыкина Ирина Владимировна",
        "Кольцова Карелия Бенедиктовна",
        "Ляхов Владислав Иванович"
      };

      Group group = app.addGroup(2, 3, 2);

      // Создаем студентов, только если их список пуст
      // A cписок бывает пустым только когда в файле ничего нет
      if (app.getStudents().isEmpty()) {
        for (String name : studentNames) {
          app.createStudent(name, group);
        }
      }

      app.addTutor("Прядко Ирина Николаевна");
      app.addTutor("Бахтина Жанна Игоревна");
      app.addTutor("Зубова Светлана Петровна");
    };
}
