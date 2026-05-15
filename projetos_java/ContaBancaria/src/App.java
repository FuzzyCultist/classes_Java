public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Conta contaCarlos = new Conta();
        contaCarlos.Titular = "Carlos";
        contaCarlos.NumeroConta = "123456-7";
        contaCarlos.Saldo = 1000.00;
        contaCarlos.Depositar(500.00);
        contaCarlos.Sacar(200.00);
        contaCarlos.extrato();

    }
}
