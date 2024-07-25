package Aplicativos;
import Aparelhos.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public String ligar(String numero) {
        System.out.println("Discando o numero " + numero + " e ligando");
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
