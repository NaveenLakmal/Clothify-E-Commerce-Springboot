package edu.icet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Object> handleResponseStatusException(ResponseStatusException ex) {
        // Customize the response body with your error message and status
        return new ResponseEntity<>(
                new ErrorResponse(ex.getStatusCode().value(), ex.getReason()),
                ex.getStatusCode()
        );
    }

    // Create an error response structure
    private static class ErrorResponse {
        private int status;
        private String message;

        public ErrorResponse(int status, String message) {
            this.status = status;
            this.message = message;
        }

        // Getters and setters
        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }
    }
}
