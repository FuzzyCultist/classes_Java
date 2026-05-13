public class Aluno{
  
    public String nome,matricula;
    public double nota1,nota2;

    public Aluno(){
        
    }
    public void Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    private double Media(){
         return (nota1 + nota2) / 2;
        
    }
    
    public String Boletim() {
        double resultado = Media();
        return "Nome: " + nome + " Matricula: " + matricula + " nota 1: " + nota1 + " nota 2: " + nota2 + " sua Média é: " + resultado + " Está: " + Aprovado();
    }

    private String Aprovado(){
        double resultado = Media(); 
        if ( resultado >= 6.0){
            System.out.println("Aluno "+nome+" aprovado");
            return "Aprovado";
        }
        else{
            System.out.println("Aluno "+nome+" Reprovado");
            return "Reprovado";
        }
    }

}
