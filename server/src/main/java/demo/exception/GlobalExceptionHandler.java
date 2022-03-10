package demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import demo.Dto.ErrorDetalles;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetalles> manejarResourceNotFoundException(ResourceNotFoundException exception , WebRequest webRequest)
    {
        ErrorDetalles erroDetalles = new ErrorDetalles(new Date(),exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(erroDetalles,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SalesException.class)
    public ResponseEntity<ErrorDetalles> manejarSalesException(SalesException exception, WebRequest webRequest)
    {
        ErrorDetalles erroDetalles = new ErrorDetalles(new Date(), exception.getMensaje(),webRequest.getDescription(false));
        return new ResponseEntity<>(erroDetalles, exception.getEstado());

    }

    @ExceptionHandler(ResourceRepeatIdException.class)
    public ResponseEntity<ErrorDetalles> manejarResourceRepeatIdException(ResourceNotFoundException exception,WebRequest webRequest)
    {
        ErrorDetalles errorDetalles = new ErrorDetalles(new Date(), exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetalles, HttpStatus.CONFLICT);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetalles> manejarException(Exception exception, WebRequest webRequest)
    {
        ErrorDetalles erroDetalles = new ErrorDetalles(new Date(), exception.getMessage(), webRequest.getDescription(false));
        
        return new ResponseEntity<>(erroDetalles,HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
}
