public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("------------------------------------\n");

        Pet pet1 = new Pet();
        pet1.nome = "Rex";
        pet1.tipo = "Cachorro";
        pet1.idade = 5;
        pet1.raca = "Labrador";
        pet1.peso = 30.5;
        pet1.Apresentar();
        System.out.println("O pet fará aniversário e terá " + pet1.aniversario() + " anos.");
        pet1.pesoIdeal(28.0);
        System.out.print("------------------------------------\n");

        Pet pet2 = new Pet();
        pet2.nome = "Rafaella";
        pet2.tipo = "Gato";
        pet2.idade = 12;
        pet2.raca = "Amarela";
        pet2.peso = 5.0;
        pet2.Apresentar();
        System.out.println("O pet fará aniversário e terá " + pet2.aniversario() + " anos.");
        pet2.pesoIdeal(5);
        System.out.print("------------------------------------\n");
    }
}
