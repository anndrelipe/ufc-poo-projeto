package ufc_poo_projeto.app.exceptions;

public class EstadoNaoEncontradoException extends RuntimeException {
    public EstadoNaoEncontradoException(String msg) {
        super(msg);
    }

    public EstadoNaoEncontradoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
