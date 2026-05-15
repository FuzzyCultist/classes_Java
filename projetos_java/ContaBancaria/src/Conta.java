public class Conta{
    public String Titular;
    public String NumeroConta;
    public double Saldo;

    public void Depositar(double valor){
        Saldo = Saldo + valor;
    }

    public void Sacar(double valor){
        Saldo = Saldo - valor;
    }
    public void extrato(){
        System.out.println("********************************");
        System.out.println("Titular: " + Titular);
        System.out.println("Número da Conta: " + NumeroConta);
        System.out.println("Saldo: " + Saldo);
        System.out.println("********************************");
    }   

};