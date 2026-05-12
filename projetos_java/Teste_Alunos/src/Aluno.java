public class Aluno{
    public String nome,matricula;
    public double nota1,nota2;

    public void aluno(){
    }
    public double Media(){
        return (nota1 + nota2) / 2;
    }
    public void Aprovado(){
        if (Media() >= 6.0){
            System.out.println("Aluno "+nome+" aprovado");
        }
        else{
            Sysem.out.println("Aluno "+nome+" Reprovado")
        }
    }
    public void Boletim(){
        return "Nome: "+nome+" Matricula: "+matricula+" nota 1: "+nota1+" nota 2: "+nota2+" sua Média é: "+Media+" Está: "+Aprovado;
    }

}
