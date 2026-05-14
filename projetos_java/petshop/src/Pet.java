public class Pet {
    
    public String nome;
    public String tipo;
    public int idade;
    public String raca;
    public double peso;

    public int aniversario(){
        return idade + 1;
    }
    public void Apresentar(){
        System.out.println("o pet se chama: " + nome + ", ele é um: " + tipo + " da raça " + raca + ", possui " + idade + " anos e pesa " + peso + " kg.");
    }
    public double pesoIdeal(double pesoIdeal){ 
        if (  peso < pesoIdeal){
            System.out.println("O pet está abaixo do peso ideal.");
        } else if (peso > pesoIdeal){
            System.out.println("O pet está acima do peso ideal.");
        } else {
            System.out.println("O pet está no peso ideal.");
        }
        return pesoIdeal;
    }
}
