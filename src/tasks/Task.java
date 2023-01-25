package tasks;
import enums.Type;
import exeption.IncorrectArgumentExeption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task  {
    private static int idGenerator = 0;
    private String title;
    private Type type;
    private int id;
    private String description;
    private LocalDateTime dataTime;

    public Task(String title, Type type, String description, LocalDateTime dataTime) throws IncorrectArgumentExeption {
        setTitle(title);
        this.type = type;
        this.id = idGenerator++;
        setDescription(description);
        this.dataTime = dataTime;
    }
    public abstract boolean appearsln(LocalDate localDate);

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }
    public void setTitle(String title) throws IncorrectArgumentExeption {
        if((title == null || title.isBlank() || title.isEmpty())) {
        throw new RuntimeException("Проблемы с заголовком");
        } else {
        this.title = title;
    }
        }
    public void setDescription(String description) throws IncorrectArgumentExeption {
        if((description == null || description.isBlank() || description.isEmpty())) {
            throw new RuntimeException("Проблемы с описанием задачи");
        } else {
            this.description = description;
        }
    }
    public Type getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(title, task.title) && Objects.equals(type, task.type) && Objects.equals(dataTime, task.dataTime) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, id, dataTime, description);
    }

    @Override
    public String toString() {
        return "Задача: " + title +
                ", type: " + type +
                ", id: " + id +
                ", dataTime " + dataTime +
                ", описание " + description;
    }
}