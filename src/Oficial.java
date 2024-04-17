public class Oficial extends Funcionario{
    
    private String tipo;

    public Oficial(String nome, int idade, int numDist) {

        super(nome, idade, numDist);

    }

    public Oficial (String nome, int idade, int numDist, String tipo){
         super(nome, idade, numDist);
         this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
