public class Iphone implements ReprodutorMusical, Telefonia, Internet {
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void caixaPostal() {
        System.out.println("Acessando caixa postal");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
