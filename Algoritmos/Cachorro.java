public class Cachorro {
        private String nome;
        private int idade;
        private int peso;
        
        public Cachorro(String nome, int idade, int peso) {        
            this.nome = nome; 
            this.idade = idade;
            this.peso = peso;
        }

        public String getNome(){   
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome; 
        }

        public int getIdade(){
            return idade; 
        }

        public void setIdade(int idade){
            this.idade = idade;
        }

         public int getPeso(){
            return peso;
        }

        public void setpeso(int peso){
            this.peso = peso;
        }

        public void latir(int tempo){
            System.out.println("Está latindo" + "a" + tempo);
        }

        public void correr(){
            System.out.println("Está correndo atrás das pessoas da rua!");
        }

        public void comer(String marca){
            System.out.print("Está comendo somente ração cara " + "da " + marca + " ");
        }
}

