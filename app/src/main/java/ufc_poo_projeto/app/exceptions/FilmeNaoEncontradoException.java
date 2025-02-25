package ufc_poo_projeto.app.exceptions;

public class FilmeNaoEncontradoException extends RuntimeException {
    public FilmeNaoEncontradoException(String msg) {
        super(msg);
    }

    public FilmeNaoEncontradoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
