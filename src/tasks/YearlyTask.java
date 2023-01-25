package tasks;
import enums.Type;
import exeption.IncorrectArgumentExeption;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class YearlyTask extends Task {


    public YearlyTask(String title, Type type, String description, LocalDateTime dataTime)  {
        super(title, type, description, dataTime);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.isEqual(getDataTime().toLocalDate())  ||
                (localDate.getDayOfYear() == getDataTime().getDayOfYear() &&
                localDate.isAfter(getDataTime().toLocalDate()));
    }
}
