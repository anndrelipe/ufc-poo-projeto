package ufc_poo_projeto.app.exceptions;

public class ValidacaoUsuarioException extends RuntimeException {
    public ValidacaoUsuarioException(String msg) {
        super(msg);
    }

    public ValidacaoUsuarioException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
