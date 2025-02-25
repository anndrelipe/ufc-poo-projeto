package ufc_poo_projeto.app.exceptions;

public class DadosInvalidosException extends RuntimeException {
    public DadosInvalidosException(String msg) {
        super(msg);
    }

    public DadosInvalidosException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
