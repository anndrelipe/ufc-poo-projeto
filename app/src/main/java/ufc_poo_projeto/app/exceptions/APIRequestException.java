package ufc_poo_projeto.app.exceptions;

public class APIRequestException extends RuntimeException {
    public APIRequestException(String msg) {
        super(msg);
    }

    public APIRequestException(String msg, Throwable cause) {
        super(msg, cause);
    }
}