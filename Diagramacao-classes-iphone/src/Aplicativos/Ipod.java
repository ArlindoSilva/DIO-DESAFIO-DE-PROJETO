package Aplicativos;
import Aparelhos.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
       System.out.println("pausar musica");
    }

    
    @Override
    public String selecionarMusica(String musica1) {
        System.out.println("Selecionando a musica " + musica1);
        return musica1;
    }
    
}
