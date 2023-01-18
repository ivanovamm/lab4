package exceptions;

public class FoodIsNotReadyException extends Exception{
    public FoodIsNotReadyException(String message){
        super(message);
    }
}
