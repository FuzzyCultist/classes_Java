public class Filme{
    
    public String titulo,diretor;
    public int duracao,ano;
    public double nota;

    private int DuracaoFormatada(int hora, int minuto){
        hora = duracao/60;
        
        return hora minuto;
        

     

    }

    public String  Avalicao(){
        String avaliacao;
        if ( nota <= 7.0  ){
            avaliacao =  "Filme Não Recoemdado";
        } else {
            avaliacao = "Filme Recomendado :)";
        };
        return avaliacao;

    }
    public void Detalhes(){
        System.out.println("-----------------------------");
        System.out.println("o filme se chama "+ Titulo);
        System.out.println("o diretor do filme é "+Diretor);
       
        System.out.println("-----------------------------");
        
    }




};