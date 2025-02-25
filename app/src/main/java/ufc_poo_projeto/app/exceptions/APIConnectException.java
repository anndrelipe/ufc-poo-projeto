package ufc_poo_projeto.app.exceptions;

public class APIConnectException extends RuntimeException {
    public APIConnectException(String msg) {
        super(msg);
    }

    public APIConnectException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
