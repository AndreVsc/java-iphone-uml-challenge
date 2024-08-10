import AltoFalante.AltoFalante;
import Navegador.Navegador;
import Telefone.Telefone;

public class Iphone implements AltoFalante, Telefone, Navegador {

    @Override
    public void tocar() {
        System.out.println("Trim! Trim! Trim");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}
