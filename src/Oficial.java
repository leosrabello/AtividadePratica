public class Oficial extends Funcionario{
    
    private String tipo;

    public Oficial(String nome, int idade, int mat) {

        super(nome, idade, mat);

    }

    public Oficial (String nome, int idade, int mat, String tipo){
         super(nome, idade, mat);
         this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumDist(String tipo) {
        this.tipo = tipo;
    }

    
}
