public class Car {

    public String marca,modelo; 
    public int ano;
    private double velocidade = 0.0;

    public Car(){
    }

    public void frear(double diminui ){
        velocidade -= diminui;
        if (velocidade < 0.0){
            velocidade = 0.0;
        };
    };

    public void acelerar (double aumenta){
        velocidade += aumenta;
    };

    public String retornoDados(){
       return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nVelocidade: " + velocidade;
    };
};
