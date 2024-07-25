import Aplicativos.Ipod;
import Aplicativos.Safari;
import Aplicativos.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        
        System.out.println("Utilizando o Ipod");
        String musica1 = " Garota de Ipanema";
        ipod.selecionarMusica(musica1); 
        ipod.tocar();
        ipod.pausar();
        System.out.println("");
        
        Safari navegador = new Safari();
        System.out.println("Utilizando o Safari");
        String url = "https://web.dio.me";
        navegador.exibirPagina(url);
        navegador.atualizarpagina();
        navegador.adicionarNovaAba();
        System.out.println("");
        
        Telefone telefone = new Telefone();
        System.out.println("Utilizando o Telefone");
        String numero = "99887766";
        telefone.ligar(numero);
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
      
       
    }

    
}
