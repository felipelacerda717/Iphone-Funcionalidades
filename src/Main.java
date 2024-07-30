public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Testar reprodutor musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música 1");

        System.out.println("Testar telefonia");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.caixaPostal();

        System.out.println("Testar internet");
        iphone.exibirPagina("www.google.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();
    }
}