package ufc_poo_projeto.app.exceptions;

public class ConversaoDeDadosException extends RuntimeException {
    public ConversaoDeDadosException(String msg) {
        super(msg);
    }

    public ConversaoDeDadosException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
