package Q11.entidades;

public interface EnvioMensagem {
    boolean enviar(String mensagem);

    String obterStatus();
}