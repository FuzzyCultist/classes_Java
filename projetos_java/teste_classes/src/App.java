public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car carroNovo = new Car ();
        carroNovo.marca = "Hyundai";
        carroNovo.modelo = "Hb20";
        carroNovo.ano = 2023;
        carroNovo.acelerar(45.0);
        carroNovo.frear(10.0);
    
        Car carro2 = new Car();
        carro2.marca = "Fiat";
        carro2.modelo = "Mobi";
        carro2.ano = 2020;
        carro2.acelerar(80.0);
        carro2.frear(15.0);
        
        System.out.println(carroNovo.retornoDados());
        System.out.println("=====================================");
        System.out.println(carro2.retornoDados());
}
}
