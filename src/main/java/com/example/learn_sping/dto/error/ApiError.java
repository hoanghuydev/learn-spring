package com.example.learn_sping.dto.error;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;
import java.util.Map;
@Getter
@Setter
public class ApiError {
    private LocalDateTime timestamp;
    private int status;
    private String message;
    private Object details;

    public ApiError(HttpStatus status, String message, Object details) {
        this.timestamp = LocalDateTime.now();
        this.status = status.value();
        this.message = message;
        this.details = details;
    }
}
