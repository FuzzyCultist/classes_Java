public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("-------------------------------------------------");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "maria";
        aluno1.matricula = "12345678";
        aluno1.nota1 = 12.9;
        aluno1.nota2 = 42.80;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "joão";
        aluno2.matricula = "87654321";
        aluno2.nota1 = 33.12;
        aluno2.nota2 = 12.90;

        System.out.println(aluno1.Boletim());
        System.out.println("-------------------------------------------------");
        System.out.println(aluno2.Boletim());

    }
}
