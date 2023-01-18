package exceptions;

public class WrongName extends RuntimeException{
    public WrongName(String name){
            super(name);
        }
}

