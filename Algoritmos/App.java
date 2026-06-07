public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", "PitBull", 20);
        Cachorro dog = new Cachorro("Alfred", 10, 20);

        System.out.println(animal.getNome() + " que se chama " + dog.getNome() + " tem " + dog.getIdade() + " anos de idade " + "com peso de " + dog.getPeso() + " kg");
        dog.comer("Quatree");
        animal.dormir(10);
        animal.status("Obesidade");
        animal.tratar("exercícios todos os dias, como caminhar na rua por 1 hora ao dia pela manhã em jejum");

    }
}
