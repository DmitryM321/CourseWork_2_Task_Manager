package tasks;
import enums.Type;
import exeption.IncorrectArgumentExeption;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class WeeklyTask extends Task {
    public WeeklyTask(String title, Type type, String description, LocalDateTime dataTime) {
        super(title, type, description, dataTime);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.isEqual(getDataTime().toLocalDate()) ||
               localDate.getDayOfWeek() == getDataTime().getDayOfWeek() &&
               localDate.isAfter(getDataTime().toLocalDate());
    }
}
