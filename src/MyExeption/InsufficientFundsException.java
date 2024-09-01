package MyExeption;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(String message){
        super(message);
    }

    public InsufficientFundsException(){
        super();
    }
}
