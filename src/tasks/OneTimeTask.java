package tasks;
import enums.Type;
import exeption.IncorrectArgumentExeption;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {
    public OneTimeTask(String title, Type type, String description, LocalDateTime dataTime)  {
        super(title, type, description, dataTime);
    }

    @Override
    public boolean appearsln(LocalDate localDate) {
        return localDate.isEqual(getDataTime().toLocalDate());
    }
}
