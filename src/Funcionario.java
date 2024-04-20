class Funcionario {
    
    private String nome;
    private int idade;
    private int numDist;

    public Funcionario() {}
    
    public Funcionario(String nome, int idade, int numDist) {

        this.nome = nome;
        this.idade = idade;
        this.numDist = numDist;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumDist() {
        return numDist;
    }

    public void setNumDist(int numDist) {
        this.numDist = numDist;
    }

    @Override
    public String toString() {

        return "\nNome: " + nome + "\nIdade: " + idade + "\nNúmero de Distintivo: " + numDist;

    }
}
