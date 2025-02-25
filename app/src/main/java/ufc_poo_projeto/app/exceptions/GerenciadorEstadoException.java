package ufc_poo_projeto.app.exceptions;

public class GerenciadorEstadoException extends RuntimeException {
    public GerenciadorEstadoException(String msg) {
        super(msg);
    }

    public GerenciadorEstadoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
