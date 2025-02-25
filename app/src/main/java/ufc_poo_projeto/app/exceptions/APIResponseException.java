package ufc_poo_projeto.app.exceptions;

public class APIResponseException extends RuntimeException {
    public APIResponseException(String msg) {
        super(msg);
    }

    public APIResponseException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
