package Q11;

import Q11.entidades.EnvioEmail;
import Q11.entidades.EnvioSMS;
import Q11.entidades.GestorMensagens;

public class Main {
    public static void main(String[] args) {
        EnvioEmail email = new EnvioEmail();
        EnvioSMS sms = new EnvioSMS();

        GestorMensagens.enviarMensagem(email, "Olá, bom dia!");
        GestorMensagens.enviarMensagem(sms, "Como vai?");
    }
}
