package exeption;

public class IncorrectArgumentExeption extends Exception{
    private String argument;

    public IncorrectArgumentExeption(String message){
        super(message);
        this.argument = argument;
    }
}
