public class Aluno{
    public String nome,matricula;
    public double nota1,nota2;

    public void aluno(){
    }
    public double Media(){
        return (nota1 + nota2) / 2;
    }
    public void aprovado(){
        if (Media() >= 6.0){
            System.out.println("Aluno"+nome+"aprovado");
        }
    }
    

}