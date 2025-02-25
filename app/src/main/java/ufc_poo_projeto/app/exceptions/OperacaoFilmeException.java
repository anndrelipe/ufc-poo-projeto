package ufc_poo_projeto.app.exceptions;

public class OperacaoFilmeException extends RuntimeException {
    public OperacaoFilmeException(String msg) {
        super(msg);
    }

    public OperacaoFilmeException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
