import enums.Type;
import exeption.IncorrectArgumentExeption;
import exeption.TaskNotFoundExeption;
import tasks.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args)  {
    DailyTask dailyTask = new DailyTask("Ежедневная 1", Type.PERSONAL, "Задача 1", LocalDateTime.of(2023, 03, 15, 12, 12));
    WeeklyTask weeklyTask = new WeeklyTask("Еженедельная 2", Type.WORK, "Задача 2", LocalDateTime.of(2023, 03, 15, 13, 12));
    MonthlyTask monthlyTask = new MonthlyTask("Ежемесячная 3", Type.WORK, "Задача 3", LocalDateTime.of(2023, 03, 15, 14, 12));
    YearlyTask yearlyTask = new YearlyTask("Ежегодная 4", Type.PERSONAL, "Задача 4", LocalDateTime.of(2023, 03, 15, 15, 12));
    OneTimeTask oneTimeTask = new OneTimeTask("Разовая 5", Type.PERSONAL, "Задача 5", LocalDateTime.of(2023, 03, 15, 16, 12));

    TaskService taskService = new TaskService();
    taskService.add(dailyTask);
    taskService.add(weeklyTask);
    taskService.add(monthlyTask);
    taskService.add(yearlyTask);
    taskService.add(oneTimeTask);

    System.out.println(taskService.getAllByDate(LocalDate.of(2023, 03, 15)));
    System.out.println(taskService.getAllByDate(LocalDate.of(2023, 03, 16)));
    System.out.println(taskService.getAllByDate(LocalDate.of(2023, 03, 22)));
    System.out.println(taskService.getAllByDate(LocalDate.of(2023, 04, 15)));
    System.out.println(taskService.getAllByDate(LocalDate.of(2024, 03, 14)));
    System.out.println("____________________");
        try {
            OneTimeTask oneTimeTask1 = new OneTimeTask("Разовая 6", Type.PERSONAL, " ", LocalDateTime.of(2023, 03, 15, 16, 12));
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }

       try {
           taskService.remove(0);
       }catch (TaskNotFoundExeption ex){
    System.out.println("Для удаления нет задачи с данным id");
       }
    System.out.println(taskService.getAllByDate(LocalDate.of(2023, 03, 15)));
    }
}

