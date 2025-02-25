package ufc_poo_projeto.app.exceptions;

public class ArquivoNaoEncontradoException extends RuntimeException {
    public ArquivoNaoEncontradoException(String msg) {
        super(msg);
    }

    public ArquivoNaoEncontradoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
