package ufc_poo_projeto.app.exceptions;

public class APIException extends RuntimeException {
    public APIException(String msg) {
        super(msg);
    }

    public APIException(String msg, Throwable cause) {
        super(msg, cause);
    }
}