package exeption;

public class IncorrectArgumentExeption extends RuntimeException{
    private String argument;

    public IncorrectArgumentExeption(String message){
        super(message);
        this.argument = argument;
    }
}
