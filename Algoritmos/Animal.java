public class Animal {
        private String nome;
        private String raca;
        private int idade;
        
        public Animal(String nome, String raca, int idade) {        
            this.nome = nome; 
            this.raca = raca;
            this.idade = idade;
        }

        public String getNome(){   
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome; 
        }

        public String getRaca(){
            return raca;
        }

        public void setRaca(String raca){
            this.raca = raca;
        }

        public int getIdade(){
            return idade; 
        }

        public void setIdade(int idade){
            this.idade = idade;
        }

        public void emitirSom(){
            System.out.println("Está emitindo um som");
        }

        public void andar(){
            System.out.println("Está andando");
        }

        public void dormir(int horas){
            System.out.println("e dorme " + horas + " horas por dia");
        }

        public void status(String doenca){
            System.out.println("Animal se encontra com quadro de " + doenca + "!");
        }

        public void tratar(String tratamento){
            System.out.println("Recomendado que faça " + tratamento);
        }
}
