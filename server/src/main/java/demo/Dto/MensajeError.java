package demo.Dto;

import java.time.LocalDateTime;

public class MensajeError {

    private LocalDateTime date;
    private String exeption;
    private String message;

    public MensajeError(LocalDateTime date, String exeption, String message) {
        this.date = date;
        this.exeption = exeption;
        this.message = message;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public String getExeption(){
        return exeption;
    }

    public String getMessage(){
        return message;
    }

    public String toString(){
        return "Error Message{"+
                "dateTime:'"+date+'\''+
                "exception:'"+exeption+'\''+
                ", message:'"+message+'\''+
                '}';
}
}