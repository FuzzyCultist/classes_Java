public class Produto {
    
    public Produto () {
    };
    public String nome;
    public double preco;
    public int quantidade;
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    };
    public int vender(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println("Quantidade vendida do item "+nome+": " + quantidadeVendida+" unidades. Estoque atual: " + quantidade);
            return quantidadeVendida;
        } else {
            quantidade = 0;
            System.out.println("Quantidade vendida do item "+nome+": " + quantidadeVendida+" unidades. Estoque atual: " + quantidade);
            return quantidadeVendida;
        }
    };
    public int repor(int quantidadeReposta) {
        quantidade += quantidadeReposta;
        System.out.println("Quantidade reposta do item "+nome+": " + quantidadeReposta+" unidades. Estoque atual: " + quantidade);
        return quantidade;
    };
    public double calcularValorTotal() {
        return preco * quantidade;
    };
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
    
    };

}
