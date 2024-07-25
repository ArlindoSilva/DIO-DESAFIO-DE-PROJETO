package Aplicativos;
import Aparelhos.NavegadorDeInternet;

public class Safari implements NavegadorDeInternet {

    @Override
    public String exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
        return url;
    
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarpagina() {
        System.out.println("Atualizando a pagina");
    }
    
}
