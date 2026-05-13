public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

      Produto miojo = new Produto();
        miojo.nome = "Miojo";
        miojo.preco = 3.50;
        miojo.quantidade = 100;
      Produto caneta = new Produto();
        caneta.nome = "Caneta Bic Azul";
        caneta.preco = 2.50;
        caneta.quantidade = 200;

    miojo.vender(12);
    miojo.repor(20);
    miojo.exibirInformacoes();
    miojo.calcularValorTotal();
    System.out.println("--------------------------------------------------");
    caneta.vender(30);
    caneta.repor(50);
    caneta.exibirInformacoes();
    caneta.calcularValorTotal();
    
    
    

    }
}
