package com.makaia.clinic.exceptions;

import org.springframework.http.HttpStatusCode;

public class ClinicApiException extends RuntimeException {
    private HttpStatusCode code;

    public ClinicApiException(String message) {
        super(message);
    }

    public ClinicApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClinicApiException(String message, Throwable cause, HttpStatusCode code) {
        super(message, cause);
        this.code = code;
    }

    public ClinicApiException(String message, HttpStatusCode code) {
        super(message);
        this.code = code;
    }

    public HttpStatusCode getCode() {
        return code;
    }
}
