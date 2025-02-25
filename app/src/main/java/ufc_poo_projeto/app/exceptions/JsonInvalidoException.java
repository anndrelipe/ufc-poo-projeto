package ufc_poo_projeto.app.exceptions;

public class JsonInvalidoException extends ConversaoDeDadosException {
    public JsonInvalidoException(String msg) {
        super(msg);
    }

    public JsonInvalidoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
