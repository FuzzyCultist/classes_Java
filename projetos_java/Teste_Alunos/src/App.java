public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Aluno aluno1 = new Aluno();
        aluno1.Aluno("João", "12345");
        aluno1.nota1 = 12.9;
        aluno1.nota2 = 42.80;

        Aluno aluno2 = new Aluno();
        aluno2.Aluno("jose","23546798");
        aluno2.nota1 = 33.12;
        aluno2.nota2 = 12.90;

        System.out.println(aluno1.Boletim());
        System.out.println(aluno2.Boletim());

    }
}
